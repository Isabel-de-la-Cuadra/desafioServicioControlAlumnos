<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!-- 
14. Crear una vista direcciones.html​ en carpeta resources/templates​ para listar direcciones registradas.

- Creé una vista direcciones.jsp en la carpeta webapp/WEB-INF/views
 -->

<jsp:include page='../templates/header.jsp'>
	<jsp:param name='title' value='Listar Direcciones:' />
</jsp:include>

<body>

	<jsp:include page='../templates/navbar.jsp'>
		<jsp:param name='title' value='Sistema Web Servicio Control Alumnos' />
	</jsp:include>

	<br>
	<br>

	<div class="container">
		<div class="text-center">
			<h1>Direcciones</h1>
		</div>

		<br>

		<div class="table-responsive">
			<table class="table">
				<thead>
					<tr>
						<th scope="col">Calle</th>
						<th scope="col">Número</th>
						<th scope="col">Ciudad</th>
						<th scope="col">Tipo</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="direccion" items="${listaDirecciones}">
						<tr>
							<td><c:out value="${direccion.calle}"></c:out></td>
							<td><c:out value="${direccion.numero}"></c:out></td>
							<td><c:out value="${direccion.ciudad}"></c:out></td>
							<td><c:out value="${direccion.tipo}"></c:out></td>
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