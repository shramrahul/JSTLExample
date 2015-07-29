<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="js" class="com.leapfrog.jstlexample.service.MurchendiseOrderService" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link herf="${pageContext.request.contextPath}/assets/css/bootstrap.min.css  " type="text/css" rel="stylesheet" />
 
        <title>Animal Page</title>
    </head>
    <body>
        <h1>Murchendise Order page</h1>
        <div class="container"></div>
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
                        <th> Item Id</th>
                        <th>Order date</th>
                        
                        <th>Receive Date</th>
                        <th>Supplier Id</th>
                        <th>Breed</th>
                        <th>Single Cost</th>
                        <th>Shipping cost</th>
                        <th>Quantity</th>
                        <th>Action</th>
                    </tr>
                    
                    <c:forEach var="mur" items="${js.getAll()}">
                        <tr>
                            <td><input type="checkbox" name="checkbox" value="${mur.getOrderId()}"></td>
                            <td>${mur.getItemId()}</td>
                            <td>${mur.getOrderDate()}</td>
                          
                            <td>${mur.getReceiveDate()}</td>
                            <td>${mur.getSupplierId()}</td>
                            <td>${mur.getBreed()}</td>
                             <td>${mur.getSingleCost()}</td>
                              <td>${mur.getShippingCost()}</td>
                              <td>${mur.getQuantity()}</td>
                            <td><a href="" class="btn btn-success btn-group-sm">Edit</a><a href="" class="btn btn-danger btn-group-sm">Delete</a></td>
                         </tr>
                        </c:forEach>
                       
                    
                    
                </table>
            </form>
    </body>
</html>
