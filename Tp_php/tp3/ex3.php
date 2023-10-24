<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Document</title>
</head>
<body>
	<?php
		echo "Question 1<br>";
		$ch = "kah_dhdsj---__";
		if (preg_match("/^[-_[:alnum:]]{4,32}$/", $ch)) {
			echo "it matches<br>";
		} else {
			echo "it doesn't match<br>";
		}
		echo "Question 2<br>";
		$ch = "21";
		if (preg_match("/^[[:digit:]]{1,2}$/", $ch)) {
			echo "it matches<br>";
		} else {
			echo "it doesn't match<br>";
		}
		echo "Question 3<br>";
		$adresse = "www.google.com";
		if (preg_match("/^www\.[a-zA-Z0-9\-]+\.[a-zA-Z]+$/", $adresse)) {
		echo "L'adresse est valide<br>";
		} else {
		echo "L'adresse n'est pas valide<br>";
		}
		echo "Question 4<br>";
		$adresse = "belassalsimo78@gmail.com";
		if (preg_match("/^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/", $adresse)) {
		echo "L'adresse email est valide<br>";
		} else {
		echo "L'adresse email n'est pas valide<br>";
		}
		echo "Question 5<br>";
		$tel = "0708909432";
		if (preg_match("/^(06|05|07)[[:digit:]]{8}$/",$tel)){
		echo("telephone valide<br>");
		}
        else {
		echo("telephone invalide<br>");
		}
	?>
</body>
</html>