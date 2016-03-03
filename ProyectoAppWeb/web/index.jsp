<%-- 
    Document   : index
    Created on : 29-feb-2015, 1:08:49
    Author     : Christian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Busquedas</title>
        <link rel="shortcut icon" type="image/png" href="MEDIA/IMAGE/instagram12.png" />
        <link rel="stylesheet" type="text/css" href="MEDIA/CSS/style.css" />
        <link href="MEDIA/CSS/bootstrap-theme.min.css" rel="stylesheet">
        <link href="MEDIA/CSS/bootstrap.min.css" rel="stylesheet">

        <style type="text/css">
            body {
                background-image: url(MEDIA/IMAGE/naranja.jpg); 
                background-repeat: no-repeat;
            }
            .estiloTAGS2{
                position:fixed;
                left:630px;
                top:300px;
                font-size:xx-large;
                padding-right:30px;
            }
            .estiloTAGS1{
                position:fixed;
                left:630px;
                top:240px;
                font-size:x-large;
                padding-right:30px;
                font-family: fantasy;
            }
            .estiloTAGS3{
                position:fixed;
                left:1100px;
                top:305px;
                font-size:x-large;
                padding-right:30px;
            }
            .estiloTitulo{
                position:fixed;
                left:630px;
                top:120px;
                font-size:xx-large;
                padding-right:30px;
            }
            .estiloUSER2{
                position:fixed;
                left:630px;
                top:430px;
                font-size:xx-large;
                padding-right:30px;
            }
            .estiloUSER1{
                position:fixed;
                left:630px;
                top:375px;
                font-size:x-large;
                padding-right:30px;
                font-family: fantasy;
            }
            .estiloUSER3{
                position:fixed;
                left:1100px;
                top:435px;
                font-size:x-large;
                padding-right:30px;
            }
            .footer {
                background-color: #333;
            }
            .wrap-footer{}
            
            .copyright{
                text-align: center;
                background-color: #333333;
                padding: 10px 0px;
                color: #fff;                
            }
            
</style>
    </head>
    <body>
        </br>
        <div class="estiloTitulo"> Busqueda de diseños en instagram </div>
        <form id="form_tags" name="form_tags" method="post" action="tags.jsp">
            <fieldset><legend class="estiloTAGS1">TAGS</legend>
            <br/>
            <input type="text" name="tags" id="tags" class="estiloTAGS2" required/>
            <br/>
            <button type="submit_tags" class="estiloTAGS3">BUSCAR</button>
            </fieldset>
        </form>
        <form id="form_user" name="form_user" method="post" action="user.jsp">
            <fieldset><legend class="estiloUSER1">USUARIO</legend>
            <br/>
            <input type="text" name="usuario" id="usuario" class="estiloUSER2" required/>
            <br/>
            <button type="submit_user" class="estiloUSER3">BUSCAR</button>
            </fieldset>
        </form>
        
    </body>
</html>
