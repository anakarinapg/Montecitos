package View;
import Modulo.Usuario;
public class UsuarioView {
    public void mostrarUsuario(Usuario usuario) {
        System.out.println("Detalles del Usuario:");
        System.out.println("ID: " + usuario.getId());
        System.out.println("Tipo de ID: " + usuario.getTipoId());
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Número de Celular: " + usuario.getNumeroTelefono());
        System.out.println("Correo: " + usuario.getCorreo());
        // No mostramos la contraseña por razones de seguridad
    }
}
