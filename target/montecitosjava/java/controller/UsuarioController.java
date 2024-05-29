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

@WebServlet("/UsuarioController")
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
        switch (a) {
            case "Registrar":
            // Code for handling the "Registrar" action
            req.getRequestDispatcher("views/register.jsp").forward(req, resp);
            break;
            case "IniciarSesión":
            // Code for handling the "Iniciar Sesión" action
            req.getRequestDispatcher("views/login.jsp").forward(req, resp);
            break;
            default:
            // Code for handling other cases or displaying an error page
            break;
        }
    }

    // Método para manejar las solicitudes POST
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entró al DoPost");
        String a = req.getParameter("accion");
        switch (a) {
            case "IniciarSesión":
            // Code for handling the "Iniciar Sesión" action
            String nombre = req.getParameter("nombre");
            String contraseña = req.getParameter("contraseña");
            UsuarioDao.login(nombre, contraseña);
            case "registrarse":
                add(req, resp); // Llamar al método add() para manejar la acción "add"
                break;
            case "actualizar":
               // Llamar al método updateUsuario() para manejar la acción "actualizar"
                UsuarioDao.updateUsuario(usuarioVo);
                break;
            case "agregar":
                UsuarioDao.insertUsuario(usuarioVo); // Llamar al método insertUsuario() para manejar la acción "agregar"
            case "eliminar":
                UsuarioDao.deleteUsuario(usuarioVo.id); // Llamar al método deleteUsuario() para manejar la acción "eliminar"
                break;
            default:
                System.err.println("Acción no válida");
                break;
        }
    }
    // Método para abrir un formulario
    private void abrirForm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("views/login.jsp").forward(req, resp);
        System.out.println("El formulario ha sido abierto");
    }
}