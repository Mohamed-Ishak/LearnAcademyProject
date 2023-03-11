  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<div class="sidenav">
	<h3 id="logo">
		Administrator Section
	</h3>
	
	
	<c:url var="teachersSection" value="admin">
		<c:param name="category" value="TEACHERS" />
	</c:url>

	<c:url var="studentsSection" value="admin">
		<c:param name="category" value="STUDENTS" />
	</c:url>
	<c:url var="classesSection" value="admin">
		<c:param name="category" value="CLASSES" />
	</c:url>

	<c:url var="subjectsSection" value="admin">
		<c:param name="category" value="SUBJECTS" />
	</c:url>


	
	
		<a class="bar-item" href="${teachersSection}">Teachers</a> 
		<a class="bar-item" href="${studentsSection}">Students</a> 
		<a class="bar-item" href="${classesSection}">Classes</a> 
		<a class="bar-item" href="${subjectsSection}">Subjects</a>
		<a class="bar-item" href="login.jsp">Log out</a>
	
	</div>