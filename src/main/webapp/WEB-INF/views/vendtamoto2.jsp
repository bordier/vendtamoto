<%@ page pageEncoding="UTF-8"%>

<%@ page contentType="text/html; charset=UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html lang="en">

<head>
<link rel="stylesheet" type="text/css" href="css/vendtamoto2.css" />
<meta charset="UTF-8">

<title>VENDTABECANE</title>

</head>

<body>

	<div id="searchbar">

		<h1>Recherche la moto de tes rêves</h1>
		<form action="recherche" method="post" class="formulaire">
			<input class="champ" name="recherchemoto" type="text" value="" /> <input
				class="bouton" type="submit" value="ok" />

		</form>
	</div>





	<table>



		<c:forEach var="annonce" items="${lesAnnonces}">
			<tr>
				<td>MARQUE : <c:out value=" ${annonce.marque} " /></td>
				<td>ÉTAT : <c:out value=" ${annonce.etat } " /></td>
				<td>PRIX : <c:out value=" ${annonce.prix } " />€</td>

				<td>KILOMETRAGE : <c:out value=" ${annonce.kilometrage} " /></td>
				<td><c:out value=" ${annonce.texte} " /></td>
				<td><c:out value=" ${annonce.image} " /></td>
			</tr>
		</c:forEach>
	</table>


<a href="http://localhost:8080/annonce" target="_blank">mettre une nouvelle annonce</a>


	<script src="/js/main.js"></script>

</body>

</html>