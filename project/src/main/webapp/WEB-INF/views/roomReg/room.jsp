<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
.x>div {
		border: 1px solid black;
		width: 200px;
		height: 200px;
	}
	.x{
		width: 700px;
		height: 300px;
		display: flex;
		justify-content: space-around;
	}
</style>
<%@ include file="../MAIN/header.jsp"%>
<h1>room</h1>
<br>
<form action="reg" method="post">
	<div class="x">
		<div></div>
		<div></div>
		<div></div>
	</div>
	예약하기
	<input type="submit">
	</form>
	
<%@ include file="/WEB-INF/views/MAIN/footer.jsp"%>