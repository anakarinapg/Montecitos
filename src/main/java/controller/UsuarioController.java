package controller;
import View.UsuarioView;
import Usuario.UsuarioDao;
public class UsuarioController {
    private Usuario usuarioModel;
    private UsuarioView usuarioView;
    private UsuarioDao usuarioDAO;

    public UsuarioController(Usuario usuarioModel, UsuarioView usuarioView) {
        this.usuarioModel = usuarioModel;
        this.usuarioView = usuarioView;
    }
    public UsuarioController(UsuarioDao usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entró al DoGet");
        String a=req.getParameter("accion");

        switch(a){
            case "abrirForm":
                abrirForm(req,resp);
            break;
            case "listar":
                listar(req,resp);
            break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entró al DoPost");
        String a=req.getParameter("accion");

        switch(a){
            case "add":
                add(req,resp);
            break;
        }
    }

public void actualizarUsuario(String id, String nuevoNombre, String nuevoEmail) {
    usuarioDAO.actualizarUsuario(id, nuevoNombre, nuevoEmail);
}

    // Métodos para actualizar y obtener información del usuario
    // ...
    
    public void actualizarVista() {
        usuarioView.mostrarUsuario(usuarioModel);
    }
    public Usuario obtenerUsuarioPorId(int id) {
        return usuarioDAO.obtenerUsuarioPorId(id);
    }
}
