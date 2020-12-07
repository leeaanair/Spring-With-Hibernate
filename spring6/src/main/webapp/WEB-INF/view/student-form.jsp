<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Registration Form</title>
</head>
<body>

<form:form action="processForm" modelAttribute="student">
	First Name : <form:input type="text" placeholder="Enter firstname" path="firstName" />
	<br>
	Last Name : <form:input type="text" placeholder="Enter lastname" path="lastName" />
	<br>
	
	<form:select path="country">
	<form:option value="AM" label="America" />
	<form:options items="${student.countryOptions}"/> 
	</form:select>
	<br>
	
	<form:select path="gender">
 	<form:options items="${genderOptions}" /> 
	</form:select>
	<br>
	
	<ul>
	<li><form:radiobutton path="language" value="Java" element="li"/>Java</li>
	</ul>
	<ul>
	<form:radiobuttons path="language" items="${student.languageOptions}" element="li"/>
	</ul>
	
	<form:checkbox path="operatingSystems" value="linux"/> Linux
	<form:checkbox path="operatingSystems" value="windows"/>Windows
	<form:checkbox path="operatingSystems" value="MacOS"/>MAC
	
	
	<input type="submit" value="Submit"/>
</form:form>
</body>
</html>