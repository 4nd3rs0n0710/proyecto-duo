/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;



/**
 *
 * @author SENA
 */
public class ValidarUsuarioServletMOD extends HttpServlet {

@WebServlet(name = "ValidarUsuario", urlPatterns = {"/ValidarUsuario"})
public class ValidarUsuarioServlet extends HttpServlet {

    @Override
 protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtener parámetros
        String user = request.getParameter("usuario");
        String pass = request.getParameter("clave");
        
        boolean esValido = false;
        String mensaje = "";
        
        if("admin".equals(user) && "1234".equals(pass)){
            esValido = true;
            mensaje = "Regístro Exitoso";
        } else {
            mensaje = "Registro Inválido";
        }
        
        request.setAttribute("esValido", esValido);
        request.setAttribute("mensaje", mensaje);
        request.setAttribute("usuario", user);
        
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
        }
    }
}
   