<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Document</title>
	<style>
		a {
			padding-right: 40px;
		}
		.a {
			padding-right: 140px;
		}
		.b {
			padding-right: 150px;
		}
		.c {
			padding-right: 145px;
		}
	</style>
</head>
<body>
	<center>
	<form method="post">
		<a class="a">Nom :</a><input type="text" name="nom"><br><br>
		<a class="b">Age :</a><input type="text" name="age"><br><br>
		<a class="c">Mail :</a><input type="text" name="mail"><br><br>
		<a>Valeur en DH du don :</a><input type="text" name="don"><br><br>
		<input type="submit" value="submit">
	</form>
	</center>
	<?php
		$file2 = fopen("ficher2.txt", "a+");
		$nom = $_POST['nom'];
		$age = $_POST['age'];
		$mail = $_POST['mail'];
		$don = $_POST['don'];
		$ch = $nom . ' | ' . $age . ' | ' . $mail  . ' | ' . $don . "<br>";
		fwrite($file2, $ch);
	?>
</body>
</html>