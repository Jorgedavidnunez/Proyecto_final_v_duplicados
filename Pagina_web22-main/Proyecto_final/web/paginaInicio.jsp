<%-- 
    Document   : paginaInicio
    Created on : 25/09/2021, 19:33:49
    Author     : david
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
        <%
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        if(session.getAttribute("txtUsuario")==null&&session.getAttribute("nombre")==null){
            response.sendRedirect("index.jsp");
        }
        %>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body <%-- onpageshow="bienvenido()"--%>>
        <h1>Hola <%=request.getSession().getAttribute("nombre")%>, bienvenido de nuevo </h1>
        <%-- <p>Usuario en uso: ${txtUsuario} </p>
        <p><a href="https://www.google.com">GOOGLE</a></p>--%>
        <form action="sr_cerrar_sesion">
            <input type="submit" value="Cerrar Sesion">
        </form>
        <%-- <script src='htttps://cdn.jsdelivr.net/npm/sweetalert2@11'></script>--%>
        <%-- <script src='js/sweetAlert.js'></script>--%>
    </body>
</html>
