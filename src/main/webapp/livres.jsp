<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home-Livres</title>
<!-- <link  rel="stylesheet" href="css/tablestyle.css"> -->
</head>
<body>
<%@include file='headersansSearch.jsp' %>
    <div class="app-wrapper">
    <div class="app-content pt-3 p-md-3 p-lg-4">
  <div class="row g-4 mb-4">
				    <div class="col-12 col-lg-12">
				        <div class="app-card app-card-progress-list h-100 shadow-sm">
					        <div class="app-card-header p-3">
						        <div class="row justify-content-between align-items-center">
							        <div class="col-auto">
						                <h4 class="app-card-title">Chercher</h4>
							        </div><!--//col-->
							        
							        
							        <div class="col-auto">
							        <a href="ajouter.com">
								       <input type="submit" value="Ajouter livre" class="btn" style="color:white; background-color: blue">
							         </a>
							        </div><!--//col-->
						        </div><!--//row-->
					        </div><!--//app-card-header-->
					        <div class="app-card-body">
							  
							    <div class="item p-3">
								    <div class="row align-items-center">
	<!-- ----------------------------------- -->
	 <form class="row mb-4 mr-4 ml-4" action="chercher.com" method="get">
  <div class="col-md-4">
    <label class="form-label">Titre</label>
    <input type="text" name="motcle" class="form-control" placeholder="Chercher par le Titre!" value="${modele.titre }">
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
    <input class="btn btn-success" type="submit" style="color: white;" value="Chercher">
  </div>
</form>
	<!-- ---------------------------------- -->
	
	
	
	
									    <div class="col-auto">
									
									    </div><!--//col-->
								    </div><!--//row-->
								    
							    </div><!--//item-->
		
					        </div><!--//app-card-body-->
				        </div><!--//app-card-->
			        </div><!--//col-->
			        <div class="col-12 col-lg-12">
			        
				        <div class="app-card app-card-stats-table h-100 shadow-sm">
					        <div class="app-card-header p-3">
						        <div class="row justify-content-between align-items-center">
							        <div class="col-auto">
						                <h4 class="app-card-title">Liste des Livres</h4>
							        </div><!--//col-->
							        <div class="col-auto">
								       
							        </div><!--//col-->
						        </div><!--//row-->
					        </div><!--//app-card-header-->
					        <div class="app-card-body p-3 p-lg-4">
						        <div class="table-responsive">
							        <table class="table table-striped table-hover mb-0">
										<thead>
											<tr CELLPADDING=3>
												<th class="meta">ID</th>
												<th class="meta stat-cell">Titre</th>
                                                <th class="meta stat-cell">Auteur</th>
												<th class="meta stat-cell">Nbrs_Exemplaires</th>
											    <th class="meta stat-cell">Genre</th>
											     <th class="meta stat-cell" COLSPAN=2>Action</th>
											     
												
											</tr>
										</thead>
										<tbody>
										<c:forEach items="${modele.livre}" var="l">
											<tr>
												<td><a href="index.html">${l.idLivre}</a></td>
												<td class="stat-cell">${l.titre}</td>
                                                <td class="stat-cell">${l.auteur}</td>
												<td class="stat-cell">${l.nbrExemp}</td>
												<td class="stat-cell">${l.genre}</td>
												
												<td class="stat-cell" title="supprimer">
												<a onclick="return confirm('Are you sure!')" href="supprimer.com?id=${l.idLivre}">
												<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="red" class="bi bi-trash3" viewBox="0 0 16 16">
  <path d="M6.5 1h3a.5.5 0 0 1 .5.5v1H6v-1a.5.5 0 0 1 .5-.5M11 2.5v-1A1.5 1.5 0 0 0 9.5 0h-3A1.5 1.5 0 0 0 5 1.5v1H1.5a.5.5 0 0 0 0 1h.538l.853 10.66A2 2 0 0 0 4.885 16h6.23a2 2 0 0 0 1.994-1.84l.853-10.66h.538a.5.5 0 0 0 0-1zm1.958 1-.846 10.58a1 1 0 0 1-.997.92h-6.23a1 1 0 0 1-.997-.92L3.042 3.5zm-7.487 1a.5.5 0 0 1 .528.47l.5 8.5a.5.5 0 0 1-.998.06L5 5.03a.5.5 0 0 1 .47-.53Zm5.058 0a.5.5 0 0 1 .47.53l-.5 8.5a.5.5 0 1 1-.998-.06l.5-8.5a.5.5 0 0 1 .528-.47M8 4.5a.5.5 0 0 1 .5.5v8.5a.5.5 0 0 1-1 0V5a.5.5 0 0 1 .5-.5"/>
</svg>
                 </a>
												</td>
												
											
												<td class="stat-cell" title="Modifier">
													<a href="modifier.com?titre=${l.titre}">
												<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="green" class="bi bi-pen-fill" viewBox="0 0 16 16">
  <path d="m13.498.795.149-.149a1.207 1.207 0 1 1 1.707 1.708l-.149.148a1.5 1.5 0 0 1-.059 2.059L4.854 14.854a.5.5 0 0 1-.233.131l-4 1a.5.5 0 0 1-.606-.606l1-4a.5.5 0 0 1 .131-.232l9.642-9.642a.5.5 0 0 0-.642.056L6.854 4.854a.5.5 0 1 1-.708-.708L9.44.854A1.5 1.5 0 0 1 11.5.796a1.5 1.5 0 0 1 1.998-.001"/>
</svg>
   </a>
												</td>
												
											</tr>
											</c:forEach>
											
										</tbody>
									</table>
						        </div><!--//table-responsive-->
					        </div><!--//app-card-body-->
				        </div><!--//app-card-->
			        </div><!--//col-->
			    </div><!--//row-->
			    </div>
			    </div>
</body>
</html>
