<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>calculatrice</title>
</head>
<body>
<%
int opr1=Integer.parseInt(request.getParameter("opr1"));
int opr2=Integer.parseInt(request.getParameter("opr2"));
String operation=request.getParameter("operation");
String resultat="";
%>
<%! 
float leresultat;
%>
<h3>reponse</h3>
<%
if (operation.equals("addition") ){
	resultat= String.valueOf(opr1+opr2);
	leresultat=opr1+opr2;
}
if (operation.equals("soustaction")){
	resultat=String.valueOf(opr1-opr2);
	leresultat=opr1-opr2;
}
if (operation.equals("multiplication")){
	resultat=String.valueOf(opr1*opr2);
	leresultat=opr1*opr2;
}

if (operation.equals("division")){
	
	if (opr2==0) {
		%>
		<jsp:forward page="erreur.jsp"/>
		<%
		}
	else{
		resultat=String.valueOf(opr1/opr2);
		leresultat=opr1/opr2;
	}
}
		
		%>
		<hr>
		<table><tr>
		<td>Resultat</td>
		<td><%= leresultat %>
		</td>
		</tr></table>



</body>
</html>