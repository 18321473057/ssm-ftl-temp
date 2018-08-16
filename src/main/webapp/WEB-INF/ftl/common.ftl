<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h4 >今日科技</h4>
		<#list beans as bean>
			${(bean.userName)!""}
			${(bean.passWord)!""}
			
			<br/>
		</#list>
</body>
</html>