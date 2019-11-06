<%@ page pageEncoding="UTF-8" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html lang="en">

<head>
<link rel="stylesheet" type="text/css" href="css/vendtamoto.css" />
    <meta charset="UTF-8">

    <title>VENDTABECANE</title>

</head>

<body>

    

    <form action="annonce/add" method="post">
    <input type="file" name="image" placeholder="técharger la meilleur image de votre moto" />

  <div class="titre">ajout d'une annonce </div>   <BR>
    <br>

    <input type="text" name="marque" placeholder="Marque de ta bécane" />
 <input type="text" name="etat" placeholder="Etat de ta bécane" />
<input type="text" name="kilometrage" placeholder="kilometrage" />
<input type="text" name="prix" placeholder="prix" /><br>
<br>
 <input type="text" name="texte" placeholder="Texte libre" size="150" style="height:70px" />
    <input type="submit" value="ok" />

    </form>

   
   
       
   
    <h2 class="hello-title">Marque de ta bécane:  ${marque}

   
 
    
    
    </h2>
    <h2 class="hello-title">Etat de ta bécane:  ${etat}</h2>
     <h2 class="hello-title">kilometrage:  ${kilometrage}</h2>
      <h2 class="hello-title">Prix:  ${prix}</h2>
    <h2 class="hello-title">Texte libre:  ${texte}</h2>
    <h2> ${mince1}</h2>
     <h2> ${mince2}</h2>
      <h2> ${mince3}</h2>
       <h2> ${mince4}</h2>
        <h2> ${mince5}</h2>
   
    <ul>

    <c:forEach items="${ albums }" var="album">       

        <li><c:out value="${ album }" /></li>

    </c:forEach>

    </ul>

 
<a href="http://localhost:8080/geto" target="_blank">regarde toutes les annonces dispo mec</a>
    

    <script src="/js/main.js"></script>

</body>

</html>
