<?php

    // Parâmetro recebido via GET
    $id = isset($_GET['id']) ? (int)$_GET['id'] : 0;

    if ($id < 1) {
        die("ID inválido.");
    }

    require "conecta.php";

    // busca o BLOB pelo ID

    $sql = "SELECT arquivo_blob FROM arquivos WHERE id = ?";

    $stmt = mysqli_prepare($con, $sql);
    mysqli_stmt_bind_param($stmt, "i", $id);
    mysqli_stmt_execute($stmt);
    mysqli_stmt_store_result($stmt);

    // verifica se a consulta retornou resultados
    if (mysqli_stmt_num_rows($stmt) == 0) {
        die("Arquivo não encontrado.");
    }

    mysqli_stmt_bind_result($stmt, $arquivo_blob);
    mysqli_stmt_fetch($stmt);

    // fecha o $stmt e a conexão com o BD
    mysqli_stmt_close($stmt);
    mysqli_close($con);

    header("Content-Type: image/jpeg");

    echo $arquivo_blob;

?>
