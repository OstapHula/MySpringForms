<h1>Create new Course</h1>

<form method="POST" action="${pageContext.request.contextPath}/course/add">
	Title: <input type="text" name="title"> <br /> 
	Description: <input type="text" name="description"> <br />
	Price: <input type="text" name="price"> <br />
	
	<input type="submit" value="Create Course">
</form>