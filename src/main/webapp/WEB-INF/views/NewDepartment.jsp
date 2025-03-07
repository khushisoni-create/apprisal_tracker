<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Home | HR</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
<style>
body {
	background-color: #0A192F;
	color: #ffffff;
}

#sidebar {
	width: 230px;
	background-color: #112240;
	transition: transform 0.3s ease-in-out;
	position: fixed;
	height: 100vh;
}

.hide-sidebar {
	transform: translateX(-100%);
}

.nav-link {
	color: #64ffda;
}

.nav-link:hover {
	color: #52d6b9;
}

.active {
	background-color: rgba(100, 255, 218, 0.2);
}

.btn-custom {
	background-color: #64ffda;
	color: #0A192F;
	transition: 0.3s;
}

.btn-custom:hover {
	background-color: #52d6b9;
}

.table-dark {
	background-color: #112240;
}

.table-info {
	background-color: #64ffda;
	color: #0A192F;
}

#main-content {
	max-width: 1000px;
	margin: 20px auto;
	text-align: center;
	transition: all 0.3s ease-in-out;
	position: relative;
	left: 50%;
	transform: translateX(-50%);
}

@media ( max-width : 992px) {
	#main-content {
		left: 50%;
		transform: translateX(-50%);
		margin-left: 0 !important;
	}
}

.add-department-btn {
	position: relative;
	top: -20px;
}
</style>
</head>
<body>
	<button class="btn btn-custom position-fixed"
		style="top: 10px; left: 10px; z-index: 1050;"
		onclick="toggleSidebar()">
		<i class="fas fa-bars"></i>
	</button>

	<div id="sidebar" class="d-flex flex-column flex-shrink-0 p-3">
		<h4 class="text-center text-white">HR Panel</h4>
		<hr>
		<ul class="nav nav-pills flex-column mb-auto">
			<li class="nav-item"><a href="hrhome" class="nav-link active"><i
					class="fas fa-home"></i> Dashboard</a></li>
			<li><a href="adduser" class="nav-link"><i
					class="fas fa-users"></i> Employees</a></li>
			<li><a href="newdepartment" class="nav-link"><i
					class="fas fa-building"></i>Departments & Positions</a></li>
			<li><a href="settings" class="nav-link"><i
					class="fas fa-cog"></i> Settings</a></li>
		</ul>
		<hr>
		<!-- <a href="newdepartment" class="btn btn-custom w-100 add-department-btn"><i class="fas fa-plus"></i> Add Department</a> -->
	</div>

	<div class="container" id="main-content">
		<h2 class="text-center my-4" style="color: #64ffda;">Home - HR</h2>
		<h2>Add Departments</h2>
		<div class="container p-4 rounded shadow"
			style="background-color: #233554;">
			<form action="savedepartment" method="post">
				Name of Department : <input type="text" name="departmentName">
				<input type="submit" value="Add Department">
			</form>

		</div>

		<h2>Add Positions</h2>
		<div class="container p-4 rounded shadow"
			style="background-color: #233554;">
			<form action="saveposition" method="post">
				Name of Position : <input type="text" name="positionName"> <br>
				Department: <select name="departmentID" required>
					<option>Select Department</option>

					<c:forEach items="${allDepartment}" var="d">

						<option value="${d.departmentID}">${d.departmentName}</option>

					</c:forEach>

				</select> <br> <input type="submit" value="Add Department">
			</form>

		</div>
	</div>

	<script>
        function toggleSidebar() {
            let sidebar = document.getElementById("sidebar");
            let mainContent = document.getElementById("main-content");
            sidebar.classList.toggle("hide-sidebar");
            
            setTimeout(() => {
                let sidebarWidth = sidebar.classList.contains("hide-sidebar") ? 0 : 230;
                mainContent.style.left = `calc(50% + ${sidebarWidth / 4}px)`;
            }, 300);
        }
    </script>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>