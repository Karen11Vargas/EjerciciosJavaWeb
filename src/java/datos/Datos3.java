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
@WebServlet(name = "Datos3", urlPatterns = {"/Datos3"})
public class Datos3 extends HttpServlet {

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
             String respuesta7 = request.getParameter("respuesta7");
           String  mensaje6="";
            
            switch (respuesta7){
                case "1":
                     mensaje6= "Incorecta";
                     break;
                case "2":
                      mensaje6 = "Correcta";
                     break;
                case "3":
                      mensaje6 = "Incorrecta";
                     break;
            }
            
            
            String respuesta8 = request.getParameter("respuesta8");
            String mensaje7="";
            switch (respuesta8){
                
                case "1":
                    mensaje7 ="Incorecta";
                      break;
                case "2":
                      mensaje7 = "Incorrecta";
                     break;
                case "3":
                      mensaje7 = "Correcta";
                     break;
     
            }
            
            
            String respuesta9 = request.getParameter("respuesta9");
            String mensaje8="";
            switch (respuesta9){
                
                case "1":
                    mensaje8 ="Correcta";
                      break;
                case "2":
                      mensaje8 = "Incorrecta";
                     break;
              
               
            }

          
              request.setAttribute("respuesta7", mensaje6 );
            request.setAttribute("respuesta8", mensaje7 );
            request.setAttribute("respuesta9", mensaje8 );
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
