<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="errorPage.jsp" %>
      <%@ include file="add.jsp" %> 
   
   <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DivOutput</title>
</head>
<body>
<%//scriptlet

   int m=Integer.parseInt(request.getParameter("in1"));
   int n=Integer.parseInt(request.getParameter("in2"));
   
   int o = m/n;
   
   %>
   <%= "Quotient: "+m %><br>



</body>
</html>