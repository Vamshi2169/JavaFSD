<%@page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>Hello  from HTML</h4>
<%= "<h4>Hello from JSP</h4>" %>

<% int x=5; %>
<input type="text" value="<%= x%>"><br/>

<% 
  for(int i=0;i<5;i++){
	  out.println("i="+i+"<br/>");
  }
%>

the current date is<%= new Date() %>
<%@include file="footer.html" %>

<form action="">
<input type="text" name="fname">
<input type="submit" name="click">

</form>
<%
if(request.getParameter("click")!=null){
	out.print("Hello"+request.getParameter("fname"));
}
%>
</body>
</html>