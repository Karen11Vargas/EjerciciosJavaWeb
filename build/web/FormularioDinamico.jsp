<%-- 
    Document   : FormularioDinamico
    Created on : 4/05/2022, 09:12:46 AM
    Author     : Karen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="Estilo/Style.css" rel="stylesheet" type="text/css"/>
        <title>Conocimiento</title>
    </head>
    <body>
        <h1>¿Cuánto sabes de...? </h1><br><br>
        <%--Formulario HTML--%>
    <center><form method="post" id="formulario">
            <input type="submit" name="tema" value="Deporte">
            <input type="submit" name="tema" value="Entretenimiento" >
            <input type="submit" name="tema" value="Cultura">
        </form></center> 
    
    <br>

        <%

            if (request.getParameter("tema") != null) {

                if (request.getParameter("tema").equals("Deporte")) {    %>

                <div id="div">  
                
                <h1 >Deporte</h1> <br>

                <form method="post"  action="Datos" id="dos">

            <label>1.¿Cómo ganar masa muscular?</label><br><br>
            <select name="respuesta1" id="select" required>
                <option value="1">Comiendo empanadas</option>
                <option value="2"> Inyectandose Esteroides</option>
                <option value="3"> Comiendo Proteina</option>
            </select>
            <br><br>
            <label>2.¿Qué equipo gano el mundial del 2014?</label><br><br>
            <input type="radio" value="1" name="respuesta2" required >Colombia (Era gol de Yepes)<br>
            <input type="radio" value="2" name="respuesta2" required> Argentina<br>
            <input type="radio" value="3" name="respuesta2" required>Alemania<br>
            <br>
            <br>
            <label>3.Responde verdadero o falso ¿El patinaje es un deporte olimpico?</label><br><br>
            <input type="radio" value="1" name="respuesta3" required>Verdadero<br>
            <input type="radio" value="2" name="respuesta3"  required> Falso<br>
    
            <br>
            <label>4.¿Qué opina sobre la recuperación del Ciclista Colombiano Egan Bernal?</label><br><br>
            <p><textarea name="repsuesta3" placeholder="Comparte tu opinion" cols="40" rows="5" id="area" required></textarea></p>
            <br>
            <input type="submit" value="Enviar" id="guardar">   
            
            
        </form>
            
        </div>
        

        <%  }
                if (request.getParameter("tema").equals("Entretenimiento")) {%>
                <div id="div">
                <h1>Entretenimiento</h1>
                <form id="dos"  method="post" action="Datos2" >
                     <label>1.¿Will Smith ganó Oscar por...?</label><br><br>
            <select name="respuesta4" id="select" required>
                <option value="1">Mejor Actor</option>
                <option value="2">Mejor Pelicula</option>
                <option value="3">Mejor Comediante</option>
            </select>
                      <br><br>
             <label>2.¿Cúantas fases tiene el UCM?</label><br><br>
            <input type="radio" value="1" name="respuesta5" required>3<br>
            <input type="radio" value="2" name="respuesta5" required>4<br>
            <input type="radio"  value="3" name="respuesta5" required>7<br>
            <br>
             <label>3.¿Cúal es la pelicula mas taquillera de la hsitoria?</label><br><br>
            <input type="radio" value="1"  name="respuesta6" required>Avengers End Game<br>
            <input type="radio"  value="2" name="respuesta6" required>Avatar<br>
            <input type="radio"  value="3" name="respuesta6" required>Satr Wars<br>
            <br>
            <label>3.¿Qué opina sobre el caso de Jonny Deep y Amber?</label><br><br>
            <p><textarea name="repsuesta3" placeholder="Comparte tu opinion" cols="40" rows="5" id="area" required></textarea></p>
            <input type="submit" value="Enviar" id="guardar">
        </form>
</div>

        <%  } 
             if (request.getParameter("tema").equals("Cultura")){%>
             <div id="div">
               <h1>Cultura</h1>

               <form id="dos" method="post" action="Datos3">
           <label>1.¿Cuál es el planeta más grande del Sistema Solar?</label><br><br>
            <select name="respuesta7" id="select" required>
                <option value="1">Marte</option>
                <option value="2">Jupiter</option>
                <option value="3">Saturno</option>
            </select>
            <br><br>
            <label>2.¿Cuántas notas musicales existen?</label><br><br>
            <input type="radio" name="respuesta8" value="1" required>20<br>
            <input type="radio" name="respuesta8" value="2" required>6<br>
            <input type="radio" name="respuesta8" value="3" required>12<br>
            <br>
            
              <label>3.Responde verdadero o falso ¿New York es la capital de Estados Unidos?</label><br><br>
            <input type="radio" name="respuesta9" value="1" required>Falso<br>
            <input type="radio" name="respuesta9" value="2" required>Verdadero<br>
           
            <br>
            
            <label>4.¿Cúal comida le gusta mas de la cultura Colombiana?</label><br><br>
            <p><textarea name="repsuesta9" placeholder="Comparte tu opinion" cols="40" rows="5" id="area" required></textarea></p>
            <input type="submit" value="Enviar" id="guardar">
        </form>
   </div>
             
             
<%}
}%>


      
<%--Recibir datos del primer cuestionario--%>
    <% 
        if(request.getAttribute("respuesta1") !=null){%>
        <h1>RESULTADOS</h1><BR>
        <h2 id="dos">
            La pregunta #1 es: ${respuesta1}
        </h2>
            
       <% }
        
        %>
        <br>
         <% 
        if(request.getAttribute("respuesta2") !=null){%>
            
        <h2 id="dos">
            La pregunta #2 es: ${respuesta2}
        </h2>
            
       <% }
        
        %>
          <br>
         <% 
        if(request.getAttribute("respuesta3") !=null){%>
            
        <h2 id="dos">
            La pregunta #3 es: ${respuesta3}
        </h2>
            
       <% }
        
        %>
       
        
        <%--Recibir datos del sugundo cuestionario--%>
    <% 
        if(request.getAttribute("respuesta4") !=null){%>
        <h1>RESULTADOS</h1><BR>
        <h2 id="dos">
            La pregunta #1 es: ${respuesta4}
        </h2>
            
       <% }
        
        %>
                <br>

         <% 
        if(request.getAttribute("respuesta5") !=null){%>
        
        <h2 id="dos">
            La pregunta #2 es: ${respuesta5}
        </h2>
            
       <% }
        
        %>
               <br>

         <% 
        if(request.getAttribute("respuesta6") !=null){%>
       
        <h2 id="dos">
            La pregunta #3 es: ${respuesta6}
        </h2>
            
       <% }
        
        %>
      
        
         <%--Recibir datos del tercer cuestionario--%>
    <% 
        if(request.getAttribute("respuesta7") !=null){%>
        <h1>RESULTADOS</h1><BR>
        <h2 id="dos">
            La pregunta #1 es: ${respuesta7}
        </h2>
            
       <% }
        
        %>
                <br>

         <% 
        if(request.getAttribute("respuesta8") !=null){%>
        
        <h2 id="dos">
            La pregunta #2 es: ${respuesta8}
        </h2>
            
       <% }
        
        %>
               <br>

         <% 
        if(request.getAttribute("respuesta9") !=null){%>
       
        <h2 id="dos">
            La pregunta #3 es: ${respuesta9}
        </h2>
            
       <% }
        
        %>

<footer>
    <h3>Realizado por Karen</h3>
</footer>

    </body>
</html>
