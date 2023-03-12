package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FormularioDinamico_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("         <link href=\"Estilo/Style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <title>Conocimiento</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>¿Cuánto sabes de...? </h1><br><br>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("    <center><form method=\"post\" id=\"formulario\">\r\n");
      out.write("            <input type=\"submit\" name=\"tema\" value=\"Deporte\">\r\n");
      out.write("            <input type=\"submit\" name=\"tema\" value=\"Entretenimiento\" >\r\n");
      out.write("            <input type=\"submit\" name=\"tema\" value=\"Cultura\">\r\n");
      out.write("        </form></center> \r\n");
      out.write("    \r\n");
      out.write("    <br>\r\n");
      out.write("\r\n");
      out.write("        ");


            if (request.getParameter("tema") != null) {

                if (request.getParameter("tema").equals("Deporte")) {    
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div id=\"div\">  \r\n");
      out.write("                \r\n");
      out.write("                <h1 >Deporte</h1> <br>\r\n");
      out.write("\r\n");
      out.write("                <form method=\"post\"  action=\"Datos\" id=\"dos\">\r\n");
      out.write("\r\n");
      out.write("            <label>1.¿Cómo ganar masa muscular?</label><br><br>\r\n");
      out.write("            <select name=\"respuesta1\" id=\"select\" required>\r\n");
      out.write("                <option value=\"1\">Comiendo empanadas</option>\r\n");
      out.write("                <option value=\"2\"> Inyectandose Esteroides</option>\r\n");
      out.write("                <option value=\"3\"> Comiendo Proteina</option>\r\n");
      out.write("            </select>\r\n");
      out.write("            <br><br>\r\n");
      out.write("            <label>2.¿Qué equipo gano el mundial del 2014?</label><br><br>\r\n");
      out.write("            <input type=\"radio\" value=\"1\" name=\"respuesta2\" required >Colombia (Era gol de Yepes)<br>\r\n");
      out.write("            <input type=\"radio\" value=\"2\" name=\"respuesta2\" required> Argentina<br>\r\n");
      out.write("            <input type=\"radio\" value=\"3\" name=\"respuesta2\" required>Alemania<br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>3.Responde verdadero o falso ¿El patinaje es un deporte olimpico?</label><br><br>\r\n");
      out.write("            <input type=\"radio\" value=\"1\" name=\"respuesta3\" required>Verdadero<br>\r\n");
      out.write("            <input type=\"radio\" value=\"2\" name=\"respuesta3\"  required> Falso<br>\r\n");
      out.write("    \r\n");
      out.write("            <br>\r\n");
      out.write("            <label>4.¿Qué opina sobre la recuperación del Ciclista Colombiano Egan Bernal?</label><br><br>\r\n");
      out.write("            <p><textarea name=\"repsuesta3\" placeholder=\"Comparte tu opinion\" cols=\"40\" rows=\"5\" id=\"area\" required></textarea></p>\r\n");
      out.write("            <br>\r\n");
      out.write("            <input type=\"submit\" value=\"Enviar\" id=\"guardar\">   \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("        </form>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        ");
  }
                if (request.getParameter("tema").equals("Entretenimiento")) {
      out.write("\r\n");
      out.write("                <div id=\"div\">\r\n");
      out.write("                <h1>Entretenimiento</h1>\r\n");
      out.write("                <form id=\"dos\"  method=\"post\" action=\"Datos2\" >\r\n");
      out.write("                     <label>1.¿Will Smith ganó Oscar por...?</label><br><br>\r\n");
      out.write("            <select name=\"respuesta4\" id=\"select\" required>\r\n");
      out.write("                <option value=\"1\">Mejor Actor</option>\r\n");
      out.write("                <option value=\"2\">Mejor Pelicula</option>\r\n");
      out.write("                <option value=\"3\">Mejor Comediante</option>\r\n");
      out.write("            </select>\r\n");
      out.write("                      <br><br>\r\n");
      out.write("             <label>2.¿Cúantas fases tiene el UCM?</label><br><br>\r\n");
      out.write("            <input type=\"radio\" value=\"1\" name=\"respuesta5\" required>3<br>\r\n");
      out.write("            <input type=\"radio\" value=\"2\" name=\"respuesta5\" required>4<br>\r\n");
      out.write("            <input type=\"radio\"  value=\"3\" name=\"respuesta5\" required>7<br>\r\n");
      out.write("            <br>\r\n");
      out.write("             <label>3.¿Cúal es la pelicula mas taquillera de la hsitoria?</label><br><br>\r\n");
      out.write("            <input type=\"radio\" value=\"1\"  name=\"respuesta6\" required>Avengers End Game<br>\r\n");
      out.write("            <input type=\"radio\"  value=\"2\" name=\"respuesta6\" required>Avatar<br>\r\n");
      out.write("            <input type=\"radio\"  value=\"3\" name=\"respuesta6\" required>Satr Wars<br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>3.¿Qué opina sobre el caso de Jonny Deep y Amber?</label><br><br>\r\n");
      out.write("            <p><textarea name=\"repsuesta3\" placeholder=\"Comparte tu opinion\" cols=\"40\" rows=\"5\" id=\"area\" required></textarea></p>\r\n");
      out.write("            <input type=\"submit\" value=\"Enviar\" id=\"guardar\">\r\n");
      out.write("        </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("        ");
  } 
             if (request.getParameter("tema").equals("Cultura")){
      out.write("\r\n");
      out.write("             <div id=\"div\">\r\n");
      out.write("               <h1>Cultura</h1>\r\n");
      out.write("\r\n");
      out.write("               <form id=\"dos\" method=\"post\" action=\"Datos3\">\r\n");
      out.write("           <label>1.¿Cuál es el planeta más grande del Sistema Solar?</label><br><br>\r\n");
      out.write("            <select name=\"respuesta7\" id=\"select\" required>\r\n");
      out.write("                <option value=\"1\">Marte</option>\r\n");
      out.write("                <option value=\"2\">Jupiter</option>\r\n");
      out.write("                <option value=\"3\">Saturno</option>\r\n");
      out.write("            </select>\r\n");
      out.write("            <br><br>\r\n");
      out.write("            <label>2.¿Cuántas notas musicales existen?</label><br><br>\r\n");
      out.write("            <input type=\"radio\" name=\"respuesta8\" value=\"1\" required>20<br>\r\n");
      out.write("            <input type=\"radio\" name=\"respuesta8\" value=\"2\" required>6<br>\r\n");
      out.write("            <input type=\"radio\" name=\"respuesta8\" value=\"3\" required>12<br>\r\n");
      out.write("            <br>\r\n");
      out.write("            \r\n");
      out.write("              <label>3.Responde verdadero o falso ¿New York es la capital de Estados Unidos?</label><br><br>\r\n");
      out.write("            <input type=\"radio\" name=\"respuesta9\" value=\"1\" required>Falso<br>\r\n");
      out.write("            <input type=\"radio\" name=\"respuesta9\" value=\"2\" required>Verdadero<br>\r\n");
      out.write("           \r\n");
      out.write("            <br>\r\n");
      out.write("            \r\n");
      out.write("            <label>4.¿Cúal comida le gusta mas de la cultura Colombiana?</label><br><br>\r\n");
      out.write("            <p><textarea name=\"repsuesta9\" placeholder=\"Comparte tu opinion\" cols=\"40\" rows=\"5\" id=\"area\" required></textarea></p>\r\n");
      out.write("            <input type=\"submit\" value=\"Enviar\" id=\"guardar\">\r\n");
      out.write("        </form>\r\n");
      out.write("   </div>\r\n");
      out.write("             \r\n");
      out.write("             \r\n");
}
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("    ");
 
        if(request.getAttribute("respuesta1") !=null){
      out.write("\r\n");
      out.write("        <h1>RESULTADOS</h1><BR>\r\n");
      out.write("        <h2 id=\"dos\">\r\n");
      out.write("            La pregunta #1 es: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${respuesta1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("        </h2>\r\n");
      out.write("            \r\n");
      out.write("       ");
 }
        
        
      out.write("\r\n");
      out.write("        <br>\r\n");
      out.write("         ");
 
        if(request.getAttribute("respuesta2") !=null){
      out.write("\r\n");
      out.write("            \r\n");
      out.write("        <h2 id=\"dos\">\r\n");
      out.write("            La pregunta #2 es: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${respuesta2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("        </h2>\r\n");
      out.write("            \r\n");
      out.write("       ");
 }
        
        
      out.write("\r\n");
      out.write("          <br>\r\n");
      out.write("         ");
 
        if(request.getAttribute("respuesta3") !=null){
      out.write("\r\n");
      out.write("            \r\n");
      out.write("        <h2 id=\"dos\">\r\n");
      out.write("            La pregunta #3 es: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${respuesta3}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("        </h2>\r\n");
      out.write("            \r\n");
      out.write("       ");
 }
        
        
      out.write("\r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("    ");
 
        if(request.getAttribute("respuesta4") !=null){
      out.write("\r\n");
      out.write("        <h1>RESULTADOS</h1><BR>\r\n");
      out.write("        <h2 id=\"dos\">\r\n");
      out.write("            La pregunta #1 es: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${respuesta4}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("        </h2>\r\n");
      out.write("            \r\n");
      out.write("       ");
 }
        
        
      out.write("\r\n");
      out.write("                <br>\r\n");
      out.write("\r\n");
      out.write("         ");
 
        if(request.getAttribute("respuesta5") !=null){
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <h2 id=\"dos\">\r\n");
      out.write("            La pregunta #2 es: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${respuesta5}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("        </h2>\r\n");
      out.write("            \r\n");
      out.write("       ");
 }
        
        
      out.write("\r\n");
      out.write("               <br>\r\n");
      out.write("\r\n");
      out.write("         ");
 
        if(request.getAttribute("respuesta6") !=null){
      out.write("\r\n");
      out.write("       \r\n");
      out.write("        <h2 id=\"dos\">\r\n");
      out.write("            La pregunta #3 es: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${respuesta6}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("        </h2>\r\n");
      out.write("            \r\n");
      out.write("       ");
 }
        
        
      out.write("\r\n");
      out.write("      \r\n");
      out.write("        \r\n");
      out.write("         ");
      out.write("\r\n");
      out.write("    ");
 
        if(request.getAttribute("respuesta7") !=null){
      out.write("\r\n");
      out.write("        <h1>RESULTADOS</h1><BR>\r\n");
      out.write("        <h2 id=\"dos\">\r\n");
      out.write("            La pregunta #1 es: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${respuesta7}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("        </h2>\r\n");
      out.write("            \r\n");
      out.write("       ");
 }
        
        
      out.write("\r\n");
      out.write("                <br>\r\n");
      out.write("\r\n");
      out.write("         ");
 
        if(request.getAttribute("respuesta8") !=null){
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <h2 id=\"dos\">\r\n");
      out.write("            La pregunta #2 es: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${respuesta8}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("        </h2>\r\n");
      out.write("            \r\n");
      out.write("       ");
 }
        
        
      out.write("\r\n");
      out.write("               <br>\r\n");
      out.write("\r\n");
      out.write("         ");
 
        if(request.getAttribute("respuesta9") !=null){
      out.write("\r\n");
      out.write("       \r\n");
      out.write("        <h2 id=\"dos\">\r\n");
      out.write("            La pregunta #3 es: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${respuesta9}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("        </h2>\r\n");
      out.write("            \r\n");
      out.write("       ");
 }
        
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("<footer>\r\n");
      out.write("    <h3>Realizado por Karen</h3>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
