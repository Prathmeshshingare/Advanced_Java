<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="skyblue" text="black">

<jsp:useBean id="cust" class="com.bean.Customer_Bean"><!--Create an instance  -->
<!-- Customer_Bean cb=new Customer_Bean(); -->
<jsp:setProperty property="custId" name="cust" param="custId"/>
<jsp:setProperty property="custName" name="cust" param="custName"/>

<!-- Fatch data -->

	<h3>Customer Data</h3>
	<jsp:getProperty property="custId" name="cust"/>
	<jsp:getProperty property="custName" name="cust"/><br>
	${cust.custId}    <!-- Expression lang used for scpe -->
</jsp:useBean>
</body>
</html>