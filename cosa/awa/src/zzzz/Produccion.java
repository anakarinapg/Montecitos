package zzzz;
import Modulo.Animal;

class date{
    int dia;
    int mes;
    int anio;
    public date(){}
    public date(int diia,int mees,int ano){
        dia=diia;
        mes=mees;
        anio=ano;
    }
    @Override
    public String toString() {
        return "{" +dia + '\'' + mes + '\'' +
                anio +
                '}';
    }
}

public class Produccion {
    int ID;
    int Cantidad;
    date Fecha;
    Animal animal;
    public Produccion(){}
    public Produccion(int id,int cantidad,date fecha, Animal animalo){
        ID=id;
        Cantidad=cantidad;
        Fecha=fecha;
        animal=animalo;
    }
    public int getId(){
        return ID;
    }
    public int getCantidad(){
        return Cantidad;
    }
    public date getFecha(){
        return Fecha;
    }
    public Animal getAnimal(){
        return animal;
    }

    public void setId(int id){
        ID=id;
    }

    public void setCantidad(int cantidad){
        Cantidad=cantidad;
    }
    public void setFecha(date fecha){
        Fecha=fecha;
    }
    public void setAnimal(Animal animalo){
        animal=animalo;
    }
    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + ID +
                ", cantidad='" + Cantidad + '\'' +
                ", Fecha='" + Fecha + '\'' +
                ", Animal='" + animal + '\'' +
                
                '}';
    }
}
