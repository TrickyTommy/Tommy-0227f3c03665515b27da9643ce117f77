<?php
require "dbconnection.php";

$username = $_POST["username"];
$password = $_POST["password"];

$sql = "SELECT username FROM data WHERE username = '$username' AND password = '$password'";
//$sql = mysqli_query($con, "SELECT * FROM data WHERE username LIKE '%".$username."%' AND password = '%".$username."%'");
$result = mysqli_query($con,$sql);
echo json_encode(array("response"=>$username,"username"=>$password));
if(!mysqli_num_rows($result)>0)
{
  $status = "gagal";
  echo json_encode(array("response"=>$status));
}
else
{
  $row = mysqli_fetch_assoc($result);
  $name = $row['username'];
  $status = "ok";
  echo json_encode(array("response"=>$status,"username"=>$name));
}

mysqli_close($con);
?>
