<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Page</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:sans-serif;
}

body{
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
    background:linear-gradient(135deg,#667eea,#764ba2);
}

.Main{
    width:400px;
    background:white;
    padding:35px;
    border-radius:15px;
    box-shadow:0 8px 20px rgba(0,0,0,0.3);
}

h1{
    text-align:center;
    margin-bottom:25px;
    color:#333;
}

label{
    display:block;
    margin-bottom:8px;
    color:#555;
    font-weight:bold;
}

input{
    width:100%;
    padding:12px;
    margin-bottom:18px;
    border:1px solid #ccc;
    border-radius:8px;
    outline:none;
    font-size:15px;
}

input:focus{
    border-color:#667eea;
    box-shadow:0 0 8px rgba(102,126,234,0.4);
}

.reg-btn{
    background:#667eea;
    color:white;
    border:none;
    cursor:pointer;
    font-size:16px;
    font-weight:bold;
    transition:0.3s;
}

.reg-btn:hover{
    background:#764ba2;
}

</style>

</head>

<body>

<div class="Main">

<h1>Register Page</h1>

<form action="RegisterServlet" method="post">

<label>User Name</label>
<input type="text"
name="username"
placeholder="Enter Your Username"
required>

<label>Password</label>
<input type="password"
name="password"
placeholder="Enter Your Password"
required>

<input type="submit"
value="Register"
class="reg-btn">

</form>

</div>

</body>
</html>