<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet"
		href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
		integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
		crossorigin="anonymous">
	<link href="/style.css" rel="stylesheet" />
	
	<meta charset="ISO-8859-1">
	<title>Details Page</title>
</head>
<body>

	<!-- Header -->
	<section class="header">
	
	</section>
	
	<!-- MainBody -->
	<main class="container">
	
		<!-- Navigation -->
		<a href="/">Back to List</a>
		
		<!-- Title -->
		<h1>Donut</h1>
		
		<!-- Image -->
		<!-- 
		<img src="${donut.photo}"/>
		${donut.photo}
		<img src="https://grandcircusco.github.io/demo-apis/donuts/images/d1.jpg"/>
		<br>
			For some reason, it won't show the image. It does when I type in the address,
			but it says 'unknown' in the src when I type ${donut.photo}. Moving on though.
		 -->
		
		<!-- Donut Info -->
		<label>Name: </label>
		${donut.name}
		
		<br>
		
		<label>Calories: </label>
		${donut.calories}
		
		<ul>
			<c:forEach var="extra" items="${donut.extras}">
				<li>${extra}</li>
			</c:forEach>
		</ul>
	
	</main>

</body>
</html>