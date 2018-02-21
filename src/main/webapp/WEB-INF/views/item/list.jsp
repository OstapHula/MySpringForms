<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<h1>List Items</h1>

<ul>
	<c:forEach items="${itemList}" var="item">
		<li>
			${item.id} |
		 	${item.name} |
			${item.description} |
			${item.amount} | 
			${item.price} |
			<a href="${pageContext.request.contextPath}/item/${item.id}/edit">edit</a>
		</li>
	</c:forEach>
</ul>

<br/>
<a href="${pageContext.request.contextPath}/item/add">add item</a>