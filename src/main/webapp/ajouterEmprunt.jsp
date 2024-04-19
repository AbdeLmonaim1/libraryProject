<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color: white;">
<%@include file='headersansSearch.jsp' %>

  <div class="app-wrapper" >
    <div class="app-content pt-3 p-md-3 p-lg-4">
       <!-- ------------------------ -->
  
          <form class="row g-3 mt-5 mb-4 mr-4 ml-4" action="ajouterEmprButton.com" method="post">
  <div class="col-md-4">
    <label class="form-label">Num Apogee</label>
    <input type="text" name="apog" class="form-control" >
  </div>
  <div class="col-md-4">
    <label class="form-label">Nom Etudiant</label>
    <input type="text" name="nom" class="form-control"  >
  </div>
  <div class="col-md-4">
    <label class="form-label">Prenom Etudiant</label>
      <input type="text" name="prenom" class="form-control"  >
  </div>
  <div class="col-md-6">
    <label class="form-label">ID Livre</label>
    <input type="text" name="idliv" class="form-control" >
  </div>
  <div class="col-md-3">
    <label class="form-label">Titre</label>
     <input type="text" name="titre" class="form-control" >
  </div>
  <div class="col-md-3">
    <label class="form-label">Date d'Emprunt</label>
     <input type="date" name="date" class="form-control" >
  </div>
  <div class="col-12">
    <button class="btn btn-primary" type="submit" style="color: white;">Ajouter</button>
  </div>
</form>
    <!-- ------------------------ -->
    </div>
    </div>
</body>
</html>