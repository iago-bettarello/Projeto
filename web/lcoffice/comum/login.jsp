<%-- 
    Document   : login
    Created on : 20/10/2014, 09:57:55
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/stylesheets/bootstrap-theme.min.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/stylesheets/bootstrap.min.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/stylesheets/bootstrap-theme.css.map" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/stylesheets/bootstrap.css.map" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/stylesheets/stylesheet.css" />
        <script src="${pageContext.request.contextPath}/resources/javascripts/jquery.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/javascripts/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/javascripts/npm.js"></script>
        <title>Login</title>
    </head>
    <body>
        <div class="container">
            <form action="${pageContext.request.contextPath}/lcoffice?acao=login" method="post" 
                  class="form-signin" role="form" autocomplete="off">
                ${erro}
                <label for="usuario">Usu&aacute;rio</label>
                <input type="text" id="usuario" name="usuario" class="form-control" a
                       utocomplete="off" required autofocus><br />
                <label for="senha">Senha</label>
                <input type="password" id="senha" name="senha" class="form-control" required>
                <label class="checkbox">
                    <input type="checkbox" value="lembrame"> Lembrar-me
                </label>
                <button class="btn btn-lg btn-success btn-block" type="submit">Logar</button>
            </form>
        </div>
    </body>
</html>
