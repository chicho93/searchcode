<%-- 
    Document   : user
    Created on : 29-feb-2015, 1:34:40
    Author     : Christian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="MEDIA/CSS/style.css" />
        <title>USUARIO</title>
        <link rel="shortcut icon" type="image/png" href="MEDIA/IMAGE/instagram12.png" />
    </head>
    <body>
        <ul id="instagram"></ul>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js" type="text/javascript"></script>
        <script type="text/javascript" src="MEDIA/JS/user.js"></script>
        <script>
            (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
                    (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
                m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
            })(window,document,'script','//www.google-analytics.com/analytics.js','ga');
            ga('create', 'UA-48075860-1', 'pinceladasdaweb.com.br');
            ga('send', 'pageview');
        </script>
        
        <% String usuario=request.getParameter("usuario");
        if(usuario!=null){                
                if(usuario.trim().isEmpty()){%>
                 <jsp:forward page="index.jsp" /> 
                <%}else{%>
                <input type="hidden" id="user" name="user" value="<%=usuario%>"/>
                <%}
                }
                %>
        
                
    </body>
</html>
