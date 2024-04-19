<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home-Emprunts</title>
<!-- <link  rel="stylesheet" href="css/tablestyle.css"> -->
</head>
<body>
	<%@include file='headersansSearch.jsp'%>




	<div class="app-wrapper">
		<div class="app-content pt-3 p-md-3 p-lg-4">
			<div class="row g-4 mb-4">
				<div class="col-12 col-lg-12">
					<div class="app-card app-card-progress-list h-100 shadow-sm">
						<div class="app-card-header p-3">
							<div class="row justify-content-between align-items-center">
								<div class="col-auto">
									<h4 class="app-card-title">Chercher</h4>
								</div>
								<!--//col-->


								<div class="col-auto">
									<a href="ajouterEmp.com"> <input type="submit"
										value="Ajouter emprunt" class="btn"
										style="color: white; background-color: blue">
									</a>
								</div>
								<!--//col-->
							</div>
							<!--//row-->
						</div>
						<!--//app-card-header-->
						<div class="app-card-body">

							<div class="item p-3">
								<div class="row align-items-center">
									<!-- ----------------------------------- -->
									<form class="row mb-4 mr-4 ml-4" action="chercherEm.com"
										method="get">
										<div class="col-md-4">
											<label class="form-label">Nom</label> <input type="text"
												name="nom" class="form-control"
												placeholder="Chercher par le nom!">
										</div>
										<!--  <div class="col-md-4">
    <label class="form-label">Chercher par : </label>
    <select class="form-select" aria-label="Default select example" style="width:36%;" name="selctedoption">
     <option selected>Titre</option>
     <option value="Auteur">Auteur</option>
     <option value="Auteur">Genre</option>
    </select>
  </div> -->

										<div class="col-12 mt-1">
											<input class="btn btn-success" type="submit"
												style="color: white;" value="Chercher">
										</div>
									</form>
									<!-- ---------------------------------- -->




									<div class="col-auto"></div>
									<!--//col-->
								</div>
								<!--//row-->

							</div>
							<!--//item-->

						</div>
						<!--//app-card-body-->
					</div>
					<!--//app-card-->
				</div>
				<!--//col-->
				<div class="col-12 col-lg-12">

					<div class="app-card app-card-stats-table h-100 shadow-sm">
						<div class="app-card-header p-3">
							<div class="row justify-content-between align-items-center">
								<div class="col-auto">
									<h4 class="app-card-title">Liste des Emprunts</h4>
								</div>
								<!--//col-->
								<div class="col-auto"></div>
								<!--//col-->
							</div>
							<!--//row-->
						</div>
						<!--//app-card-header-->
						<div class="app-card-body p-3 p-lg-4">
							<div class="table-responsive">
								<table class="table table-striped table-hover mb-0">
									<thead>
										<tr CELLPADDING=3>
											<th class="meta">ID Emprunt</th>
											<th class="meta">ID Livre</th>
											<th class="meta">Titre</th>
											<th class="meta stat-cell">Apogee</th>
											<th class="meta stat-cell">Nom</th>
											<th class="meta stat-cell">Prenom</th>
											<th class="meta stat-cell">Date</th>
											<th class="meta stat-cell" COLSPAN=2>Action</th>


										</tr>
									</thead>
									<tbody>
										<c:forEach items="${modEmp.emprunts}" var="empr">
											<tr>
												<td class="stat-cell">${empr.idEmp}</td>
												<td class="stat-cell">${empr.idLiv}</td>
												<td class="stat-cell">${empr.titre}</td>
												<td class="stat-cell">${empr.n_apogee}</td>
												<td class="stat-cell">${empr.nom}</td>
												<td class="stat-cell">${empr.prenom}</td>
												<td class="stat-cell">${empr.dateEmp}</td>


												<td class="stat-cell" title="Modifier"><a
													href="modifieremp.com?nom=${empr.nom}"> <svg
															xmlns="http://www.w3.org/2000/svg" width="16" height="16"
															fill="green" class="bi bi-pen-fill" viewBox="0 0 16 16">
  <path
																d="m13.498.795.149-.149a1.207 1.207 0 1 1 1.707 1.708l-.149.148a1.5 1.5 0 0 1-.059 2.059L4.854 14.854a.5.5 0 0 1-.233.131l-4 1a.5.5 0 0 1-.606-.606l1-4a.5.5 0 0 1 .131-.232l9.642-9.642a.5.5 0 0 0-.642.056L6.854 4.854a.5.5 0 1 1-.708-.708L9.44.854A1.5 1.5 0 0 1 11.5.796a1.5 1.5 0 0 1 1.998-.001" />
</svg>
												</a></td>

											</tr>

										</c:forEach>


									</tbody>
								</table>
							</div>
							<!--//table-responsive-->
						</div>
						<!--//app-card-body-->
					</div>
					<!--//app-card-->
				</div>
				<!--//col-->
			</div>
			<!--//row-->
		</div>
	</div>
</body>
</html>
