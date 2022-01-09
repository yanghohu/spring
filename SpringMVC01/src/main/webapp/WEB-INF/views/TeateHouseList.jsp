<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kr.bit.model.*" %>    
<%@ page import="java.util.*" %>
<%
     // ArrayList<MemberVO> list=(ArrayList<MemberVO>)request.getAttribute("list");
%>    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name='viewport' content='width=device-width, initial-scale=1'>
<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css'>
<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js'></script>
<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js'></script>
<script type="text/javascript">
  function deleteFn(num){
	  location.href="${ctx}/memberDelete.do?num="+num; // ?num=12
  }
</script>
</head>
<body>
[MVC04 예제 - FrontController+POJO]
<table class="table table-bordered">
  <tr>
    <td>번호</td> 
    <td>업소명</td>
    <td>주소</td>
    <td>전화번호</td>
    <td>영업일</td>
    <td>링크</td> 
    <td>삭제</td>
  </tr>
  <c:forEach var="vo" items="${list}">
    	  <tr>
    	    <td><a href="${ctx}/teateHouseContent.do?num=${vo.num}">${vo.num}</a></td> 
    	    <td>${vo.title}</td>
    	    <td>${vo.area}</td>
    	    <td>${vo.tel}</td>
    	    <td>${vo.holiday}</td>
    	    <td><a href="${vo.urllink}">${vo.urllink}</a></td> 
    	    <td><input type="button" value="삭제" class="btn btn-warning" onclick="deleteFn(${vo.num})"></td>
    	  </tr>    	 
  </c:forEach>
  <tr>
  <td colspan="8" align="right"><input type="button" value="맛집등록" class="btn btn-primary" onclick="location.href='${ctx}/teateHouseRegister.do'"/></td>
  </tr>
</table>
</body>
</html>