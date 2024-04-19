<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
<title>Ajouter Produits</title>
</head>
<body>
<%@include file='headersansSearch.jsp' %>
<div class="app-wrapper" >
    <div class="app-content pt-3 p-md-3 p-lg-4">
<!--  <div class="row justify-content-center"> -->
<div class="card text-bg-dark mb-3 mt-5" style="max-width: 60rem; background-color: #9BCF53 !important; color: white; font-weight: bold;">
  <div class="card-header text-center">Livre insere</div>
  <div class="card-body">
    <label class="card-text">ID : </label>
    <label class="card-text">${livreAjo.idLivre }</label>
  </div>
  <div class="card-body">
    <label class="card-text">Titre : </label>
    <label class="card-text">${livreAjo.titre }</label>
  </div>
  <div class="card-body">
    <label class="card-text">Auteur : </label>
    <label class="card-text">${livreAjo.auteur }</label>
  </div>
  <div class="card-body">
    <label class="card-text">Nombre des Exemplaires : </label>
    <label class="card-text">${livreAjo.nbrExemp }</label>
  </div>
  <div class="card-body">
    <label class="card-text">Genre : </label>
    <label class="card-text">${livreAjo.genre }</label>
  </div>
</div>
<!-- </div> -->
</div>
</div>
</body>
</html>