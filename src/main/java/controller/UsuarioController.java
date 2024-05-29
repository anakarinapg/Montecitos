package controller;
import View.UsuarioView;
import model.Usuario.UsuarioVo;
import Usuario.UsuarioDao;
import Usuario.UsuarioVo;
import java.io.IOException;

import javax.servlet.annotation.WebServlet;




import org.codehaus.jackson.map.ObjectMapper;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UsuarioController extends HttpServlet {
    private UsuarioVo usuarioVo;
    private UsuarioDao usuarioDAO;

    // Constructor que recibe un UsuarioDao y un UsuarioVo como parámetros
    public UsuarioController(UsuarioDao usuarioDAO, UsuarioVo usuarioVo) {
        this.usuarioDAO = usuarioDAO;
        this.usuarioVo = usuarioVo;
    }

    // Método para manejar las solicitudes GET
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entró al DoGet");
        String a = req.getParameter("accion");

        // Crear una instancia del modelo de usuario y obtener el usuario
        UserModel model = new UserModel();
        User user = model.getUser();
        // Convertir el usuario a formato JSON y escribirlo en el flujo de salida de la respuesta
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(response.getOutputStream(), user);
    }

    // Método para manejar las solicitudes POST
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entró al DoPost");
        String a = req.getParameter("accion");

        switch (a) {
            case "add":
                add(req, resp); // Llamar al método add() para manejar la acción "add"
                break;
        }
    }

    // Método para actualizar un usuario
    public void updateUsuario(String id, String nuevoNombre, String nuevoEmail) {
        // Aquí deberías utilizar el usuarioDAO para actualizar el usuario en la base de datos
    }

    // Método para obtener un usuario por su ID
    public Usuario obtenerUsuarioPorId(int id) {
        return usuarioDAO.obtenerUsuarioPorId(id);
    }

    // Método para abrir un formulario
    private void abrirForm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("views/login.jsp").forward(req, resp);
        System.out.println("El formulario ha sido abierto");
    }

    // Método para listar usuarios
    private void listar(HttpServletRequest req, HttpServletResponse resp) {
        // Implementa el método para listar usuarios
    }

    // Método para agregar un nuevo usuario
     private void add(HttpServletRequest req, HttpServletResponse resp) {

        if(req.getParameter("descripcion")!=null){
            usuarioVo.setCorreo((req.getParameter("email")));
        }
        
        try {
            usuarioDAO.insertUsuario(usuarioVo);
            System.out.println("Registro insertado correctamente");
        } catch (Exception e) {
            System.out.println("Error en la inserción del registro "+e.getMessage().toString());
        }
    }
}
