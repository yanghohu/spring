<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>      
<c:set var="ctx" value="${pageContext.request.contextPath}"/>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
회원가입화면
<form action="${ctx}/teateHouseInsert.do" method="post">
<table class="table table-bordered">
  <tr>
    <td>업소명</td>
    <td><input type="text" name="title"/></td>
  </tr> 
  <tr>
    <td>주소</td>
    <td><input type="text" name="area"/></td>
  </tr>
  <tr>
    <td>전화번호</td>
    <td><input type="text" name="tel"/></td>
  </tr>
  <tr>
    <td>영업일</td>
    <td><input type="text" name="holiday"/></td>
  </tr>
  <tr>
    <td>링크</td>
    <td><input type="text" name="urllink"/></td>
  </tr>
  <tr>
    <td colspan="2" align="center">
      <input type="submit" value="등록" class="btn btn-primary"/>
      <input type="reset" value="취소" class="btn btn-warning"/>
    </td>
  </tr>
</table>
</form>
</body>
</html>