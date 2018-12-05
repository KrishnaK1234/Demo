<%@page import="com.PersonBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="person" class="com.PersonBean" scope="request" />
<body>
	<jsp:setProperty name="person" property="name" value="Krishna" />
	Name of Person is :
	<jsp:getProperty name="person" property="name" />
	<%-- <%
		PersonBean pb = new PersonBean();
		pb.setName("Krishna");
		out.println(pb.getName());
		
	%> --%>
</body>
</html>