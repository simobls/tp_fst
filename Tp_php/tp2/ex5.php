<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Document</title>
	<link rel="stylesheet" href="style.css">
</head>
<body>
	<form>
		<div>
			<input type="text" name = "first">
			<input type="text" name = "second"> <br> <br>
		</div>
		
		<select name="operator">
			<option>none</option>
			<option>add</option>
			<option>sub</option>
			<option>multiply</option>
			<option>divide</option>
		</select>
		<br><br>
		<button type = 'submit' value = 'submit' name = 'submit'>calculate</button>
	</form>
	<p>the result is : <br></p>
	<?php
		if (isset($_GET['submit'])) {
			$num1 = $_GET['first'];
			$num2 = $_GET['second'];
			$op = $_GET['operator'];
			switch ($op) {
				case 'none':
					echo "choose an operator";
					break;
				case 'add':
					echo $num1 . "+" . $num2 . "=" . $num1 + $num2;
					break;
				case 'sub':
					echo $num1 - $num2;
					break;
				case 'multiply':
					echo $num1 * $num2;
					break;
				case 'divide':
					if ($num2 != 0) {
						echo $num1 / $num2;
						break;
					} else {
						echo "you can't divide by 0";
					}
			}
		}
	?>
</body>
</html>
