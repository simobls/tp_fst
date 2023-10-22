<!DOCTYPE html>
<html>
<head>
    <title>Password Verification Result</title>
</head>
<body>
    <?php
    if (isset($_POST['nom_utilisateur']) && isset($_POST['mot_de_passe'])) {
        $nom_utilisateur = $_POST['nom_utilisateur'];
        $mot_de_passe = $_POST['mot_de_passe'];

        $valid_password = "pass";

        if ($mot_de_passe === $valid_password) {
            echo "Mot de passe valide pour l'utilisateur $nom_utilisateur.";
        } else {
            echo "Mot de passe invalide pour l'utilisateur $nom_utilisateur.";
        }
    } else {
        echo "Veuillez saisir un nom d'utilisateur et un mot de passe.";
    }
    ?>
    <br><br>
    <input type="button" value="Retour" onclick="self.history.back();">
</body>
</html>
