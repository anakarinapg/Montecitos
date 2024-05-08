package View;
import Modulo.Animal;
public class AnimalView {


    public void printdetailles(Animal animal) {
        System.out.println("Animal:" );
        System.out.println("id=" + animal.getId() );
        System.out.println("Nombre='" + animal.getNombre() + '\'' );
        System.out.println("Edad='" + animal.getedad() + '\'' );
        System.out.println("Altura='" + animal.getaltura() + '\'' );
        System.out.println("Tipo de cuernos='" + animal.getcuernos() + '\'' );
        System.out.println("Sexo='" + animal.getSexo() + '\'' );
        System.out.println(" " );

    }
    
}
