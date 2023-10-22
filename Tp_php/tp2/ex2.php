<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Document</title>
</head>
<body>
	<form method="get">
		angle : <input type="number" name="number">
		unit :
		<select name="unit">
			<option>deg</option>
			<option>rad</option>
			<option>grad</option>
		</select>
		<button type="submit" name="submit">Calculer</button>
	</form>
	<?php
		if (isset($_GET['submit'])){
			$unit = $_GET['unit'];
			$angle = $_GET['number'];
			function calc($angle, $unit){
				$value = 0;
				switch ($unit) {
					case 'deg':
						$value = sin(deg2rad($angle));
						break;
					case 'rad':
						$value = sin($angle);
						break;
					case 'grad':
						$value = sin(deg2rad($angle * 0.9));
						break;
					default:
						echo "enter a valid case";
						break;
				}
				return $value;
			}
			$value = calc($angle, $unit);
			echo "the sinus of " . $angle . " " . $unit . " is " . $value;
		}
	?>
</body>
</html>
