<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoginPage</title>
 <link type="text/css" rel="stylesheet" href="css/login.css"> 
</head>
<body>
    
        
	    <h1>Administrator Login </h1>
	    <form action="admin" method="POST">  
        <div class="container">   
        	<input type="hidden" name="category" value="LOGIN" />
            <label>User Name : </label>   
            <br/>
            <input type="text" placeholder="Enter Email" name="email" required>  
            <br/>
            <label>Password : </label>   
            <br/>
            <input type="password" placeholder="Enter Password" name="password" required>  
            <br/>
            <button type="submit">Login</button>   
            <br/>
            <input type="checkbox" checked="checked"> Remember me   
             
        </div>   
    </form>
</body>
</html>