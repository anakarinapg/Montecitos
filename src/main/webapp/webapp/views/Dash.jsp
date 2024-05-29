<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/styleDash.css">
    <title>Dash</title>
</head>
<body>
    <!-- Primera barra de navegación -->
    <nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
        <div class="container-fluid">
            <a class="navbar-brand" href="../views/edituser.html"></a>
            <a href="../views/edituser.html"><img src = "../src/editar.png" height="50" alt=" "></a>
            <h1> Bienvenido a Montecitos</h1>
            <a href="../../index.jsp">Salir</a>
        </div>
    </nav>

    
    <!-- Segunda barra de navegación -->
    <nav class="navbar navbar-expand-lg navbar-light bg-light" style="margin-top: 56px;">
        <div class="container-fluid">
            <!-- Agrega aquí el campo de búsqueda -->
            <form class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Buscar" aria-label="Search">
                <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                    Filtro
                  </a>
                <ul class="dropdown-menu">
                    <li><a class="dropdown-item" href="#">ID</a></li>
                    <li><a class="dropdown-item" href="#">Nombre</a></li>
                    <li><a class="dropdown-item" href="#">Edad</a></li>
                  </ul>
                  <a href="../views/AnimalView.jsp"><img src = "../src/registro.png" height="50" alt=" "></a>
            </form>
        </div>
    </nav>

    <!-- Contenido de la página -->
    <div class="container mt-5">
        <ul class="list-group">
            
            <li class="list-group-item">Lola</li>
            <li class="list-group-item">Teresa</li>
            <li class="list-group-item">Ramona</li>
            <li class="list-group-item">Lolita</li>
            <li class="list-group-item">Carmensa</li>
          </ul>
    </div>

    <!-- Scripts de Bootstrap -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>
</body>
</html>
