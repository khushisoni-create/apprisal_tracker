<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Signup</title>
</head>
<body>
	<h2>Signup</h2>
	<form action="saveuser" method="post"> 

			<table>
			<tr>
			    <td>FirstName:</td>
			    <td> <input type="text" name="firstName"/> </td> 
			  </tr>  
			
			<tr>
			   <td>LastName:</td>
			   <td><input type="text" name="lastName" /></td>
			  </tr> 


			     <tr>
			   <td>Email:</td> 
			   <td><input type="text" name="email"/></td>
			   </tr>

			   <tr>
			   <td>Password:</td>
			   <td><input type="password" name="password"/></td>
			   </tr>

			  <tr>
			   <td>Gender:</td>
			    <td><input type="radio" name="gender" value="male">Male &nbsp;
			        <input type="radio" name="gender" value="female">Female</td>
				</tr>

		
			<tr>	   		
			   <td>Contact:</td> 
			   <td><input type="text" name="contactNum"/></td>
			</tr> 	
			
			<tr>	   		
			   <td>Position:</td> 
			   <td><input type="text" name="position"/></td>
			</tr> 	   	
			
			<tr>	   		
			   <td>DepartmentId:</td> 
			   <td><input type="text" name="departmentId"/></td>
			</tr> 	   		   

					   

				   		   

				

						   

			   

			   </table>

			  <input type="submit" value="Signup"/>

		</form>

	<a href="login">Login</a>
</body>
</html>