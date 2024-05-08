package Controller;
import Modulo.Animal;
import View.AnimalView;
public class AnimalController {
    private Animal model;
    private AnimalView view;

    public AnimalController(Animal model, AnimalView view) {
        this.model = model;
        this.view = view;
    }

    public void setAnimalId(int id) {
        model.setId(id);
    }

    public void setAnimalEdad(int edad) {
        model.setEdad(edad);
    }

    public void setAnimalAltura(int altura) {
        model.setAltura(altura);
    }

    public int getAnimalId() {
        return model.getId();
    }

    public int getAnimalEdad() {
        return model.getedad();
    }

    public double getAnimalAltura() {
        return model.getaltura();
    }

    public void updateView() {
        view.printdetailles(model);
    }
}
