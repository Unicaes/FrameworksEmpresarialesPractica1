/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Model.Singleton;
import Model.clsTrabajador;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bryan
 */
@WebServlet(name = "MainServlet", urlPatterns = {"/MainServlet"})
public class MainServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int action = Integer.parseInt(request.getParameter("btnAction"));
        switch (action) {
            case 1:
                response.sendRedirect("AgregarTrabajador.jsp");
                break;
            case 2:
                Singleton.TotalHoras= new int[]{0,0,0,0,0,0};
                for (int i = 0; i < Singleton.trabajadores.size(); i++) {
                    int[] Horas = new int[6];
                    Singleton.trabajadores.get(i).horas[0] = Integer.parseInt(request.getParameter("txtHorasLunes-" + i));
                    Singleton.trabajadores.get(i).horas[1] = Integer.parseInt(request.getParameter("txtHorasMartes-" + i));
                    Singleton.trabajadores.get(i).horas[2] = Integer.parseInt(request.getParameter("txtHorasMiercoles-" + i));
                    Singleton.trabajadores.get(i).horas[3] = Integer.parseInt(request.getParameter("txtHorasJueves-" + i));
                    Singleton.trabajadores.get(i).horas[4] = Integer.parseInt(request.getParameter("txtHorasViernes-" + i));
                    Singleton.trabajadores.get(i).horas[5] = Integer.parseInt(request.getParameter("txtHorasSabado-" + i));
                    IntStream stream = IntStream.of(Singleton.trabajadores.get(i).horas);
                    Singleton.TotalHoras [0]+= Singleton.trabajadores.get(i).horas[0];
                    Singleton.TotalHoras [1]+= Singleton.trabajadores.get(i).horas[1];
                    Singleton.TotalHoras [2]+= Singleton.trabajadores.get(i).horas[2];
                    Singleton.TotalHoras [3]+= Singleton.trabajadores.get(i).horas[3];
                    Singleton.TotalHoras [4]+= Singleton.trabajadores.get(i).horas[4];
                    Singleton.TotalHoras [5]+= Singleton.trabajadores.get(i).horas[5];
                    Singleton.trabajadores.get(i).total_horas = stream.sum();
                    Singleton.trabajadores.get(i).salario = Singleton.trabajadores.get(i).total_horas * 10;
                }
                Singleton.TotalSalario = Singleton.TotalHoras[0]+Singleton.TotalHoras[1]+Singleton.TotalHoras[2]+Singleton.TotalHoras[3]+Singleton.TotalHoras[4]+Singleton.TotalHoras[5];
                Singleton.TotalSalario*=10;
                response.sendRedirect("index.jsp");
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                String nombre = request.getParameter("txtNombre");
                clsTrabajador item = new clsTrabajador();
                item.nombre = nombre;
                Singleton.trabajadores.add(item);
                response.sendRedirect("index.jsp");
                break;
            default:
                break;
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
