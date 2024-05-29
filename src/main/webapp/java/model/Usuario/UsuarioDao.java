package model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {
    private Connection connection;

    public UsuarioDao(Connection connection) {
        this.connection = connection;
    }
    public void login(String nombre, String contraseña) throws SQLException {
        String query = "SELECT * FROM usuario WHERE nombre = ? AND contraseña = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, nombre);
            statement.setString(2, contraseña);
            try (ResultSet result = statement.executeQuery()) {
                if (result.next()) {
                    System.out.println("Bienvenido " + nombre);
                    getMethod(views/dash.jsp);
                } else {
                    System.out.println("Usuario no encontrado");
                }
            }
        }
    }

    public void insertUsuario(UsuarioVo usuario) throws SQLException {
        String query = "INSERT INTO usuario (idusuario,tipo_id,nombre_usuario,numero_celular,correo,contraseña) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, usuario.getId());
            statement.setString(2, usuario.getTipoId());
            statement.setString(3, usuario.getNombre());
            statement.setInt(4, usuario.getNumeroTelefono());
            statement.setString(5, usuario.getCorreo());
            statement.setString(6, usuario.getContraseña());
            statement.executeUpdate();
        }
    }

    public void updateUsuario(UsuarioVo usuario) throws SQLException {
        String query = "UPDATE usuario SET idusuario = ?, tipo_id = ?, nombre_usuario = ?, correo = ?, numero_celular=?, contraseña=?  WHERE idusuario = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, usuario.getId());
            statement.setString(2, usuario.getTipoId());
            statement.setString(3, usuario.getNombre());
            statement.setString(4, usuario.getCorreo());
            statement.setInt(5, usuario.getNumeroTelefono());
            statement.setString(6, usuario.getContraseña());
            statement.setInt(7, usuario.getId());
            statement.executeUpdate();
        }
    }

    public void deleteUsuario(int id) throws SQLException {
        String query = "DELETE FROM usuario WHERE idusuario = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }
}