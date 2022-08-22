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
 * @author SENA
 */
@WebServlet(name = "Datos", urlPatterns = {"/Datos"})
public class Datos extends HttpServlet {

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
            
            String respuesta1 = request.getParameter("respuesta1");
           String  mensaje="";
            
            switch (respuesta1){
                case "1":
                     mensaje = "Incorrecta";
                     break;
                case "2":
                      mensaje = "Incorecta";
                     break;
                case "3":
                      mensaje = "Correcta";
                     break;
            }
            
            
            String respuesta2 = request.getParameter("respuesta2");
            String mensaje1="";
            switch (respuesta2){
                
                case "1":
                    mensaje1 ="Incorrecta";
                      break;
                case "2":
                      mensaje1 = "Incorecta";
                     break;
                case "3":
                      mensaje1 = "Correcta";
                     break;
     
            }
            
            
            String respuesta3 = request.getParameter("respuesta3");
            String mensaje2="";
            switch (respuesta3){
                
                case "1":
                    mensaje2 ="Incorrecta";
                      break;
                case "2":
                      mensaje2 = "Correcta";
                     break;
            }

          
              request.setAttribute("respuesta1", mensaje );
            request.setAttribute("respuesta2", mensaje1 );
            request.setAttribute("respuesta3", mensaje2 );
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
