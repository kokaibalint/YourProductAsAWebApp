<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User data</title>
</head>
<body>
<h1>Subbed users</h1>
<c:forEach items="${list}" var="record">
                    ${record.getEmail()}
                    <br/>
</c:forEach>
<a href="index.html">Exit user data page</a>
<br>
</body>
</html>
