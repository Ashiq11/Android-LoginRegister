<?php
	//$con = mysqli_connect("my_host ","my_user","my_password ","my_db");
	$con = mysqli_connect("localhost ","id2686693_ashiq","ashiq ","id2686693_userdb");

	$username = $_POST["username"];
	$password = $_POST["password"];

	$statement = mysqli_prepare($con, "SELECT * FROM USER WHERE username = ? AND password = ?" );
	mysqli_stmt_bind_param($statement, "ss", $username, $password);
    mysqli_stmt_execute($statement);
    
    mysqli_stmt_store_result($statement);
    mysqli_stmt_bind_result($statement, $userID, $username, $age, $email,$phone, $address);
    
    $response = array();
    $response["success"] = false;  
    
    while(mysqli_stmt_fetch($statement)){
        $response["success"] = true;  
        $response["name"] = $username;
        $response["age"] = $age;
        $response["email"] = $email;
        $response["phone"] = $phone;
        $response["address"] = $address;
    }
    
    echo json_encode($response)
?>