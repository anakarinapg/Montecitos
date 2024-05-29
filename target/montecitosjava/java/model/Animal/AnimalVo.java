package model.Animal;
public class AnimalVo {
    int ID;
    String Name;
    int Edad;
    int Altura;
    String Cuernos;
    String Sexo;
    public AnimalVo(){}


    public AnimalVo(int id,String nombre,int edad,int altura,String cuernos,String sexo){
        ID=id;
        Name=nombre;
        Edad=edad;
        Altura=altura;
        Cuernos=cuernos;
        Sexo=sexo;
    };

     // Métodos get
     public int getId() {
        return ID;
    }

    public String getNombre() {
        return Name;
    }

    public int getedad() {
        return Edad;
    }

    public int getaltura() {
        return Altura;
    }

    public String getcuernos() {
        return Cuernos;
    }
    public String getSexo() {
        return Sexo;
    }

    // Métodos set
    public void setId(int id) {
        ID = id;
    }

    public void setNombre(String nombre) {
        Name = nombre;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public void setAltura(int altura) {
        Altura = altura;
    }

    public void setCuernos(String cuernos) {
        Cuernos = cuernos;
    }
    public void setSex(String sex) {
        Sexo = sex;
    }
    
    



}
