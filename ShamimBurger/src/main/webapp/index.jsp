<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
h1 {text-align: center;color:white;}
p {text-align: center;}
div {text-align: center;}
.btn {
border: 5px solid white;background-color:grey; height: 73px; width: 174px;border-radius: 5px;color:white;font-size: 18px;
}
.btnSubmit {
border: 5px solid white;background-color:grey; height: 40px; width: 350px;border-radius: 5px;color:white;font-size: 18px;
}
.center {
  display: flex;
  justify-content: center;
  align-items: center;
  border: 3px solid green;
  padding-top: 50px;
  padding-bottom: 50px; 
  color:white;
}
</style>
<script type="text/javascript">

	function btnBurger_click()
	{
		var burgerType = document.getElementById("btnBasicB").value;
		alert(burgerType);
		switch (burgerType) {
                case "Basic Burguer":
                	document.getElementById("Pickle").disabled = false;
                	document.getElementById("Pepper").disabled = false;
                	document.getElementById("btnHealty").disabled = false;
                	document.getElementById("btnDeluxeB").disabled = false;
                   
                   	document.getElementById("Egg").disabled = true;
                   	document.getElementById("Bacon").disabled = true;
                   	document.getElementById("Lettuce").disabled = true;
                   	document.getElementById("Tomato").disabled = true;
                  
                    break;
                case "Healty Burguer":
                	document.getElementById("btnBasicB").disabled = false;
                	document.getElementById("btnDeluxeB").disabled = false;
                    
                    document.getElementById("Egg").disabled = true;
                    document.getElementById("Bacon").disabled = true;
                    document.getElementById("Lettuce").disabled = true;
                    document.getElementById("Tomato").disabled = true;
                    document.getElementById("Pepper").disabled = true;
                    document.getElementById("Pickle").disabled = true;
                    
                    break;
                case "Deluxe Burguer":
                	document.getElementById("Egg").disabled = false;
                	document.getElementById("Bacon").disabled = false;
                	document.getElementById("Lettuce").disabled = false;
                	document.getElementById("Tomato").disabled = false;
                	document.getElementById("Pickle").disabled = false;
                	document.getElementById("Pepper").disabled = false;
                	document.getElementById("btnHealty").disabled = false;
                	document.getElementById("btnBasicB").disabled = false;
                	
                    break;
            }
	}


</script>
</head>
<body style="background-image:url('background.jpg');background-repeat: no-repeat;background-attachment: fixed;background-size: 100% 100%;">
	<br/>
	
	<h1>Welcome to Shamim</h1>
	<div class="center">
	<form action="helloServlet" method="post" style="color:white;justify-content: center;">
		<table style="padding-left:15px;">
			<tr>
				<td>
					<input type="button" value="Basic Burguer" id="btnBasicB" class="btn" onclick="btnBurger_Click()">
				</td>
				<td>
					<input type="button" value="Healty Burguer" id="btnHealty" class="btn">
				</td>
				<td>
					<input type="button" value="Deluxe Burguer"id="btnDeluxeB" class="btn">
				</td>
			</tr>
		</table>
		<br/>
		<table>
			<tr>
				<td>
					<img src="tomato.jpg" id="Pickle" class="btn">
				</td>
				<td>
					<img src="lettuce.jpg" class="btn" id="Lettuce">
				</td>
				<td>
					<img src="bacon.jpg" class="btn" id="Bacon">
				</td>
			</tr>
			<tr>
				<td>
					<img src="egg.jpg" class="btn" id="Egg">
				</td>
				<td>
					<img src="peper.jpg" id="Pepper" class="btn">
				</td>
				<td>
					<img src="pickle.jpg" class="btn" id="Pickle">
				</td>
			</tr>
		</table>
		<br/>
		<table style="padding-left:120px;">
			<tr>
				<td>
					<input type="button" value="Add to Order" class="btnSubmit"/>
				</td>
			</tr>
			<tr>
				<td>
				<input type="submit" value="Place Order" class="btnSubmit" />
				</td>
			</tr>
		</table>
	</form>
	</div>
</body>
</html>