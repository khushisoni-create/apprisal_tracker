<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Home | Add User</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="assets/img/favicon.png" rel="icon">
  <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.gstatic.com" rel="preconnect">
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
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

<body>
	<jsp:include page="AdminHeader.jsp"></jsp:include>
	<jsp:include page="AdminSidebar.jsp"></jsp:include>
  <main>
    <div class="container">

      <section class="section register min-vh-100 d-flex flex-column align-items-center justify-content-center py-4">
        <div class="container">
          <div class="row justify-content-center">
            <div class="col-lg-4 col-md-6 d-flex flex-column align-items-center justify-content-center py-4">

              <div class="d-flex justify-content-center py-4">
                <a href="index.html" class="logo d-flex align-items-center w-auto py-4">
                  <img src="assets/img/logo.png" alt="">
                  <span class="d-none d-lg-block">Appraisal Tracker</span>
                </a>
              </div><!-- End Logo -->

              <div class="card mb-3">

                <div class="card-body">

                  <div class="pt-2 pb-2">
                    <h5 class="card-title text-center pb-0 fs-4">Add Employee</h5>
                    <p class="text-center small">Enter employee details</p>
                  </div>

                  <form class="row g-3 needs-validation" action="saveuser" method="post" novalidate>
                    <div class="col-12">
                      <label for="yourName" class="form-label">First Name</label>
                      <input type="text" name="firstName" class="form-control" id="firstName" required>
                      <div class="invalid-feedback">Please, enter First Name!</div>
                    </div>
                    
                    <div class="col-12">
                      <label for="yourName" class="form-label">Last Name</label>
                      <input type="text" name="lastName" class="form-control" id="lastName" required>
                      <div class="invalid-feedback">Please, enter Last Name!</div>
                    </div>

                    <div class="col-12">
                      <label for="yourEmail" class="form-label">Email</label>
                      <input type="email" name="email" class="form-control" id="yourEmail" required>
                      <div class="invalid-feedback">Please enter a valid Email adddress!</div>
                    </div>
                    
                <div class="mb-3">
				<label class="form-label">Gender</label>
				<div class="d-flex gap-3">
						<input type="radio" name="gender" value="male" class="btn-check" id="btn-check-outlined" autocomplete="off">
						<label class="btn btn-outline-primary" for="btn-check-outlined">Male</label>
						
						<input type="radio" name="gender" value="female" class="btn-check" id="btn-check-outlined2" autocomplete="off">
						<label class="btn btn-outline-primary" for="btn-check-outlined2">Female</label>
						
						<input type="radio" name="gender" value="other" class="btn-check" id="btn-check-outlined3" autocomplete="off">
						<label class="btn btn-outline-primary" for="btn-check-outlined3">Other</label>
				</div>
			</div>

                    

                    <div class="col-12">
                      <label for="yourPassword" class="form-label">Contact Number</label>
                      <input type="text" name="contactNumber" class="form-control" id="yourPassword" required>
                      <div class="invalid-feedback">Please enter correct Number!</div>
                    </div>
                    
				<div class="mb-3">
				<label class="form-label">Department</label>
				<!-- <div class="input-group">
					<span class="input-group-text"><i class="fas fa-building"></i></span>  -->
				<select name="allDepartment" class="form-control" required>
					<option>Select Department</option>
					<c:forEach items="${allDepartmenta}" var="d">
						<option value="${d.departmentID}">${d.departmentName}</option>
					</c:forEach>
				</select>
				<!-- </div>  -->
			</div>

                <div class="mb-3">
				<label class="form-label">Position</label>
				<div class="input-group">
					<span class="input-group-text"><i class="fas fa-briefcase"></i></span>
					<select name="position" class="form-control" required>
						<option value="Junior Developer">Junior Developer</option>
						<option value="Senior Developer">Senior Developer</option>
						<option value="Project Manager">Project Manager</option>
						<option value="Team Leader">Team Leader</option>
						<option value="HR">HR</option>
						<option value="Accountant">Accountant</option>
						<option value="Communicator">Communicator</option>
						<option value="Frontend Developer">Frontend Developer</option>
						<option value="Backend Developer">Backend Developer</option>
					</select>
				</div>
			</div>
                

                    <div class="col-12">
                      <div class="form-check">
                        <input class="form-check-input" name="terms" type="checkbox" value="" id="acceptTerms" required>
                        <label class="form-check-label" for="acceptTerms">I agree and accept the <a href="#">terms and conditions</a></label>
                        <div class="invalid-feedback">You must agree before submitting.</div>
                      </div>
                    </div>
                    <div class="col-12">
                      <button class="btn btn-primary w-100" type="submit">Create Account</button>
                    </div>
                    <div class="col-12">
                      <p class="small mb-0">Already have an account? <a href="pages-login.html">Log in</a></p>
                    </div>
                  </form>

                </div>
              </div>

              <div class="credits">
                <!-- All the links in the footer should remain intact. -->
                <!-- You can delete the links only if you purchased the pro version. -->
                <!-- Licensing information: https://bootstrapmade.com/license/ -->
                <!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/ -->
                Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
              </div>

            </div>
          </div>
        </div>

      </section>

    </div>
  </main><!-- End #main -->

   <jsp:include page="AdminFooter.jsp"></jsp:include>
  <a href="#" class="back-to-top d-flex align-items-center justify-content-center active"><i class="bi bi-arrow-up-short"></i></a>
    
  <script src="assets/vendor/apexcharts/apexcharts.min.js"></script>
  <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="assets/vendor/chart.js/chart.umd.js"></script>
  <script src="assets/vendor/echarts/echarts.min.js"></script>
  <script src="assets/vendor/quill/quill.js"></script>
  <script src="assets/vendor/simple-datatables/simple-datatables.js"></script>
  <script src="assets/vendor/tinymce/tinymce.min.js"></script>
  <script src="assets/vendor/php-email-form/validate.js"></script>

  <!-- Template Main JS File -->
  <script src="assets/js/main.js"></script>
    

</body>

</html>