<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Document</title>
</head>
<body>
	<?php
		$dateInfo = getdate();
		$day = $dateInfo['mday'];
		$month = $dateInfo['mon'];
		$year = $dateInfo['year'];

		echo "La date d'aujourd'hui est : $day/$month/$year";
	?>
	<br>
	<?php
		$date = date("d/m/Y"); // Format : jour/mois/année
		echo "La date d'aujourd'hui est : " . $date;
	?>
	<br>
	<?php
		$date1 = "1/10/2016";
		$date2 = "20/13/2015";

		list($day1, $month1, $year1) = explode('/', $date1);
		list($day2, $month2, $year2) = explode('/', $date2);

		if (checkdate($month1, $day1, $year1)) {
			echo "La première date $date1 est valide.<br>";
		} else {
			echo "La première date $date1 est invalide.<br>";
		}

		if (checkdate($month2, $day2, $year2)) {
			echo "La deuxième date $date2 est valide.<br>";
		} else {
			echo "La deuxième date $date2 est invalide.<br>";
		}
	?>
</body>
</html>