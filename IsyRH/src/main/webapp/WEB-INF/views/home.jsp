<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
   <head>
      <title>IsyRH</title>
      <meta name = "viewport" content = "width = device-width, initial-scale = 1">
      <link rel = "stylesheet"
         href = "https://fonts.googleapis.com/icon?family=Material+Icons">
      <link rel = "stylesheet"
         href = "resources/css/materialize.min.css">
      <link rel = "stylesheet"
         href = "resources/css/main.css">
      <script type = "text/javascript"
         src = "https://code.jquery.com/jquery-2.1.1.min.js"></script>           
      <script src = "https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.3/js/materialize.min.js"></script> 
      <script>
         $(document).ready(function() {
            $('select').material_select();
         });
      </script>
      <script>
      jQuery(document).ready(function($) {
    $(".clickable-row").click(function() {
        window.location = $(this).data("href");
    });
});
</script>

<script>

$('.dropdown-trigger').dropdown();
</script>

   </head>
   
   <body class="white">

     <div class="navbar-fixed">
      <nav class=" color black   " role="navigation">

		<a class="brand-logo" href="/"><i style="font-size:60px" class="material-icons">home</i></a>
		
				<ul class="right hide-on-med-and-down">
				<li><a  class="waves-effect waves-light btn-large grey darken-1">Ajouter Utilisateur</a></li>
				<li style="color: black;">________________</li>
				<li><a  class="waves-effect waves-light btn-large grey darken-1">Rechercher</a></li>
				<li style="color: black;">_</li>							
							<li>
				<form method="get" action="/Annonce/rechrecheAnnonce">
					<div class="input-field">
						<input id="search" type="search" name="titre">
						<label for="search"><i class="material-icons">search</i></label>
						<i class="material-icons">close</i>
						<button type="submit" name="serche" class="hide"></button>
					</div>
				</form>
				</li>
				<li style="color: black;">________________</li>
				<li><a  class="waves-effect waves-light btn-large grey darken-1">Créer CV </a></li>
				<li style="color: black;">__</li>
				<!-- Dropdown Trigger -->
  <li><a class='dropdown-button waves-effect waves-light btn-large grey darken-1' href='#' data-activates='dropdown1'>Syfax IsyData</a>

  <!-- Dropdown Structure -->
  <ul id='dropdown1' class='dropdown-content'>
    <li><a class="red accent-4" style="color:white;" href="#!" ><i class="material-icons">power_settings_new</i> <b>Déconnexion</b></a></li>
  </ul>
				</li>
				<li style="color: black;">__</li></ul>
				<ul class="right hide-on-med-and-down">
			<li id="createAnnonce"><a href="/Annonce/creer" ></a></li>
		</ul>
				<ul class="right hide-on-med-and-down">
			<li id="createAnnonce"><a href="/Annonce/creer" ></a></li>
		</ul>

	</nav>
      </div>
      <br><br>

      <div class = "row">
         <div class = "col s3">
         <img width="300px" src="resources/images/dd.png">
         </div>
         
         <div class = "col s1">
         <b>Filtrer Par:</b>
         </div>
      <div class="input-field col s1.5">
         <select>
            <option value="" >Selectionner</option>
            <option value="1">Bac+3</option>
            <option value="2">Bac+4</option>
            <option value="3">Bac+5</option>
         </select>
         <label>Niveau de Formation</label>
      </div>
      <div class="input-field col s1.5">
         <select>
            <option value="" >Selectionner</option>
            <option value="1">Tout de suite</option>
            <option value="2">Moins de 3 mois</option>
            <option value="3">Moins de 6 mois</option>                        
            <option value="4">Plus de 6 mois</option>
         </select>
         <label>Disponibilité</label>
      </div>
      <div class="input-field col s1.5">
         <select>
            <option value="" >Selectionner</option>
            <option value="1">Ile de France</option>
            <option value="2">Toute la France</option>
            <option value="3">Internationale</option>
         </select>
         <label>Mobilité</label>
      </div>
      <div class="input-field col s1.5">
         <select>
            <option value="" >Selectionner</option>
            <option value="1">Linkd'in</option>
            <option value="2">Lesjeudis</option>
            <option value="3">Indeed</option>
            <option value="4">Monster</option>
         </select>
         <label>Site Source</label>
      </div>
   
    <div class="input-field col s1">
         <a  style="font-size: 15px" class="waves-effect waves-light btn-large grey darken-4"> <b>Filtrer</b> </a>
      </div>
    </div>
      <hr>
      <div class = "row">
      <div class = "col s12">
         <ul class = "tabs ">
            <li class = "tab col s4 grey lighten-5"><a class = "active" class="white-text" href = "#home">HOME</a></li>
            <li class = "tab col s4 grey lighten-5"><a href = "#favorite">FAVORIS</a></li>
            <li class = "tab col s4 grey lighten-5"><a href = "#archives"> ARCHIVES</a></li>
         </ul>
      </div>
      <div id = "home" class = "col s12">
         <table class="highlight">
            <thead>
               <tr>
                     <th> </th>
                     <th>Matricule</th>
                     <th>Nom</th>
                     <th>Prénom</th>
                     <th>CV Isydata</th>                   
                     <th>CV Candidat</th>
                     <th>Formation</th>
                     <th>Disponibilité</th>
                     <th>Mobilité</th>
                     <th></th>
               </tr>
            </thead>
            <tbody>
            
            <c:forEach items="${listcv}" var="cv">
            <tr class='clickable-row' data-href='url://'>
           	 <td>         
            	<form action="#">
            		<p>
           				<input type="checkbox" class="filled-in " id="filled-in-box1" />
            			<label for="filled-in-box1"></label>
            		</p>
            	</form>
             </td>
            <td>${cv.idCv}</td>
            <td>${cv.candidat.nom}</td>
            <td>${cv.candidat.prenom}</td>
            <td>${cv.titreIsyData}</td>
            <td>${cv.titreCandidat}</td>
            <td>${cv.candidat.niveauFormation}</td>
            <td>${cv.candidat.disponibilite}</td>
            <td>${cv.candidat.mobilite}</td>
            <td>   
            <a href="<c:url value='/CV/favoris/${cv.idCv}' />"><i class="material-icons ">favorite_border</i></a>   
            <a href="collapsible.html"><i class="material-icons ">archive</i></a>   
            <a href="<c:url value='/CV/removeCv/${cv.idCv}' />"><i class="material-icons ">mode_delete</i></a>  
            </td>
            </tr>
   			</c:forEach>
            </tbody>
         </table>
         </div>
         
         <div id = "favorite" class = "col s12">
             <table class="highlight">
            <thead>
               <tr>
                     <th> </th>
                     <th>Matricule</th>
                     <th>Nom</th>
                     <th>Prénom</th>
                     <th>CV Isydata</th>                   
                     <th>CV Candidat</th>
                     <th>Formation</th>
                     <th>Disponibilité</th>
                     <th>Mobilité</th>
                     <th></th>
               </tr>
            </thead>
            <tbody>
<c:forEach items="${listcv}" var="cv">
            <tr class='clickable-row' data-href='url://'>
           	 <td>         
            	<form action="#">
            		<p>
           				<input type="checkbox" class="filled-in " id="filled-in-box1" />
            			<label for="filled-in-box1"></label>
            		</p>
            	</form>
             </td>
            <td>${cv.idCv}</td>
            <td>${cv.candidat.nom}</td>
            <td>${cv.candidat.prenom}</td>
            <td>${cv.titreIsyData}</td>
            <td>${cv.titreCandidat}</td>
            <td>${cv.candidat.niveauFormation}</td>
            <td>${cv.candidat.disponibilite}</td>
            <td>${cv.candidat.mobilite}</td>
            <td>   
            <a href="<c:url value='/CV/favoris/${cv.idCv}' />"><i class="material-icons ">favorite_border</i></a>   
            <a href="collapsible.html"><i class="material-icons ">archive</i></a>   
            <a href="<c:url value='/CV/removeCv/${cv.idCv}' />"><i class="material-icons ">mode_delete</i></a>  
            </td>
            </tr>
   			</c:forEach>
            </tbody>
         </table>
         </div>

         <div id = "archives" class = "col s12">
             <table class="highlight">
            <thead>
               <tr>
                     <th> </th>
                     <th>Matricule</th>
                     <th>Nom</th>
                     <th>Prénom</th>
                     <th>CV Isydata</th>                   
                     <th>CV Candidat</th>
                     <th>Formation</th>
                     <th>Disponibilité</th>
                     <th>Mobilité</th>
                     <th></th>
               </tr>
            </thead>
            <tbody>
<c:forEach items="${listcv}" var="cv">
            <tr class='clickable-row' data-href='url://'>
           	 <td>         
            	<form action="#">
            		<p>
           				<input type="checkbox" class="filled-in " id="filled-in-box1" />
            			<label for="filled-in-box1"></label>
            		</p>
            	</form>
             </td>
            <td>${cv.idCv}</td>
            <td>${cv.candidat.nom}</td>
            <td>${cv.candidat.prenom}</td>
            <td>${cv.titreIsyData}</td>
            <td>${cv.titreCandidat}</td>
            <td>${cv.candidat.niveauFormation}</td>
            <td>${cv.candidat.disponibilite}</td>
            <td>${cv.candidat.mobilite}</td>
            <td>   
            <a href="<c:url value='/CV/favoris/${cv.idCv}' />"><i class="material-icons ">favorite_border</i></a>   
            <a href="collapsible.html"><i class="material-icons ">archive</i></a>   
            <a href="<c:url value='/CV/removeCv/${cv.idCv}' />"><i class="material-icons ">mode_delete</i></a>  
            </td>
            </tr>
   			</c:forEach>            </tbody>
         </table>
         </div>
      </div>
      <footer style="bottom:0;left:0;width:100%;background-color:tomato;" class="page-footer grey darken-3">
         <div class="container grey darken-3">
            <div class="row">
               <div class="col l6 s12">
                  <h5 class="white-text">ISYdata Content</h5>
               </div>
               <div class="col l4 offset-l2 s12">
                  <h5 class="white-text">Link ISYdata</h5>
               </div>
            </div>
         </div>
         <div class="footer-copyright">
            <div class="container">
               © 2018 Copyright ISYdata
               <a class="grey-text text-lighten-4 right" href="#!">More ISYdata</a>
            </div>
         </div>
      </footer>
   </body>
</html>

