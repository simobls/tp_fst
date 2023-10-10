<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Exerice 6</title>
</head>
<body>
	<h1>
		<?php
			echo "Calcul des variabbles</br>";
		?>
	</h1>
	<?php
		$TVA = 0.20;
		$prix = 150;
		$nombre = 10;
		$HT = $prix * $nombre;
		$TTC =  $HT + $HT * $TVA;
		echo "le prix HT est " . $HT . "</br>";
		echo "le prix TTC est " . $TTC . "</br>";
	?>
</body>
</html>