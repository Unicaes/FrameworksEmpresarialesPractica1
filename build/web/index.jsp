<%-- 
    Document   : index
    Created on : Jan 31, 2022, 10:14:05 AM
    Author     : bryan
--%>

<%@page import="Model.Singleton"%>
<%@page import="Model.clsTrabajador"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    ArrayList<clsTrabajador> trabajadores = Singleton.trabajadores;
    if (trabajadores==null) {
            trabajadores=new ArrayList<clsTrabajador>();
            Singleton.trabajadores=trabajadores;
        }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <form action="${pageContext.request.contextPath}/MainServlet" method="POST">
                <table class="table table-striped">
                    
                    <thead>
                    <th colspan="9" class="text-center">Kmi's S.A. de C.V.</th> 
                    </thead>
                    <tbody>
                        <tr>
                    <th>Nombre</th>  
                    <th>Lunes</th>  
                    <th>Martes</th>  
                    <th>Miercoles</th>  
                    <th>Jueves</th>  
                    <th>Viernes</th>  
                    <th>Sabado</th>  
                    <th>Total Horas</th>
                    <th>Salario</th>
                        </tr>
                        <%
                        for (int i = 0; i < trabajadores.size(); i++) {
                                %>
                        
                        <tr>
                            <td>
                                <div class="input-group input-group-md mb-3">
                                    <input disabled type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm" value="<% out.println(trabajadores.get(i).nombre); %>">
                                </div>
                            </td>
                            <td>
                                <div class="input-group input-group-md mb-3">
                                    <input name="txtHorasLunes-<%out.print(i);%>" type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm" value="<% out.println(trabajadores.get(i).horas[0]); %>"> hrs
                                </div>
                            </td>
                            <td>
                                <div class="input-group input-group-md mb-3">
                                    <input name="txtHorasMartes-<%out.print(i);%>" type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm" value="<% out.println(trabajadores.get(i).horas[1]); %>"> hrs
                                </div></td>
                            </td>
                            <td>
                                <div class="input-group input-group-md mb-3">
                                    <input name="txtHorasMiercoles-<%out.print(i);%>" type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm" value="<% out.println(trabajadores.get(i).horas[2]); %>"> hrs
                                </div>
                            </td>
                            <td>
                                <div class="input-group input-group-md mb-3">
                                    <input name="txtHorasJueves-<%out.print(i);%>" type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm" value="<% out.println(trabajadores.get(i).horas[3]); %>"> hrs
                                </div>
                            </td>
                            <td>
                                <div class="input-group input-group-md mb-3">
                                    <input name="txtHorasViernes-<%out.print(i);%>" type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm" value="<% out.println(trabajadores.get(i).horas[4]); %>"> hrs
                                </div>
                            </td>
                            <td>
                                <div class="input-group input-group-md mb-3">
                                    <input name="txtHorasSabado-<%out.print(i);%>" type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm" value="<% out.println(trabajadores.get(i).horas[5]); %>"> hrs
                                </div>
                            </td>
                            <td><% out.println(trabajadores.get(i).total_horas); %></td>
                            <td>$<% out.println(trabajadores.get(i).salario); %></td>
                        </tr>
                        <%
                            }
                        %>
                        <tr>
                            <td>Total hrs por dia</td>
                            <td><%out.println(Singleton.TotalHoras[0]);%> horas</td>
                            <td><%out.println(Singleton.TotalHoras[1]);%> horas</td>
                            <td><%out.println(Singleton.TotalHoras[2]);%> horas</td>
                            <td><%out.println(Singleton.TotalHoras[3]);%> horas</td>
                            <td><%out.println(Singleton.TotalHoras[4]);%> horas</td>
                            <td><%out.println(Singleton.TotalHoras[5]);%> horas</td>
                            <td colspan="2">total a pagar</td>
                        </tr>
                        <tr>
                            <td>Total a pagar por dia</td>
                            <td>$<%out.println(Singleton.TotalHoras[0]*10);%></td>
                            <td>$<%out.println(Singleton.TotalHoras[1]*10);%></td>
                            <td>$<%out.println(Singleton.TotalHoras[2]*10);%></td>
                            <td>$<%out.println(Singleton.TotalHoras[3]*10);%></td>
                            <td>$<%out.println(Singleton.TotalHoras[4]*10);%></td>
                            <td>$<%out.println(Singleton.TotalHoras[5]*10);%></td>
                            <td colspan="2"> $ <%out.print(Singleton.TotalSalario);%> </td>
                        </tr>
                    </tbody>
                </table>

                <div class="row">
                    <button class="btn btn-info col-3" name="btnAction" value="1">Agregar trabajador</button>
                    <button class="btn btn-info col-3" name="btnAction" value="2">Ver costos</button>
                    <button class="btn btn-info col-3" name="btnAction" value="3">Limpiar</button>
                    <button class="btn btn-info col-3" name="btnAction" value="4">Vista previa</button>

                </div>    
            </form>
                            <h1 class="text-center">El total invertido en la empresa es: $<% out.println(Singleton.TotalSalario);%></h1>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
