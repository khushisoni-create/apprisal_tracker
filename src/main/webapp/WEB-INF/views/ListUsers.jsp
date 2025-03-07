<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- this is jstl import to use jstl tags in html -->

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta content="width=device-width, initial-scale=1.0" name="viewport">

<title>Admin Master</title>
<meta content="" name="description">
<meta content="" name="keywords">

<!-- Favicons -->
<link href="assets/img/favicon.png" rel="icon">
<link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

<!-- Google Fonts -->
<link href="https://fonts.gstatic.com" rel="preconnect">
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"
	rel="stylesheet">

<!-- Vendor CSS Files -->
<link href="assets/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="assets/vendor/bootstrap-icons/bootstrap-icons.css"
	rel="stylesheet">
<link href="assets/vendor/boxicons/css/boxicons.min.css"
	rel="stylesheet">
<link href="assets/vendor/quill/quill.snow.css" rel="stylesheet">
<link href="assets/vendor/quill/quill.bubble.css" rel="stylesheet">
<link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
<link href="assets/vendor/simple-datatables/style.css" rel="stylesheet">

<!-- Template Main CSS File -->
<link href="assets/css/style.css" rel="stylesheet">

<!-- =======================================================
  * Template Name: NiceAdmin
  * Template URL: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/
  * Updated: Apr 20 2024 with Bootstrap v5.3.3
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
</head>

<body class="">

	<jsp:include page="AdminHeader.jsp"></jsp:include>
	<jsp:include page="AdminSidebar.jsp"></jsp:include>


	<main id="main" class="main">

		<div class="pagetitle">
			<h1>Employees</h1>
			<nav>
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="hrhome">Home</a></li>
					<li class="breadcrumb-item"><a href="">List of Employees</a></li>
					<!-- <li class="breadcrumb-item active">List of Employees</li> -->
				</ol>
			</nav>
		</div>
		<!-- End Page Title -->

		<section class="section dashboard">
			<div class="row" style="min-height: 500px;">

				<!-- Left side columns -->
				<div class="col-lg-12">
					<div class="row">
						<!-- Reports -->
						<div class="col-12">
							<div class="card">


								<div class="card-body">
									<h5 class="card-title">
										Employess
										<!-- <span>/Today</span> -->
									</h5>

									<div class="card">
										<div class="card-body">
											<h5 class="card-title">Table with stripped rows</h5>

											<!-- Table with stripped rows -->
											<table class="table table-striped">
												<thead>
													<tr>
														<th scope="col">User ID</th>
														<th scope="col">First Name</th>
														<th scope="col">Last Name</th>
														<th scope="col">Email</th>
														<th scope="col">Gender</th>
														<th scope="col">Contact Number</th>
														<th scope="col">Actions</th>
													</tr>
												</thead>
												<tbody>
													<c:forEach items="${userList}" var="m">
														<tr>
															<td>${m.userID}</td>
															<td>${m.firstName}</td>
															<td>${m.lastName}</td>
															<td>${m.email}</td>
															<td>${m.gender}</td>
															<td>${m.contactNumber}</td>
															<td><a href="viewparticularemployee?userID=${m.userID}">View</a> | <a href="">Edit</a> | <a href="">Delete</a></td>
														</tr>
													</c:forEach>

												</tbody>
											</table>
											<!-- End Table with stripped rows -->

										</div>
									</div>


								</div>

							</div>
						</div>
						<!-- End Reports -->

					</div>
				</div>
				<!-- End Left side columns -->

				<!-- Right side columns -->
				<!-- End Right side columns -->

			</div>
		</section>



	</main>
	<!-- End #main -->





	<!-- Template Main JS File -->
	<script src="assets/js/main.js"></script>

	<jsp:include page="AdminFooter.jsp"></jsp:include>

	<jsp:include page="AdminJs.jsp"></jsp:include>

</body>

</html>