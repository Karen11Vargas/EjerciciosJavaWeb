<%-- 
    Document   : MiPrimerJSP
    Created on : 4/05/2022, 08:59:02 AM
    Author     : Karen
--%>

<%--@importar--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mi primer JSP</title>
    </head>
    <body>
        <h1>Mi primer JSP</h1>
        
        <%--Declaraciones globales--%>
        
        <%! 
              double numero1;
        %>
        
        <h2>Estoy haciendo mi primer ejercicio de JSP</h2>
        
        <%--Codigo Java en general--%>
        
        <% 
         double numero2 = 5;
         numero1 = 8;
         double resultado = numero1 + numero2;
        %>
        
         <%--Estiquea con = es para imprimir o monstrar una expresion--%>
        <h3>El resultado de la suma es = <%=resultado%></h3>
       
        
        
    </body>
</html>
