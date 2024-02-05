<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% if(session.getAttribute("username")==null){
    	
    	RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
    	
    	rd.forward(request, response);
    	
    }
    
   // response.setHeader("Cache-Control", arg1);
    
    
    %>
<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>Home</title>

</head>

<style>

body {

 font-family: Arial, sans-serif;

 margin: 0;

 padding: 0;

 background-color: #f4f4f4;

}

header {

 background-color: #0073e6;

 color: #fff;

 padding: 20px;

 text-align: center;

}

nav {

 background-color: #444;

 color: #fff;

 padding: 10px;

 text-align: right;

}

nav ul {

 list-style-type: none;

 padding: 0;

}

nav li {

 display: inline;

 margin-left: 20px;

}

nav .logout {

 float: right;

}

main {

 padding: 20px;

 background-color: #fff;

}

footer {

 background-color: #0073e6;

 color: #fff;

 text-align: center;

 padding: 10px;

}

nav a, nav .logout {

 text-decoration: none;

 color: #fff;

}

h1 {

 font-size: 36px;

 margin: 0;

}

p {

 font-size: 18px;

}

</style>

<body>

 <header>

 <h1>Homepage</h1>

 </header>

 <nav>

 <ul>

  <li class="logout"><a href="logout">Logout</a></li>

  <li><a href="#">Home</a></li>

  <li><a href="profile.jsp">Profile</a></li>

  <li><a href="about.jsp">About</a></li>

  <li><a href="contact.jsp">Contact</a></li>

 </ul>

 </nav>

 <main>

 <h2>

  Welcome

  <% String username=(String)session.getAttribute("username");

  out.print(username);

  session.setAttribute("username", username);

  %>

 </h2>

 <p>This is the main content area of our homepage. You can add

  text, images, and other elements here to introduce your website and

  its purpose.</p>

 </main>

 <footer> &copy; 2023 Your Website Name </footer>

</body>

</html>

