<%
String userName = request.getParameter("username");
String password = request.getParameter("password");
if("admin".equals(userName) && "admin".equals(password)){
	response.sendRedirect("home.jsp");
}
else{
	response.sendRedirect("adminLogin.jsp?msg=invalid");
}
%>