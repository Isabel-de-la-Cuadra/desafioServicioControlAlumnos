<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!-- 
16. Crear una vista alumnos.html​ en carpeta ​ resources/templates​ para listar alumnos registrados.

- Creé una vista alumnos.jsp en la carpeta webapp/WEB-INF/views
 -->

<jsp:include page='../templates/header.jsp'>
	<jsp:param name='title' value='Listar Alumnos:' />
</jsp:include>

<body>

	<jsp:include page='../templates/navbar.jsp'>
		<jsp:param name='title' value='Sistema Web Servicio Control Alumnos' />
	</jsp:include>

	<br>
	<br>

	<div class="container">
		<div class="text-center">
			<h1>Alumnos</h1>
		</div>

		<br>

		<div class="table-responsive">
			<table class="table">
				<thead>
					<tr>
						<th scope="col">RUT</th>
						<th scope="col">Nombre</th>
						<th scope="col">Apellido</th>
						<th scope="col">Correo Electrónico</th>
						<th scope="col">Edad</th>
						<th scope="col">Fecha de Ingreso</th>
						<th scope="col">Dirección</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="alumno" items="${listaAlumnos}">
						<tr>
							<td><c:out value="${alumno.rut}"></c:out></td>
							<td><c:out value="${alumno.nombre}"></c:out></td>
							<td><c:out value="${alumno.apellido}"></c:out></td>
							<td><c:out value="${alumno.email}"></c:out></td>
							<td><c:out value="${alumno.edad}"></c:out></td>
							<td><c:out value="${alumno.fechaIngreso}"></c:out></td>
							<td><c:out value="${alumno.direccion}"></c:out></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

	<br>
	<br>

	<jsp:include page='../templates/footer.jsp'>
		<jsp:param name='title' value='Sistema Web Servicio Control Alumnos' />
	</jsp:include>

	<!-- Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js ">
		
	</script>

</body>
</html>