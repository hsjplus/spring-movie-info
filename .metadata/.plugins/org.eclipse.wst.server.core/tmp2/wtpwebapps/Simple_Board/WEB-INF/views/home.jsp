<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <%@ page session="false" %> --%>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<span align="left" >
		<div><img src="http://35.194.131.5:9999/files/img/${boardOne.mid }.jpg" width="300" height="450"></div>
		<div>${boardOne.name}</div>
		<div>${boardOne.playdate}</div>
	</span>	
	<span>
		<div><img src="http://35.194.131.5:9999/files/img/19820019.jpg" width="300" height="450"></div>
		<div>${boardOne.name}</div>
		<div>${boardOne.playdate}</div>
	</span>
	<!-- <table>
		<thead>
			<tr>
				<th>영화이름</th>
				<th>배급사</th>
				<th>개봉날짜</th>
				<th>국가</th>
				<th>관객수</th>
				<th>장르</th>
				<th>등급</th>
				<th>영화코드</th>
				<th>감성분석지수</th>
				<th>스토리</th>
				<th>배우,연기</th>
				<th>영상, 음향</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${boardList}" var="board">
				<tr>
					<td><img src="http://35.194.131.5:9999/files/img/19820019.jpg" width="200" height="250"></td>
					<td>${board.name}</td>
					<td>${board.company}</td>
					<td>${board.playdate}</td>
					<td>${board.country}</td>
					<td>${board.ticket}</td>
					<td>${board.genre}</td>
					<td>${board.rate}</td>
					<td>${board.mid}</td>
					<td>${board.senti}</td>
					<td>${board.story}</td>
					<td>${board.act}</td>
					<td>${board.video}</td>
			</c:forEach>
		</tbody>
	</table>
	-->
</body>
</html>
