<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head> <%@ page isELIgnored="false" %>
<meta charset="UTF-8">
<title>Message page</title>
</head>
<body>
  <h1>Message </h1> 
  <h3> Content : ${message.content} </h3>
  <h5>Created At : ${message.createdDate}</h5>
<br \>

<a href="http://localhost:8080/SpringMVCDEMO/"> Home</a>

</body>
</html>