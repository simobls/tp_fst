<!DOCTYPE html>
<html>
<head>
    <title>Formulaire PHP</title>
</head>
<body>
    <form method="post" >
        Nom :    <input type="text"  name="nom"><br>
        Prenom : <input type="text" name="prenom"><br>
        Age :   <input type="number" name="age"><br>
        <input type="submit"  value="Envoyer">
    </form>
    <?php
		if ($_SERVER["REQUEST_METHOD"] == "POST") {
			$nom=$_POST['nom'];
			$prenom= $_POST["prenom"];
			$age= $_POST["age"];
		}

        echo "Bienvenue " .$prenom. " " .$nom. ", vous avez " .$age. " ans.";
    ?>
</body>
</html>