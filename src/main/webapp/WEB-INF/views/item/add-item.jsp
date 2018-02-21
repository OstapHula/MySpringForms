<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1>Create new Item</h1>

<form:form 
	method="POST" 
	action="${pageContext.request.contextPath}/item/add" 
	modelAttribute="item">

	Item Name: <form:input path="name"/><br/>
	Item description: <form:input path="description"/><br/>
	Item amount: <form:input path="amount"/><br/>
	Item price: <form:input path="price"/><br/>
	
	<input type="submit" value="Create Item">
</form:form>

