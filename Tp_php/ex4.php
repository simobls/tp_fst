<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Exercice 4</title>
</head>
<body>
	<?php
		function cumul ($prix)
		{
			static $cumul = 0;
			static $i = 1;
			echo ("total des achats $i = ");
			$cumul += $prix;
			$i++;
			return $cumul;
		}
		echo cumul(175), "<br>";
		echo cumul(65), "<br>";
		echo cumul(69), "<br>";
	?>
	<?php
		function surface($rayon) {
			$pi = 3.14;
			static $surface;
			$surface = $pi * pow($rayon, 2);
			return $surface;
		}
		echo ("la surface est :");
		echo surface(12);
	?>
</body>
</html>