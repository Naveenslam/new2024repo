<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="div.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Page</title>
</head>
<body>
Result:

<% //scriptlet tag

int i=Integer.parseInt(request.getParameter("in1"));
int j=Integer.parseInt(request.getParameter("in2"));

int k=add(i,j);


out.println(k + " Kodi");
%>

<%!  //declaration tag

int pi=3;

static int add(int i, int j)
{
	
	int k=i+j;
	return k;
	
}

%>
<%="result" +k*pi %>


</body>
</html>