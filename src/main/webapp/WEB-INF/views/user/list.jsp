<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Users Show</title>
</head>
<body>
<h1>
    用户列表
</h1>


<c:forEach items="${users}" var="user">
    用户名：${user.username}－－－用户密码：${user.password}－－－ <a href="/user/delete/${user.id}">删除此用户</a><br>

</c:forEach>
</body>
</html>
