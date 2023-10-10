<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Exercice 7</title>
</head>
<body>
	<?php
		function somme() {
			$somme = 0;
			for ($i = 1; $i <= 100; $i++) { 
				$somme = $somme + $i;
			}
			if ($somme > 100) {
				echo "la somme est " . $somme . "</br> Bon resultat</br>";
			}
			else {
				echo "pas suffisant</br>";
			}
		}
		somme();
		function somme2() {
			$somme = 0;
			$i = 1;
			while ($i <= 100) { 
				$somme = $somme + $i;
				$i++;
			}
			if ($somme > 100) {
				echo "la somme est " . $somme . "</br> Bon resultat</br>";
			}
			else {
				echo "pas suffisant</br>";
			}
		}
		somme2();
	?>

	<ul>
		<?php
			function power() {
				for ($i=1; $i <= 30; $i++) { 
					echo "<li>" . $i . "² = " . pow($i, 2);
				}		
			}
			power();
		?>
	</ul>
</body>
</html>