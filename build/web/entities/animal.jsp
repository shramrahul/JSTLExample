<%-- 
    Document   : animal
    Created on : Jul 10, 2015, 3:52:17 PM
    Author     : ShramRahul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="js" class="com.leapfrog.jstlexample.service.AnimalService" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link herf="${pageContext.request.contextPath}/assets/css/bootstrap.min.css  " type="text/css" rel="stylesheet" />
 
        <title>Animal Page</title>
    </head>
    <body>
        <h1>Animal page</h1>
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
                        <th> Category</th>
                        <th>Breed</th>
                        
                        <th>Gender</th>
                        <th>Color</th>
                        <th>Price</th>
                        <th>Action</th>
                    </tr>
                    
                    <c:forEach var="anm" items="${js.getAll()}">
                        <tr>
                            <td><input type="checkbox" name="checkbox" value="${anm.getAnimalid()}"></td>
                            <td>${anm.getCategory()}</td>
                            <td>${anm.getBreed()}</td>
                            <td>${anm.getGender()}</td>
                            <td>${anm.getColor()}</td>
                            <td>${emp.getPrice()}</td>
                            <td><a href="" class="btn btn-success btn-group-sm">Edit</a><a href="" class="btn btn-danger btn-group-sm">Delete</a></td>
                         </tr>
                        </c:forEach>
                       
                    
                    
                </table>
            </form>
    </body>
</html>
