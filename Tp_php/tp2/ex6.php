<!DOCTYPE html>
<html>
    <head>
        <title>Adresse client</title>
    </head>
    <body>

    <form  method="post"> 
    <fieldset>
    Nom : <input type="text" name="nom"><br>
    Prenom : <input type="text" name="prenom"><br>
    Adresse : <input type="text" name="ad"><br>
    Ville : <input type="text" name="ville"><br>
    Code postal : <input type="number" name="code"><br>
</fieldset>
<input type="submit" value="Envoyer">
<input type="reset" value="annuler"><br>
    </form>
    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $nom=$_POST["nom"];
        $prenom=$_POST["prenom"];
        $ad=$_POST["ad"];
        $code=$_POST["code"];
        $ville=$_POST["ville"];
    }
?>
    <h2>Informations du client :</h2>
    <table border="1">
        <tr>
            <th>Nom</th>
            <th>Prenom</th>
            <th>Adresse</th>
            <th>Ville</th>
            <th>Code Postal</th>
        </tr>
        <tr>
            <td><?php echo $nom; ?></td>
            <td><?php echo $prenom; ?></td>
            <td><?php echo $ad; ?></td>
            <td><?php echo $ville; ?></td>
            <td><?php echo $code; ?></td>
        </tr>
    </table>



    
    
    
    ?>