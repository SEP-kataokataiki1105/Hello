<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<title>登録画面
</title>
</head>
<body>
<h1>
会員情報の登録
</h1>
<br>
<form:form modelAttribute="formmodel" method="post">
氏名：<form:input path="simei" /><br>
住所：<form:input path="zyuusyo" /><br>
電話番号：<form:input path="dennwa" /><br>

<input type="submit" value="登録" name="touroku"/>
<input type="reset" value="リセット" />
</form:form>

<form:form modelAttribute="itiRAN" method="post">
<input type="submit" value="一覧表示" name="itiran">
</form:form>

</body>
</html>