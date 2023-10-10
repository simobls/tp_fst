<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Exerice 5</title>
</head>
<body>
	<?php
		function multiple_3_5($n){
			if ($n % 3 == 0 && $n % 5 == 0) {
				echo ($n . " est a la fois un multiple de 3 et 5</br>");
			}
			else {
				echo ($n . " n'est pas a la fois un multiple de 3 et 5</br>\n");
			}
		}
		multiple_3_5(15);
		multiple_3_5(18);
		multiple_3_5(30);

		function paire_impaire($n) {
			if ($n % 2 == 0) {
				echo ($n . " est paire</br>");
			}
			else {
				echo ($n . " est impaire</br>\n");
			}
		}
		paire_impaire(4);
		paire_impaire(5);

		function pgcd($A, $B) {
			$temp = 0;
            $r = 0;
            $res = 0;
			if (is_int($A) && is_int($B)) {
				if($B >= $A){
					$temp = $A;
					$A = $B;
					$B = $temp;
				}
				do {
					$r=$A % $B;
					$A = $B;
					$B = $r;
				}while($r!=0);
				$res=$A;
				echo ("le PGCD est ". $res . "</br>");
			}
			else {
				echo ("Erreur</br>");
			}
        }
		pgcd(2, 8);
		pgcd(2.34, 6);

		function test($age, $sexe) {
			$sexe2 = "femme";
			if ($sexe == $sexe2 && $age >= 21 && $age <= 40) {
				echo ("Bienvenue</br>");
			}
			else {
				echo ("Desole</br>");
			}
		}
		test (19, "homme");
		test (23, "femme");
	?>
</body>
</html>