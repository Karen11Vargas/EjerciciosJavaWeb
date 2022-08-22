/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author karen_b
 */
@WebServlet(name = "Datos2", urlPatterns = {"/Datos2"})
public class Datos2 extends HttpServlet {

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
            String respuesta4 = request.getParameter("respuesta4");
           String  mensaje3="";
            
            switch (respuesta4){
                case "1":
                     mensaje3= "Correcta";
                     break;
                case "2":
                      mensaje3 = "Incorecta";
                     break;
                case "3":
                      mensaje3 = "Incorrecta";
                     break;
            }
            
            
            String respuesta5 = request.getParameter("respuesta5");
            String mensaje4="";
            switch (respuesta5){
                
                case "1":
                    mensaje4 ="Incorecta";
                      break;
                case "2":
                      mensaje4 = "Correcta";
                     break;
                case "3":
                      mensaje4 = "Incorrecta";
                     break;
     
            }
            
            
            String respuesta6 = request.getParameter("respuesta6");
            String mensaje5="";
            switch (respuesta6){
                
                case "1":
                    mensaje5 ="Correcta";
                      break;
                case "2":
                      mensaje5 = "Incorrecta";
                     break;
                case "3":
                    mensaje5 ="Incorrecta";
                      break;
               
            }

          
              request.setAttribute("respuesta4", mensaje3 );
            request.setAttribute("respuesta5", mensaje4 );
            request.setAttribute("respuesta6", mensaje5 );
          request.getRequestDispatcher("FormularioDinamico.jsp"). forward(request, response);

          
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
