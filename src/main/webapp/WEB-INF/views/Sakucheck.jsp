<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>削除確認画面</title>
</head>
<body>
<h1>本当に削除してもいいですか？</h1>
<br>
<form:form method="post" modelAttribute="SAKUZYO" >
<c:forEach items="${LIST3}" var="jj">
<input type="hidden" value="${jj.id}" name="id0" />
         氏名：<c:out value="${jj.name}" />
         住所：<c:out value="${jj.address}" />
         電話番号<c:out value="${jj.tel}" />
</c:forEach>
<br>
<br>
<input type="submit" value="削除" name="sakuzyo">
</form:form><br>
    <form:form modelAttribute="itiRAN" method="post">
<input type="submit" value="一覧表示" name="itirann">
</form:form>
</body>
</html>