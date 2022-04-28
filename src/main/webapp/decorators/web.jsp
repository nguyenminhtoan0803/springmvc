<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang chủ</title>
<!-- Favicon-->
<!-- <link rel="icon" type="image/x-icon" href="assets/favicon.ico" /> -->
<link rel="icon" type="image/x-icon"
	href="<c:url  value='/template/web/assets/favicon.ico' />" />
<!-- Core theme CSS (includes Bootstrap)-->
<!-- <link href="css/styles.css" rel="stylesheet" /> -->
<link href="<c:url value='/template/web/css/styles.css' />"
	rel="stylesheet">
</head>
<body>

	<%@include file="/common/web/header.jsp"%>

	<dec:body />

	<%@include file="/common/web/footer.jsp"%>
	<!-- Bootstrap core JS-->
	<!-- <script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script> -->

	<script
		src="<c:url value='https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js' />"></script>
	<!-- Core theme JS-->
	<!-- <script src="js/scripts.js"></script> -->
	<script src="<c:url value='/template/web/js/scripts.js'/>"
		type="text/javascript"></script>
</body>
</html>