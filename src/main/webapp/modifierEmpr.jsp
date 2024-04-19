<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modifer-Livre</title>
</head>
<body style="background-color: white;">
<%@include file='headersansSearch.jsp' %>

  <div class="app-wrapper" >
    <div class="app-content pt-3 p-md-3 p-lg-4">
       <!-- ------------------------ -->

          <form class="row g-3 mt-5 mb-4 mr-4 ml-4" action="modifierEmpButton.com" method="post">
  <div class="col-md-4">
    <label class="form-label">ID Emprunt</label>
    <input type="text" class="form-control" name="idem" value="${empruntModif.idEmp}" readonly>
  </div>
   <div class="col-md-4">
    <label class="form-label">ID Livre</label>
      <input type="text" class="form-control" name="idlivEm" value="${empruntModif.idLiv}">
  </div>
  <div class="col-md-6">
    <label class="form-label">Titre</label>
    <input type="text" class="form-control" name="titreEm" value="${empruntModif.titre}">
  </div>
  <div class="col-md-4">
    <label class="form-label">Apogee</label>
    <input type="text" class="form-control" name="apogeeEm" value="${empruntModif.n_apogee}">
  </div>
 
  
  <div class="col-md-3">
    <label class="form-label">Nom</label>
     <input type="text" class="form-control" name="nomEm" value="${empruntModif.nom}">
  </div>
  <div class="col-md-3">
    <label class="form-label">Prenom</label>
     <input type="text" class="form-control" name="prenomEm" value="${empruntModif.prenom}">
  </div>
  <div class="col-md-3">
    <label class="form-label">Date Emprunt</label>
     <input type="text" class="form-control" name="dateEm" value="${empruntModif.dateEmp}">
  </div>
  <div class="col-12">
    <button class="btn btn-primary" type="submit" style="color: white;">Modifier</button>
  </div>
</form>
    <!-- ------------------------ -->
    </div>
    </div>
</body>
</html>