<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Apprisal Tracker | Reset Password</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #ff9966, #ff5e62);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .container {
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            text-align: center;
            width: 350px;
        }
        h2 {
            color: #333;
        }
        p {
            color: #666;
            font-size: 14px;
        }
        input[type="password"], 
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            margin: 5px 0;
            border: 1px solid #ddd;
            border-radius: 5px;
            font-size: 16px;
            box-sizing: border-box;
        }
        input[type="submit"] {
            background: linear-gradient(135deg, #ff9966, #ff5e62);
            color: white;
            border: none;
            cursor: pointer;
            font-weight: bold;
            transition: 0.3s ease-in-out;
        }
        input[type="submit"]:hover {
            opacity: 0.9;
        }
        a {
            display: inline-block;
            margin-top: 10px;
            color: #ff5e62;
            text-decoration: none;
            font-weight: bold;
        }
        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Reset Your Password</h2>
        <p>Enter your new password below.</p>
        <form action="login" method="post">
            <input type="password" name="newPassword" placeholder="Enter New Password" required/>
            <input type="password" name="confirmPassword" placeholder="Confirm New Password" required/>
            <input type="submit" value="Reset Password">
        </form>
        <a href="login">Back to Login</a>
    </div>
</body>
</html>