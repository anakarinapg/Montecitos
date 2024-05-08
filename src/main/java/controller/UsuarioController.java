package Controller;
import Modulo.Usuario;
import View.UsuarioView;
public class UsuarioController {
    private Usuario usuarioModel;
    private UsuarioView usuarioView;

    public UsuarioController(Usuario usuarioModel, UsuarioView usuarioView) {
        this.usuarioModel = usuarioModel;
        this.usuarioView = usuarioView;
    }

    // Métodos para actualizar y obtener información del usuario
    // ...
    
    public void actualizarVista() {
        usuarioView.mostrarUsuario(usuarioModel);
    }
}