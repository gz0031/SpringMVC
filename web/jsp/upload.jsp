<%--
  Created by IntelliJ IDEA.
  User: 高泽
  Date: 2020/2/13
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传文件</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/test/upload.do"  enctype="multipart/form-data">
    <input type="file" name="imgs"><br>
    <input type="file" name="imgs"><br>
    <input type="file" name="imgs"><br>
    <input type="submit" value="上传">
</form>
</body>
</html>
