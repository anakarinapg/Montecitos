package controller;
import Modulo.Animal;
import View.AnimalView;
package api.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

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
