<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Editar Usuario</title>
    <link rel="stylesheet" href="../css/edituser.css">
</head>
<body>
    <div class="container">
        
        <form id="register-form">
            <h1>Editar</h1>
            <br>
            <input type="text" id="Usuario" name="Usuario" placeholder="Usuario" required>
            <br>
            <br>
            <label for="documento">Tipo:</label>
            <select id="documento" name="documento">
            <option value="cedula">Cédula</option>
            <option value="pasaporte">Pasaporte</option>
            <option value="otro">Otro</option>
            </select> <br><br>
            <input type="document" id="documento" name="documento" placeholder="N° Documento" required>
            <br><br>
            <input type="password" id="password" name="password" placeholder="Contraseña" required>
             <br><br>
            <input type="email" id="email" name="email" placeholder="Email" required>
            <br><br>
            <input type="tel" id="phone" name="phone" placeholder="N° de Telefono" required>
            <br><br>
            <button id="Actualizar" type="submit">Actualizar</button>
            <br>
            <br>
            <button id="EliminarUsuario" type="submit">Eliminar Usuario</button>
        </form>
        

    </div>
    </form>

    <!-- Alerta de actualización -->
    <br>
    <div class="alert" id="updateAlert">
        <span class="closebtn" onclick="this.parentElement.style.display='none';">×</span>
        ¡Datos actualizados correctamente!
    </div>

    <script src="../../java/controller/UsuarioController.java"></script>
</body>
</html>
