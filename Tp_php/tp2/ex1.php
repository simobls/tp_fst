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
		$word = "PHP 5";
		for ($i=0; $i < strlen($word); $i++) { 
			echo $word[$i] . "<br>";
		}
	?>
	<?php
		echo "Question 2<br>";
		$chaine="Rabat est la capitale du maroc";
		echo str_replace("Rabat", "Casablanca", $chaine) . "<br>";

		$tab = explode(" ", $chaine);
		for ($i=0; $i < strlen($chaine); $i++) {
			echo $tab[$i] . "<br>";
		}
		$i = 0;
		while ($tab[$i] != NULL) {
			echo $tab[$i] . "<br>";
			$i++;
		}
	?>
</body>
</html>