<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Document</title>
</head>
<body>
	<?php
		$ch = "mon nom est karim";
		if (preg_match("/karim/", $ch)) {
			echo "le nom \"karim\" exist dans la chaine<br>";
		}
		else {
			echo "le nom \"karim\" n'exist pas dans la chaine<br>";
		}
		if (preg_match("/^/karim/", $ch)) {
			echo "le nom \"karim\" exist au debut de la chaine<br>";
		}
		else {
			echo "le nom \"karim\" n'exist pas au debut la chaine<br>";
		}
		if (preg_match("/karim$/", $ch)) {
			echo "le nom \"karim\" exist a la fin de la chaine<br>";
		}
		else {
			echo "le nom \"karim\" n'exist pas a la fin la chaine<br>";
		}
		echo preg_replace("\"karim\"", "nawal", $ch);
	?>
</body>
</html>