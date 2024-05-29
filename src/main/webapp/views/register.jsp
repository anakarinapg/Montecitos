<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Registro de Usuario - Montesitos</title>
    <link rel="stylesheet" type="text/css" href="../css/register.css">
</head>
<body>
    <div class="container">
        <h1>Registro de Usuario</h1>
        <form id="register-form" action="register.jsp" method="post"></form>
            <input type="text" id="Usuario" name="Usuario" placeholder="Usuario" required>
            
            <input type="document" id="documento" name="documento" placeholder="N° Documento" required>
            
            <input type="password" id="password" name="password" placeholder="Contraseña" required>
             
            <input type="email" id="email" name="email" placeholder="Email" required>

            <input type="tel" id="phone" name="phone" placeholder="N° de Telefono" required>
            
            <button type="submit" name="registrarse" onclick="showSuccessMessage(); window.location.href = './login.html'">Registrarse</button>
        </form>
    </div>

    <script src="../js/register.js"></script>
</body>
</html></form>
