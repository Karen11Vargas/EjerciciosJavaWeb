/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.IOException;
import java.io.PrintWriter; //permite crear las etiquetas html
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Karen
 */

//Es el url

@WebServlet(name = "MiPrimerServlet", urlPatterns = {"/Logica"})

//Es una clase que hereda de htpp
public class MiPrimerServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    //Son los metodos generados por el server, es  predeterminado
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { //clausula ( si hay un error puede haber una exepcion)
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) { //printWriter permite imprimier etiquetas html
           
            
            //request recibir parametros en http
            //reponsev envia
            //Sumar variables
            //Clases con letra mayucscula
            //metodos de una clase con letra minuscula
            //variables en minusculas, no espacios, no carcteres especial
            //recogo la operacion SIEMPRE CON REQUEST.GETPARAMETER (NAME)
            
            String operacion = request.getParameter("operacion");
            double numero1 = Double.parseDouble(request.getParameter("numero1")); //Para convertir un string a double
            double numero2 = Double.parseDouble(request.getParameter("numero2")); //Para recibir el dato del index con request 
            double resultado = 0;
            
            //Instanciamos la clase Operaciones
            Operaciones operaciones = new Operaciones();
           
            
            switch (operacion){
                
                case "Suma":
                    resultado = numero1 + numero2 ;
                    break;
                    
                case "Resta":
                    resultado = numero1 - numero2;
                    break;
                case "Multiplicacion":
                    //Resulatdo tomara el resultado que esta en operaciones que esta en multiplicar 
                    resultado=operaciones.multiplicar(numero1, numero2);
                    
                    //se debe poner un break o sino ejecutara case por case
                    break;
                    
                case "Division":
                    resultado = numero1 / numero2;
                    break;
                
                case "Seno":
                   
                    resultado=operaciones.seno(numero1);
                    break;
            }
    
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Mi primera Web</title>");            
            out.println("</head>");
            out.println(" <link href=\"Estilo/Estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>");
            out.println("<body>");
            out.println("<h1>Mi primer Servlet</h1>");
            out.print("<h2>Mi nombre es: Karen</h2>");
            out.print("<h3>El resultado de la operacion =" + resultado + "</h3");
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
