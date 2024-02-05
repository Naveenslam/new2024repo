<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>


<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title></title>

</head>

<body>

 <%//scriplet

 int i = Integer.parseInt(request.getParameter("in1"));

 int j = Integer.parseInt(request.getParameter("in2"));

 int k = add(i,j);

 list();

 %>

 <%!//declration

 int pi=3;

 ArrayList<Integer> al=new ArrayList<Integer>();

 static int add(int i,int j)

 {

 int k=i+j;

 return k;

 }

 void list(){

 al.add(10);

 al.add(15);

 al.add(2);

 }

 %>

 <% out.print(al); %>

</body>

</html>