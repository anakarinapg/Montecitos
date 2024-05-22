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

    public List<UsuarioVo> getAllUsuarios() throws SQLException {
        List<UsuarioVo> usuarios = new ArrayList<>();
        String query = "SELECT * FROM usuario";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                int id = resultSet.getInt("idusuario");
                String tipo = resultSet.getString("tipo_id");
                String name = resultSet.getString("nombre_usuario");
                int cel = resultSet.getInt("num_cel");
                String correo = resultSet.getString("correo");
                String password = resultSet.getString("contraseña");
                UsuarioVo usuario = new UsuarioVo(id, tipo, name,cel,correo, password);
                usuarios.add(usuario);
            }
        }
        return usuarios;
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