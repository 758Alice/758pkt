<%@page import="com.ysj.word.model.Word"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>remember</title>
</head>
<body>
	<table>
	<%List<Word> data = (List<Word>)request.getAttribute("data");
	   /* Word word = null;
	  if(data != null){
		  for(int i=0;i<data.size();i++){
			  word = data.get(i);
			   int id = data.get(i).getId();
			  String Word = data.get(i).getWord();
			  String A = data.get(i).getA();
			  String B = data.get(i).getB();
			  String C = data.get(i).getC();
			  String D = data.get(i).getD();   */
			  %>
			 <%=data %>
			  <%
	/* 	  }
	  } */
	%>
	</table>
</body>
</html>