<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>削除完了画面</title>
</head>
<body>
<center><h1>削除しました！！</h1></center>
<br><br>
<form:form modelAttribute="itiRAN" method="post">
<center>
<input type="submit" value="一覧表示" name="itirann">
</center>
</form:form>
</body>
</html>