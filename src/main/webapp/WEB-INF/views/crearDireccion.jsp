<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!-- 
13. Crear una vista crear-direccion.html​ en carpeta​ resources/templates​ para agregar direcciones.
 
- Creé una vista crearDireccion.jsp en la carpeta webapp/WEB-INF/views
 -->

<jsp:include page='../templates/header.jsp'>
	<jsp:param name='title' value='Registro de Dirección:' />
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
						Direcciones</h2>

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

					<form:form method="POST" action="/direccion" modelAttribute="direccion">

						<div class="mb-3">
							<form:input type="text" class="form-control" path="calle"
								placeholder="Ingresa la calle" />
							<form:errors path="calle" class="text-danger" />
						</div>

						<div class="mb-3">
							<form:input type="number" class="form-control" path="numero"
								placeholder="Ingresa el número" />
							<form:errors path="numero" class="text-danger" />
						</div>

						<div class="mb-3">
							<form:input type="text" class="form-control" path="ciudad"
								placeholder="Ingresa la ciudad" />
							<form:errors path="ciudad" class="text-danger" />
						</div>

						<div class="mb-3">
							<form:label class="form-label" path="tipo">Selecciona el tipo de Dirección</form:label>
							<form:select class="form-select" path="tipo" value="">
								<form:options path="tipo" items= "${tipoDireccion}"/>
							</form:select>
						</div>

						<div class="contenedor-icono">
							<button type="submit" class="btn btn-primary ms-auto">
								<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
									fill="currentColor" class="bi bi-check2" viewBox="0 0 16 16">
  										<path
										d="M13.854 3.646a.5.5 0 0 1 0 .708l-7 7a.5.5 0 0 1-.708 0l-3.5-3.5a.5.5 0 1 1 .708-.708L6.5 10.293l6.646-6.647a.5.5 0 0 1 .708 0z" />
									</svg>
								Registrar Dirección
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