<?php
$tab1 = array("3", "5", "0", "8", "7");
$tab2 = array("carrottes" => "3", "Tomates" => "8", "courgettes" => "13");
?>

<!DOCTYPE html>
<html>

<head>
    <title>PHP Array to HTML Table</title>
</head>

<body>
    <h2>Table 1</h2>
    <table border="1">
        <tr>
            <th>Index</th>
            <th>Value</th>
        </tr>
        <?php
        foreach ($tab1 as $index => $value) {
            echo "<tr>";
            echo "<td>$index</td>";
            echo "<td>$value</td>";
            echo "</tr>";
        }
        ?>
    </table>

    <h2>Table 2</h2>
    <table border="1">
        <tr>
            <th>Item</th>
            <th>Quantity</th>
        </tr>
        <?php
        foreach ($tab2 as $item => $quantity) {
            echo "<tr>";
            echo "<td>$item</td>";
            echo "<td>$quantity</td>";
            echo "</tr>";
        }
        ?>
    </table>
</body>

</html>
