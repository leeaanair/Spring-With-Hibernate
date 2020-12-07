<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
	<style>
		.error{color:red}
	</style>        
	    
<title>Customer Registration Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="customer">
		Fields with * is required
		<br>
		First Name* : <form:input path="firstName" />
		<form:errors path="firstName" cssClass="error" />
		
		<br>
		Last Name : <form:input path="lastName" />
		<br>
		<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>