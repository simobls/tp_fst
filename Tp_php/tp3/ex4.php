<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Document</title>
</head>
<body>
	<?php
		$file = fopen("fichier.txt", "w+");
		fwrite($file, "hello this is a file");
		rewind($file);
		echo fgets($file);
		fclose($file);

		copy("fichier.txt", "copy.txt");
		rename("fichier.txt", "renamed.txt");
	?>
</body>
</html>