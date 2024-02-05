<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.util.*"%>
<%@page import="java.sql.DriverManager"%>

<%@page import="java.sql.Connection"%>


  <%! static String username=""; %>

  <% username= (String)session.getAttribute("username");%>

<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>Profile</title>

</head>

<style>

body {

 font-family: Arial, sans-serif;

 background-color: #f4f4f4;

 margin: 0;

 padding: 0;

}

header {

 background-color: #0073e6;

 color: #fff;

 padding: 20px;

 text-align: center;

}

main {

 max-width: 800px;

 margin: 0 auto;

 padding: 20px;

 background-color: #fff;

 border-radius: 5px;

 box-shadow: 0 0 5px rgba(0, 0, 0, 0.2);

}

table {

 width: 100%;

 border-collapse: collapse;

}

table, th, td {

 border: 1px solid #ddd;

}

th, td {

 padding: 10px;

 text-align: left;

 vertical-align: middle; /* Vertical center alignment */

}

th {

 background-color: #0073e6;

 color: #fff;

}

</style>

<body>

<%

ConnectionDB cdb=new ConnectionDB();

%>

<main>

 <table>

  <tr>

  <th>UserName</th>

  <td><% out.print(username); %></td>

  </tr>

  <tr>

  <th>Email</th>

  <td>

  <% //String email=cdb.getusername(username);

  //out.print(email);%></td>

  </tr>

  <tr>

  <th>Date of Birth</th>

  <td>1990-05-15</td>

  </tr>

  <tr>

  <th>Mobile</th>

  <td>555-123-4567</td>

  </tr>

  <tr>

  <th>Password</th>

  <td>********</td>

  </tr>

  <tr>

  <th>Degree</th>

  <td>Bachelor of Science</td>

  </tr>

  <tr>

  <th>Year of Passing</th>

  <td>2012</td>

  </tr>

 </table>

 </main>

</body>

</html>