package model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// Clase que maneja las operaciones de acceso a datos para la entidad Usuario
public class UsuarioDao {
    private Connection connection; // Conexión a la base de datos

    // Constructor que recibe una conexión como parámetro
    public UsuarioDao(Connection connection) {
        this.connection = connection;
    }

    // Método para obtener todos los usuarios de la base de datos
    public List<UsuarioVo> getAllUsuarios() throws SQLException {
        List<UsuarioVo> usuarios = new ArrayList<>(); // Lista para almacenar los usuarios obtenidos
        String query = "SELECT * FROM usuario"; // Consulta SQL para seleccionar todos los usuarios
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            // Iterar sobre los resultados de la consulta
            while (resultSet.next()) {
                // Obtener los datos de cada usuario
                int id = resultSet.getInt("idusuario");
                String tipo = resultSet.getString("tipo_id");
                String name = resultSet.getString("nombre_usuario");
                int cel = resultSet.getInt("num_cel");
                String correo = resultSet.getString("correo");
                String password = resultSet.getString("contraseña");
                // Crear un objeto UsuarioVo con los datos obtenidos y agregarlo a la lista
                UsuarioVo usuario = new UsuarioVo(id, tipo, name, cel, correo, password);
                usuarios.add(usuario);
            }
        }
        // Devolver la lista de usuarios
        return usuarios;
    }

    // Método para insertar un nuevo usuario en la base de datos
    public void insertUsuario(UsuarioVo usuario) throws SQLException {
        // Consulta SQL para insertar un usuario en la tabla usuario
        String query = "INSERT INTO usuario (idusuario, tipo_id, nombre_usuario, numero_celular, correo, contraseña) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            // Establecer los valores de los parámetros en la consulta
            statement.setInt(1, usuario.getId());
            statement.setString(2, usuario.getTipoId());
            statement.setString(3, usuario.getNombre());
            statement.setInt(4, usuario.getNumeroTelefono());
            statement.setString(5, usuario.getCorreo());
            statement.setString(6, usuario.getContraseña());
            // Ejecutar la consulta
            statement.executeUpdate();
        }
    }

    // Método para actualizar un usuario existente en la base de datos
    public void updateUsuario(UsuarioVo usuario) throws SQLException {
        // Consulta SQL para actualizar un usuario en la tabla usuario
        String query = "UPDATE usuario SET idusuario = ?, tipo_id = ?, nombre_usuario = ?, correo = ?, numero_celular = ?, contraseña = ? WHERE idusuario = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            // Establecer los valores de los parámetros en la consulta
            statement.setInt(1, usuario.getId());
            statement.setString(2, usuario.getTipoId());
            statement.setString(3, usuario.getNombre());
            statement.setString(4, usuario.getCorreo());
            statement.setInt(5, usuario.getNumeroTelefono());
            statement.setString(6, usuario.getContraseña());
            statement.setInt(7, usuario.getId());
            // Ejecutar la consulta
            statement.executeUpdate();
        }
    }

    // Método para eliminar un usuario de la base de datos por su ID
    public void deleteUsuario(int id) throws SQLException {
        // Consulta SQL para eliminar un usuario de la tabla usuario por su ID
        String query = "DELETE FROM usuario WHERE idusuario = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            // Establecer el valor del parámetro en la consulta
            statement.setInt(1, id);
            // Ejecutar la consulta
            statement.executeUpdate();
        }
    }
}