<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang chủ</title>
<!-- <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" /> -->
<link
	href="<url value='https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css' />"
	rel="stylesheet" />
<!-- <link href="css/styles.css" rel="stylesheet" /> -->
<link href="<c:url value='/template/admin/css/styles.css' />"
	rel="stylesheet" type="text/css">
<!-- <script
	src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js" crossorigin="anonymous"></script> -->

<script
	src="<c:url value='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js' />"></script>
</head>
<body class="sb-nav-fixed">

	<%@include file="/common/admin/header.jsp" %>
	
	<dec:body />
	
	<!--   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script> -->
	<script
		src="<c:url value='https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js' />"></script>

	<!-- <script src="js/scripts.js"></script> -->
	<script src="<c:url value='/template/admin/js/scripts.js' />"></script>

	<!-- <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script> -->
	<script
		src="<c:url value='https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js' />"></script>

	<!-- <script src="assets/demo/chart-area-demo.js"></script> -->
	<script
		src="<c:url value='/template/admin/assets/demo/chart-area-demo.js' />"></script>

	<!-- <script src="assets/demo/chart-bar-demo.js"></script> -->
	<script
		src="<c:url value='/templat/admin/assets/demo/chart-bar-demo.js' />"></script>

	<!-- <script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script> -->
	<script
		src="<c:url value='https://cdn.jsdelivr.net/npm/simple-datatables@latest' />"></script>

	<!-- <script src="js/datatables-simple-demo.js"></script> -->
	<script
		src="<c:url value='/template/admin/js/datatables-simple-demo.js' />"></script>
</body>
</html>