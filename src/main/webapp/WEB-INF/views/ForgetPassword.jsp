<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Apprisal Tracker | Forgot Password</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <style>
        body {
            background-color: #0A192F;
            color: #ffffff;
        }
        .forgot-box {
            width: 360px;
            margin: 80px auto;
            padding: 30px;
            background: #112240;
            border-radius: 10px;
            box-shadow: 0 0 15px rgba(255, 255, 255, 0.2);
        }
        .forgot-box h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #64ffda;
        }
        .btn-custom {
            background-color: #64ffda;
            color: #112240;
        }
        .form-control:focus {
    		background-color: #233554 !important;
    		color: white;
    		border-color: #2ea489;
    		box-shadow: 0 0 5px rgba(80, 204, 174, 0.5);
		}        
        .btn-custom:hover {
            background-color: #52d6b9;
            color: #0A192F;
        }
        .form-control {
            background: #233554;
            color: #ffffff;
            border: none;
        }
        .form-control::placeholder {
            color: #a8b2d1;
        }
        .input-group-text {
            background: #233554;
            border: none;
            color: #64ffda;
        }
       .login-link {
            color: #64ffda;
            text-decoration: none;
        }
        .login-link:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="forgot-box">
        <h2>Forgot Password?</h2>
        <p class="text-center">Enter your email to receive an OTP.</p>
        <form action="resetpassword" method="post">
            <div class="mb-3">
                <label for="email" class="form-label">Email</label>
                <div class="input-group">
                    <span class="input-group-text"><i class="fas fa-envelope"></i></span>
                    <input type="email" name="email" class="form-control" placeholder="Enter your email" required>
                </div>
            </div>
            <div class="mb-3">
                <label for="otp" class="form-label">OTP</label>
                <div class="input-group">
                    <span class="input-group-text"><i class="fas fa-key"></i></span>
                    <input type="text" name="otp" class="form-control" placeholder="Enter OTP">
                </div>
            </div>
            <div class="d-grid gap-2">
                <button type="submit" class="btn btn-custom">Send OTP</button>
            </div>
        </form>
        <div class="text-center mt-3">
            <a href="login" class="login-link">Back to Login</a>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>