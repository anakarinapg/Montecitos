package Modulo;

public class Usuario {
    int ID;
    String tipo_ID;
    String Name;
    int Num_Cel;
    String Correo;
    String Contrasena;
    public Usuario(){}
    public Usuario(int id,String tipo,String name,int cel,String correo,String password){
        ID=id;
        tipo_ID=tipo;
        Name=name;
        Num_Cel=cel;
        Correo=correo;
        Contrasena=password;
    };

     // Métodos get
     public int getId() {
        return ID;
    }
    public String getTipoId(){
        return tipo_ID;

    }

    public String getNombre() {
        return Name;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getContraseña() {
        return Contrasena;
    }

    public int getNumeroTelefono() {
        return Num_Cel;
    }

    // Métodos set
    public void setId(int id) {
        ID = id;
    }

    public void setNombre(String nombre) {
        Name = nombre;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public void setContraseña(String contraseña) {
        Contrasena = contraseña;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        Num_Cel = numeroTelefono;
    }
/* 
    // Método toString para representación en cadena
    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + ID +
                ", nombre='" + Name + '\'' +
                ", correo='" + Correo + '\'' +
                ", contraseña='" + Contrasena + '\'' +
                ", numeroTelefono='" + Num_Cel + '\'' +
                '}';
    }
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario(1,"admin", "Juan", 463783, "juan@example.com", "tumama");
        System.out.println(usuario1);
    }
*/



}
