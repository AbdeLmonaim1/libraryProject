<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
<title>Ajouter Emprunt</title>
</head>
<body>
<%@include file='headersansSearch.jsp' %>
<div class="app-wrapper" >
    <div class="app-content pt-3 p-md-3 p-lg-4">
<!--  <div class="row justify-content-center"> -->
<div class="card text-bg-dark mb-3 mt-5" style="max-width: 60rem; background-color: #9BCF53 !important; color: white; font-weight: bold;">
  <div class="card-header text-center">Emprunt inserer</div>
  <div class="card-body">
    <label class="card-text">ID d'Emprunt: </label>
    <label class="card-text">${empruntAjou.idEmp }</label>
  </div>
  <div class="card-body">
    <label class="card-text">Apogee d'Etudiant : </label>
    <label class="card-text">${empruntAjou.N_Apogee }</label>
  </div>
  <div class="card-body">
    <label class="card-text">ID Livre : </label>
    <label class="card-text">${empruntAjou.idLiv }</label>
  </div>
  <div class="card-body">
    <label class="card-text">Titre de Livre: </label>
    <label class="card-text">${empruntAjou.titre }</label>
  </div>
  <div class="card-body">
    <label class="card-text">Nom d'Etudiant : </label>
    <label class="card-text">${empruntAjou.nom }</label>
  </div>
  <div class="card-body">
    <label class="card-text">Prenom d'Etudiant : </label>
    <label class="card-text">${empruntAjou.prenom }</label>
  </div>
  <div class="card-body">
    <label class="card-text">Date d'Emprunt : </label>
    <label class="card-text">${empruntAjou.dateEmp }</label>
  </div>
</div>
<!-- </div> -->
</div>
</div>
</body>
</html>