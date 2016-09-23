<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>更新画面</title>
</head>
<body>
<h1>会員情報の登録</h1><br>
    <form:form method="post" modelAttribute="KOUSIN">
<c:forEach items="${LIST2}" var="ll">
<input type="hidden" value="${ll.id}" name="id000" />
<input type="hidden" value="${ll.name}" name="name000" />
<input type="hidden" value="${ll.address}" name="address000" />
<input type="hidden" value="${ll.tel}" name="tel000" />
         氏名：<c:out value="${ll.name}" />
         住所：<c:out value="${ll.address}" />
         電話番号<c:out value="${ll.tel}" />
</c:forEach>
<br>

氏名　<form:input path="simei2" /><br>
住所　<form:input path="zyuusyo2" /><br>
電話番号　<form:input path="dennwa2" /><br>
<br>
    <input type="submit" value="更新" name="kou">
    <input type="reset" value="リセット">
    </form:form>
    <form:form modelAttribute="itiRAN" method="post">
<input type="submit" value="一覧表示" name="itirann">
</form:form><br>
<form:form method="post" modelAttribute="SAKUZYOC">
<c:forEach items="${LIST2}" var="aa">
<input type="hidden" value="${aa.id}" name="id00" />
<input type="hidden" value="${aa.name}" name="name00" />
<input type="hidden" value="${aa.address}" name="address00" />
<input type="hidden" value="${aa.tel}" name="tel00" />
</c:forEach>
    <input type="submit" value="削除" name="sakuzyoc">
</form:form>
</body>
</html>