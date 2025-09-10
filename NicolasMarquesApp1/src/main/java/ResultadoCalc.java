/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Todo mundo
 */
@WebServlet(urlPatterns = {"/ResultadoCalc"})
public class ResultadoCalc extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ResultadoCalc</title>");
            out.println("</head>");
            out.println("<body>");
          
            
            try{
                double n1 = Double.parseDouble(request.getParameter("n1"));
                double n2 = Double.parseDouble(request.getParameter("n1"));
                double sum = n1 + n2;
                double sub = n1 - n2;
                double mult = n1 * n2;
                double div = n1 / n2;
                 out.println("<h4 style='color=blue'>" + n1 + " +" + n2 + " = "+sum +"</h4>");
                 out.println("<h4 style='color=blue'>" + n1 + " -" + n2 + " = "+sub +"</h4>");
                 out.println("<h4 style='color=blue'>" + n1 + " x" + n2 + " = "+mult +"</h4>");
                 out.println("<h4 style='color=blue'>" + n1 + " /" + n2 + " = "+div+"</h4>");
               
            }catch(Exception ex){
                out.println("<h4 style='color=red'>Tipo Invalido!</h4>");
             }
            out.println("<h4><a href='ResultadoCalc'>Mais uma conta</a></h4>");
            out.println("<h4><a href='index.html'>Inicio</a></h4>");
            
            out.println("</body>");
            out.println("</html>");
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
