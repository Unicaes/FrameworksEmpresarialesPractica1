package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Singleton;
import Model.clsTrabajador;
import java.util.ArrayList;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    ArrayList<clsTrabajador> trabajadores = Singleton.trabajadores;
    if (trabajadores==null) {
            trabajadores=new ArrayList<clsTrabajador>();
            Singleton.trabajadores=trabajadores;
        }

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/MainServlet\" method=\"POST\">\n");
      out.write("                <table class=\"table table-striped\">\n");
      out.write("                    \n");
      out.write("                    <thead>\n");
      out.write("                    <th colspan=\"9\" class=\"text-center\">Kmi's S.A. de C.V.</th> \n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                    <th>Nombre</th>  \n");
      out.write("                    <th>Lunes</th>  \n");
      out.write("                    <th>Martes</th>  \n");
      out.write("                    <th>Miercoles</th>  \n");
      out.write("                    <th>Jueves</th>  \n");
      out.write("                    <th>Viernes</th>  \n");
      out.write("                    <th>Sabado</th>  \n");
      out.write("                    <th>Total Horas</th>\n");
      out.write("                    <th>Salario</th>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                        for (int i = 0; i < trabajadores.size(); i++) {
                                
      out.write("\n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <div class=\"input-group input-group-md mb-3\">\n");
      out.write("                                    <input disabled type=\"text\" class=\"form-control\" aria-label=\"Sizing example input\" aria-describedby=\"inputGroup-sizing-sm\" value=\"");
 out.println(trabajadores.get(i).nombre); 
      out.write("\">\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <div class=\"input-group input-group-md mb-3\">\n");
      out.write("                                    <input name=\"txtHorasLunes-");
out.print(i);
      out.write("\" type=\"text\" class=\"form-control\" aria-label=\"Sizing example input\" aria-describedby=\"inputGroup-sizing-sm\" value=\"");
 out.println(trabajadores.get(i).horas[0]); 
      out.write("\"> hrs\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <div class=\"input-group input-group-md mb-3\">\n");
      out.write("                                    <input name=\"txtHorasMartes-");
out.print(i);
      out.write("\" type=\"text\" class=\"form-control\" aria-label=\"Sizing example input\" aria-describedby=\"inputGroup-sizing-sm\" value=\"");
 out.println(trabajadores.get(i).horas[1]); 
      out.write("\"> hrs\n");
      out.write("                                </div></td>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <div class=\"input-group input-group-md mb-3\">\n");
      out.write("                                    <input name=\"txtHorasMiercoles-");
out.print(i);
      out.write("\" type=\"text\" class=\"form-control\" aria-label=\"Sizing example input\" aria-describedby=\"inputGroup-sizing-sm\" value=\"");
 out.println(trabajadores.get(i).horas[2]); 
      out.write("\"> hrs\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <div class=\"input-group input-group-md mb-3\">\n");
      out.write("                                    <input name=\"txtHorasJueves-");
out.print(i);
      out.write("\" type=\"text\" class=\"form-control\" aria-label=\"Sizing example input\" aria-describedby=\"inputGroup-sizing-sm\" value=\"");
 out.println(trabajadores.get(i).horas[3]); 
      out.write("\"> hrs\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <div class=\"input-group input-group-md mb-3\">\n");
      out.write("                                    <input name=\"txtHorasViernes-");
out.print(i);
      out.write("\" type=\"text\" class=\"form-control\" aria-label=\"Sizing example input\" aria-describedby=\"inputGroup-sizing-sm\" value=\"");
 out.println(trabajadores.get(i).horas[4]); 
      out.write("\"> hrs\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <div class=\"input-group input-group-md mb-3\">\n");
      out.write("                                    <input name=\"txtHorasSabado-");
out.print(i);
      out.write("\" type=\"text\" class=\"form-control\" aria-label=\"Sizing example input\" aria-describedby=\"inputGroup-sizing-sm\" value=\"");
 out.println(trabajadores.get(i).horas[5]); 
      out.write("\"> hrs\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("                            <td>");
 out.println(trabajadores.get(i).total_horas); 
      out.write("</td>\n");
      out.write("                            <td>");
 out.println(trabajadores.get(i).salario); 
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Total hrs por dia</td>\n");
      out.write("                            <td>");
out.println(Singleton.TotalHoras[0]);
      out.write("</td>\n");
      out.write("                            <td>");
out.println(Singleton.TotalHoras[1]);
      out.write("</td>\n");
      out.write("                            <td>");
out.println(Singleton.TotalHoras[2]);
      out.write("</td>\n");
      out.write("                            <td>");
out.println(Singleton.TotalHoras[3]);
      out.write("</td>\n");
      out.write("                            <td>");
out.println(Singleton.TotalHoras[4]);
      out.write("</td>\n");
      out.write("                            <td>");
out.println(Singleton.TotalHoras[5]);
      out.write("</td>\n");
      out.write("                            <td colspan=\"2\">total a pagar</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Total a pagar por dia</td>\n");
      out.write("                            <td>");
out.println(Singleton.TotalHoras[0]*10);
      out.write("</td>\n");
      out.write("                            <td>");
out.println(Singleton.TotalHoras[1]*10);
      out.write("</td>\n");
      out.write("                            <td>");
out.println(Singleton.TotalHoras[2]*10);
      out.write("</td>\n");
      out.write("                            <td>");
out.println(Singleton.TotalHoras[3]*10);
      out.write("</td>\n");
      out.write("                            <td>");
out.println(Singleton.TotalHoras[4]*10);
      out.write("</td>\n");
      out.write("                            <td>");
out.println(Singleton.TotalHoras[5]*10);
      out.write("</td>\n");
      out.write("                            <td colspan=\"2\"> $ ");
out.print(Singleton.TotalSalario);
      out.write(" </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <button class=\"btn btn-info col-3\" name=\"btnAction\" value=\"1\">Agregar trabajador</button>\n");
      out.write("                    <button class=\"btn btn-info col-3\" name=\"btnAction\" value=\"2\">Ver costos</button>\n");
      out.write("                    <button class=\"btn btn-info col-3\" name=\"btnAction\" value=\"3\">Limpiar</button>\n");
      out.write("                    <button class=\"btn btn-info col-3\" name=\"btnAction\" value=\"4\">Vista previa</button>\n");
      out.write("\n");
      out.write("                </div>    \n");
      out.write("            </form>\n");
      out.write("                            <h1 class=\"text-center\">El total invertido en la empresa es: $");
 out.println(Singleton.TotalSalario);
      out.write("</h1>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
