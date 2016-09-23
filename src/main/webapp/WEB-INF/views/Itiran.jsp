<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>一覧画面</title>
</head>
<body>
<h1>会員一覧</h1><br>
<form:form modelAttribute="kouSAKU" method="post">
<c:forEach items="${LIST}" var="rr">
<input type="radio"value="${rr.id}" name="radio" checked="checked" />
         氏名：<c:out value="${rr.name}" />
         住所：<c:out value="${rr.address}" />
         電話番号<c:out value="${rr.tel}" /><br>
</c:forEach>
<input type="submit" name="kousaku" value="更新or削除">
</form:form>
<br>
    <form:form method="get" action="">
    <input type="submit" value="新規登録">
    </form:form>
</body>
</html>