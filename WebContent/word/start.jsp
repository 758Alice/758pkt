<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%String path=request.getContextPath(); 
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>首页</title>

<script type="text/javascript">
function testLogin(){
	$.ajax({
		type: "POST",
		   url: "<%=path %>/word/queryWord.do",
		   data: {},
		   async:true,
		   dataType:"json",
		   success: function(data){
			   if(data.size>0){
			   		out.print(data);
			   }else{
				    alert("HUHB");
			   }
		   },
		   error:function(XMLHttpRequest, textStatus, errorThrown){
			   alert("请求异常");
		   }
		});
}
</script>
</head>
<body>
		<table>
			<tr>
				<td>out.print(<%=path %>)</td>
				<td><input type="button" value="背单词" onclick="testLogin()"></td>
			</tr>
		</table>
</body>
</html>