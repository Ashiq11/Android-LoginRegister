<?php
    $con = mysqli_connect("localhost ","id2686693_ashiq","ashiq ","id2686693_userdb");
    
    $name = $_POST["name"];
    $email = $_POST["email"];
    $password = $_POST["password"];
    $confirmpassword = $_POST["confirmpassword"];
    $age = $_POST["age"];
    $phone = $_POST["phone"];
    $address = $POST["address"];
    
    $statement = mysqli_prepare($con, "INSERT INTO user (name, username, age, password) VALUES (?, ?, ?, ?, ?, ?, ?)");
    mysqli_stmt_bind_param($statement, "siss", $name, $email,$password,$confirmpassword, $age, $phone, $address);
    mysqli_stmt_execute($statement);
    
    $response = array();
    $response["success"] = true;  
    
    echo json_encode($response);
?>