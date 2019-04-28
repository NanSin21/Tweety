<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript">
</script>
<title>Tools</title>
<style>
.btn-group button {
  background-color: rgb(137, 166, 255); /* Green background */
  border: 1px solid #5151d8; /* Green border */
  border-radius: 8px;
  color: white; /* White text */
  padding: 10px 12px; /* Some padding */
  cursor: pointer; /* Pointer hand icon */
  float: left; /* Float the buttons side by side */
  margin-right:10px;
}

/* Clear floats (clearfix hack) */
.btn-group:after {
  content: "";
  clear: both;
  display: table;
}

.btn-group button:not(:last-child) {
  border-right: none; /* Prevent double borders */
}

/* Add a background color on hover */
.btn-group button:hover {
  background-color: #5151d8;
}
</style>

</head>
<body>
<h1>Choose any tool</h1>


<div class="btn-group" >

  <button onclick="location.href='img/hive graph.jpg'" style="width:250px">Hive</button>
  <button onclick="location.href='img/Piggraph.jpg'" style="width:250px">Pig</button>
</div>
</body>
</html>