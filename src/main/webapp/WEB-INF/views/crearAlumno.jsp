<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!-- 
15. Crear una vista crear-alumno.html ​ en carpeta resources/templates​ para agregar alumno.
 
- Creé una vista crearAlumno.jsp en la carpeta webapp/WEB-INF/views
 -->

<jsp:include page='../templates/header.jsp'>
	<jsp:param name='title' value='Registro de Alumnos:' />
</jsp:include>

<body>

	<jsp:include page='../templates/navbar.jsp'>
		<jsp:param name='title' value='Sistema Web Servicio Control Alumnos' />
	</jsp:include>

	<br>
	<br>

	<div class="row justify-content-sm-center h-150">
		<div class="col-xxl-4 col-xl-5 col-lg-5 col-md-7 col-sm-9">
			<div class="card shadow-lg" id="card">
				<div class="card-body p-5">
					<h2 class="fs-4 card-title mb-4">Formulario de Registro de
						Alumnos</h2>

					<c:if test="${msgError !=null}">
						<div class="alert alert-danger" role="alert">
							<c:out value="${msgError}"></c:out>
						</div>
					</c:if>

					<c:if test="${msgOk !=null}">
						<div class="alert alert-success" role="alert">
							<c:out value="${msgOk}"></c:out>
						</div>
					</c:if>

					<form:form method="POST" action="/alumno" modelAttribute="alumno">

						<div class="mb-3">
							<form:input type="text" class="form-control" path="rut"
								placeholder="Ingresa el RUT del alumno" />
							<form:errors path="rut" class="text-danger" />
						</div>

						<div class="mb-3">
							<form:input type="text" class="form-control" path="nombre"
								placeholder="Ingresa el nombre del alumno" />
							<form:errors path="nombre" class="text-danger" />
						</div>

						<div class="mb-3">
							<form:input type="text" class="form-control" path="apellido"
								placeholder="Ingresa el apellido del alumno" />
							<form:errors path="apellido" class="text-danger" />
						</div>

						<div class="mb-3">
							<form:input type="email" class="form-control" path="email"
								placeholder="Ingresa el correo electrónico del alumno" />
							<form:errors path="email" class="text-danger" />
						</div>


						<div class="mb-3">
							<form:input type="number" class="form-control" path="edad"
								placeholder="Ingresa la edad del alumno" />
							<form:errors path="edad" class="text-danger" />
						</div>

						<div class="mb-3">
							<form:input type="date" class="form-control" path="fechaIngreso"
								placeholder="Ingresa la fecha de ingreso del alumno" />
							<form:errors path="fechaIngreso" class="text-danger" />
						</div>

						<div class="mb-3">
							<form:select id="" path="direccion" class="form-select">
							<form:option value=""> Selecciona Dirección</form:option>
							<c:forEach items="${listaDirecciones}" var="direccion">
								<form:option value="${direccion.id}">
									<c:out
										value="${direccion.calle}, ${direccion.numero}, ${direccion.ciudad}"></c:out>
								</form:option>
							</c:forEach>
							</form:select>
						</div>

						<div class="contenedor-icono">
							<button type="submit" class="btn btn-primary ms-auto">
								<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
									fill="currentColor" class="bi bi-check2" viewBox="0 0 16 16">
		  										<path
										d="M13.854 3.646a.5.5 0 0 1 0 .708l-7 7a.5.5 0 0 1-.708 0l-3.5-3.5a.5.5 0 1 1 .708-.708L6.5 10.293l6.646-6.647a.5.5 0 0 1 .708 0z" />
											</svg>
								Registrar Alumno
							</button>
						</div>
					</form:form>
			</div>
		</div>
	</div>
	</div>

	<br>
	<br>

	<jsp:include page='../templates/footer.jsp'>
		<jsp:param name='title' value='Sistema Web Empresa Logistiqal' />
	</jsp:include>

	<!-- Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js ">
	</script>

</body>
</html>