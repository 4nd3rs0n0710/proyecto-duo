<%-- 
    Document   : login
    Created on : 11/04/2025, 11:05:32 a. m.
    Author     : SENA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingreso de Usuario1</title>
    </head>
    <body>
        <div>Ingreso Usuario1</div>
        <form name="Ingreso" action="ValidarUsuario" method="POST">
            <br><br>
            Usuario:<input type="text" name="usuario" value="" />
            <br><br>
            Clave:<input type="password" name="clave" value="" />
            <br><br>
            <input type="submit" value="Ingresar"/>
            <br><br>
        </form>
    </body>
</html>
