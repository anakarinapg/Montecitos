import View.AnimalView;
import View.UsuarioView;
import Modulo.Animal;
import Modulo.Usuario;
import Controller.AnimalController;
import Controller.UsuarioController;
public class Main {
    public static void main(String[] args) {
        // Creamos un animal
        Animal animal = new Animal(1,"alberto", 2, 48, "espiral", "M");

        // Creamos una vista
        AnimalView vista = new AnimalView();

        // Creamos un controlador
        AnimalController controlador = new AnimalController(animal, vista);

        // Actualizamos y mostramos la vista
        controlador.updateView();

        // Actualizamos los detalles del animal
        controlador.setAnimalId(3);
        controlador.setAnimalEdad(3);
        controlador.setAnimalAltura(5);

        // Volvemos a mostrar la vista actualizada
        controlador.updateView();
        Usuario usuarioModel = new Usuario(1, "admin", "Juan", 32463783, "juan@example.com", "contraseña123");
        UsuarioView usuarioView = new UsuarioView();
        UsuarioController usuarioController = new UsuarioController(usuarioModel, usuarioView);

        // Mostrar los detalles del usuario
        usuarioController.actualizarVista();
    }
}