<%-- 
    Document   : AgregarTrabajador
    Created on : Feb 2, 2022, 6:45:20 PM
    Author     : bryan
--%>

<%@page import="Model.Singleton"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.clsTrabajador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    ArrayList<clsTrabajador> trabajadores = Singleton.trabajadores;
    if (trabajadores == null) {
        trabajadores = new ArrayList<clsTrabajador>();
        Singleton.trabajadores = trabajadores;
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <body>
        <div class="container pt-5">
            <form method="POST" action="${pageContext.request.contextPath}/MainServlet">
                <label>Nombre</label>
                <input name="txtNombre" type="text">
                <button class="btn btn-info" type="submit" name="btnAction" value="5">Guardar</button>
            </form>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Nombre</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        for (int i = 0; i < trabajadores.size(); i++) {
                            out.println("<tr>");
                            out.println("<td>");
                            out.println(trabajadores.get(i).nombre);
                            out.println("</td>");
                            out.println("</tr>");
                        }
                    %>
                </tbody>
            </table>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
