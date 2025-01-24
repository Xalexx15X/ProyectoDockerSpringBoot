<?php
$servername = "localhost"; // Cambia 'database' a 'localhost'
$username = "root";
$password = "root";
$dbname = "springboot";

// Crear conexión
$conn = new mysqli($servername, $username, $password, $dbname);

// Verificar conexión
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $customerId = $_POST['customer_id'];

    $url = "http://localhost:9000/api/customers/" . $customerId;
    $ch = curl_init($url);
    curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
    $response = curl_exec($ch);
    curl_close($ch);

    $customer = json_decode($response, true);

    if ($customer) {
        echo "ID: " . $customer['id'] . " - Nombre: " . $customer['name'] . "<br>";
    } else {
        echo "No hay customer";
    }
} else {
    echo '<form method="POST" action="">
            <input type="text" name="customer_id" placeholder="Mete la id ar favo">
            <button type="submit">Buscar Cliente</button>
          </form>';
}
?>