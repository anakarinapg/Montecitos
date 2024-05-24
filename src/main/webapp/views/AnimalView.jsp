<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro Animal</title>
    <link rel="stylesheet" href="../css/style.css">
</head>
<body>
    <h1>FORMULARIO DE DATOS</h1>
    <form action="procesar.jsp" method="post">
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" required><br>

        <label for="sexo">Sexo:</label>
        <input type="radio" id="sexo-m" name="sexo" value="masculino">
        <label for="sexo-m">Masculino</label>
        <input type="radio" id="sexo-f" name="sexo" value="femenino">
        <label for="sexo-f">Femenino</label><br>

        <label for="id">ID:</label>
        <input type="text" id="id" name="id"><br>

        <label for="peso">Peso (kg):</label>
        <input type="number" id="peso" name="peso" step="0.01"><br>

        <label for="edad">Edad:</label>
        <input type="date" id="edad" name="edad"><br>

        <label for="altura">Altura (cm):</label>
        <input type="number" id="altura" name="altura"><br>

        <label for="cuernos">Número de Cuernos:</label>
        <input type="number" id="cuernos" name="cuernos" min="0"><br>

        <input type="submit" value="Enviar">
    </form>
</body>
</html>
