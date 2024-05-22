package model.Animal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AnimalDao {
    private Connection connection;

    public AnimalDao(Connection connection) {
        this.connection = connection;
    }

    public List<AnimalVo> getAllAnimals() throws SQLException {
        List<AnimalVo> animals = new ArrayList<>();
        String query = "SELECT * FROM animal";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                int id = resultSet.getInt("idanimal");
                String name = resultSet.getString("nombre");
                int edad = resultSet.getInt("edad");
                int  altura= resultSet.getInt("altura");
                String cuernos = resultSet.getString("cuernos");
                String sexo = resultSet.getString("sexo");
                AnimalVo animal = new AnimalVo(id, name, edad, altura, cuernos, sexo);
                animals.add(animal);
            }
        }
        return animals;
    }

    public AnimalVo getAnimalById(int id) throws SQLException {
        String query = "SELECT * FROM animal WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    int idAnimal = resultSet.getInt("idanimal");
                    String nombre = resultSet.getString("nombre");
                    int edad = resultSet.getInt("edad");
                    int altura = resultSet.getInt("altura");
                    String cuernos = resultSet.getString("cuernos");
                    String sexo = resultSet.getString("sexo");
                    return new AnimalVo(idAnimal, nombre, edad, altura, cuernos, sexo);
                }
            }
        }
        return null;
    }

    public void addAnimal(AnimalVo animal) throws SQLException {
        String query = "INSERT INTO animal (idanimal, nombre, edad, altura, cuernos, sexo) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, animal.getId());
            statement.setString(1, animal.getNombre());
            statement.setInt(2, animal.getedad());
            statement.setInt(3, animal.getaltura());
            statement.setString(4, animal.getcuernos());
            statement.setString(5, animal.getSexo());
            statement.executeUpdate();
        }
    }

    public void updateAnimal(AnimalVo animal) throws SQLException {
        String query = "UPDATE animal SET idanimal = ?, nombre = ?, edad = ?, altura = ?, cuernos = ?, sexo = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, animal.getId());
            statement.setString(1, animal.getNombre());
            statement.setInt(2, animal.getedad());
            statement.setInt(3, animal.getaltura());
            statement.setString(4, animal.getcuernos());
            statement.setString(5, animal.getSexo());
            statement.setInt(6, animal.getId());
            statement.executeUpdate();
        }
    }

    public void deleteAnimal(int id) throws SQLException {
        String query = "DELETE FROM animal WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }
}