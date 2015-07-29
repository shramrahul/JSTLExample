<%-- 
    Document   : emp.jsp
    Created on : Jul 9, 2015, 8:02:00 PM
    Author     : ShramRahul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="js" class="com.leapfrog.jstlexample.service.EmployeeService" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Page</title>
        <link herf="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" type="text/css" rel="stylesheet" />
        
    </head>
    <body>
        <div class="container">
            ${js.getAll()}
            <form action="" method="post">
                <div><select name="action">
                        <option value="">Select Action</option>
                        <option value="delete">Delete</option>
                        <option value="active">Active</option>
                        <option value="inactive">Inactive</option>
                        <option value="mail">Send Mail</option>
                        
                    
                    </select><button type ="submit" class="btn">Go </button></div>
                <table class="table table-bordered table-hover table-condensed table-responsive table-striped">
                    <tr>
                        <th><input type="checkbox" id="select all"/></th>
                        
                        <th>First name</th>
                        <th>Last Name</th>
                        <th>Email</th>
                        <th>Post</th>
                        <th>Salary</th>
                        <th>Phone</th>
                        <th>address</th>
                        <th>City Id</th>
                        <th>Action</th>
                    </tr>
                    
                    <c:forEach var="emp" items="${js.getAll()}">
                        <tr>
                            <td><input type="checkbox" name="checkbox" value="${emp.getEid()}"></td>
                            <td>${emp.getFirstName()}</td>
                            <td>${emp.getLastName()}</td>
                            <td>${emp.getEmail()}</td>
                            <td>${emp.getPost()}</td>
                            <td>${emp.getSalary()}</td>
                            <td>${emp.getContactNo()}</td>
                            <td>${emp.getAddress()}</td>
                            <td>${emp.getCityid()}</td>
                            <td><a href="" class="btn btn-success btn-group-sm">Edit</a><a href="" class="btn btn-danger btn-group-sm">Delete</a></td>
                       </tr>
                        </c:forEach>
                        
                    
                    
                </table>
            </form>
    </body>
</html>
