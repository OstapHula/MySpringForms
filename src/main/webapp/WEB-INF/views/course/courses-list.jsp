<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<ul>
	<c:forEach items="${coursesList}" var="course">
		<li>
			${course.id} | 
			${course.title} | 
			${course.description} | 
			${course.price } |
<a href="${pageContext.request.contextPath}/course/${course.id}/info">Course info</a>
		</li>
	</c:forEach>
</ul>