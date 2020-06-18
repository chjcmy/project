<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Insert title here</title>

	<!-- reference our style sheet -->
	
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>

	<div id="wrapper">
		<div id = "header">
			<h2>customer Realationship Manager</h2>
			</div>
	</div>

	<div id="container">
		<div id="content">
		
		<p>
		  
		  <!-- put new button: add customer -->
		  
		  <input type="button" value = "Add Customer"
				onclick="window.location.href='showFormForAdd'; returnfalse;"
				class="add-button"
		/>
		  
		  </p>
		<p>&nbsp;</p>
		<p>
		  <!--  add out html table here -->
		  
		  </p>
		
		<table>
			<tr>
				<th>First Name</th>	
				<th>Last Name</th>	
				<th>Email</th>
				<th>update</th>	
			</tr>

			<!-- loop over and print our customers -->
			<c:forEach var="tempCustomer" items="${customers}">
			
				<!-- construct an "update" link with customer id -->
				<c:url var= "updateLink" value="/customer/showFormForUpdate">
					<c:param name="customerId" value="${tempCustomer.id}" />
				</c:url>
				<!-- construct an "delete" link with customer id -->
				<c:url var= "deleteLink" value="/customer/delete">
					<c:param name="customerId" value="${tempCustomer.id}" />
				</c:url>
				
				
				
				<tr>
					<td> ${tempCustomer.firstName} </td>
					<td> ${tempCustomer.lastName} </td>
					<td> ${tempCustomer.email} </td>
					<td>
						<!--  display the update link -->
						<a href="${updateLink}">Update</a>
						|
						<a href="${deleteLink}"
							onclick="if (!(confirm('Are you sure tou want to delete this customer?'))) return false">Delete</a>
					</td>
				</tr>
				
			</c:forEach>

		</table>
		
		</div>
	</div>

</body>
</html>