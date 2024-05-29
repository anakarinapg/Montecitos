package model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {
    // Clase para manejar operaciones de base de datos relacionadas con la entidad Usuario

    private Connection connection; // Conexión a la base de datos

    // Constructor que recibe una conexión a la base de datos
    public UsuarioDao(Connection connection) {
        this.connection = connection;
    }

    // Método para iniciar sesión de un usuario
    public void login(String nombre, String contraseña) throws SQLException {
        String query = "SELECT * FROM usuario WHERE nombre = ? AND contraseña = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            // Configuración de los parámetros de la consulta
            statement.setString(1, nombre);
            statement.setString(2, contraseña);
            try (ResultSet result = statement.executeQuery()) {
                // Verificación de si se encontró un usuario con el nombre y contraseña proporcionados
                if (result.next()) {
                    System.out.println("Bienvenido " + nombre); // Mensaje de bienvenida
                    getMethod(views/dash.jsp); // Probablemente un error aquí, debería redirigir al usuario
                } else {
                    System.out.println("Usuario no encontrado"); // Mensaje de usuario no encontrado
                }
            }
        }
    }

    // Método para insertar un nuevo usuario en la base de datos
    public void insertUsuario(UsuarioVo usuario) throws SQLException {
        String query = "INSERT INTO usuario (idusuario, tipo_id, nombre_usuario, numero_celular, correo, contraseña) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            // Configuración de los parámetros de la consulta con los valores del objeto UsuarioVo
            statement.setInt(1, usuario.getId());
            statement.setString(2, usuario.getTipoId());
            statement.setString(3, usuario.getNombre());
            statement.setInt(4, usuario.getNumeroTelefono());
            statement.setString(5, usuario.getCorreo());
            statement.setString(6, usuario.getContraseña());
            statement.executeUpdate(); // Ejecución de la consulta de inserción
        }
    }

    // Método para actualizar la información de un usuario en la base de datos
    public void updateUsuario(UsuarioVo usuario) throws SQLException {
        String query = "UPDATE usuario SET idusuario = ?, tipo_id = ?, nombre_usuario = ?, correo = ?, numero_celular=?, contraseña=?  WHERE idusuario = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            // Configuración de los parámetros de la consulta con los valores actualizados del objeto UsuarioVo
            statement.setInt(1, usuario.getId());
            statement.setString(2, usuario.getTipoId());
            statement.setString(3, usuario.getNombre());
            statement.setString(4, usuario.getCorreo());
            statement.setInt(5, usuario.getNumeroTelefono());
            statement.setString(6, usuario.getContraseña());
            statement.setInt(7, usuario.getId()); // Utilizando el ID para identificar al usuario a actualizar
            statement.executeUpdate(); // Ejecución de la consulta de actualización
        }
    }

    // Método para eliminar un usuario de la base de datos
    public void deleteUsuario(int id) throws SQLException {
        String query = "DELETE FROM usuario WHERE idusuario = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            // Configuración del parámetro de la consulta con el ID del usuario a eliminar
            statement.setInt(1, id);
            statement.executeUpdate(); // Ejecución de la consulta de eliminación
        }
    }
}
