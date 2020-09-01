<?php
require "dbconnection.php";
$username = $_GET("username");
$password = $_GET("password");
// $logintime = $_GET("login_time");
// $loginstate = $_GET("login_state");

$sql = "SELECT * FROM data WHERE username = '$username'";

$result = mysqli_query($con,$sql);

if(mysqli_num_rows($result)>0){
    $status = "ada";

}
else
    {
    $sql = "insetrt into data(username,password) values('$username','password');";
    if(mysqli_query($con,$sql))
    {
      $status = "ok" ;
    }
    else
    {
      $status = "error";
    }
  }

echo json_encode(array("response"=>$status));
mysqli_close($con);
?>
