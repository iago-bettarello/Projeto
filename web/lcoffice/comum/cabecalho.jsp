<%-- 
    Document   : login
    Created on : 20/10/2014, 09:57:55
    Author     : pc
--%>

<%@page import="java.awt.Dimension"%>
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
        <title>Locadora</title>
    </head>
    <body>
        <div class="navbar navbar-default navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Locadora</a>
                </div>
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="lcoffice">Home</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Sistema <span class="caret"></span></a>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="lcoffice?acao=configuracoes">Configura&ccedil;&otilde;es</a></li>
                                <li><a href="lcoffice?acao=usuarios"><i class="glyphicon glyphicon-user"></i>Usu&aacute;rios</a></li>
                                <li><a href="lcoffice?acao=grupo_usuario">Grupo de Usu&aacute;rio</a></li>
                                <li class="divider"></li>
                                <li class="dropdown-header">Nav header</li>
                                <li><a href="#">Separated link</a></li>
                                <li><a href="#">One more separated link</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Menu 2 <span class="caret"></span></a>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="#">Action</a></li>
                                <li><a href="#">Another action</a></li>
                                <li><a href="#">Something else here</a></li>
                                <li class="divider"></li>
                                <li class="dropdown-header">Nav header</li>
                                <li><a href="#">Separated link</a></li>
                                <li><a href="#">One more separated link</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Menu 3 <span class="caret"></span></a>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="#">Action</a></li>
                                <li><a href="#">Another action</a></li>
                                <li><a href="#">Something else here</a></li>
                                <li class="divider"></li>
                                <li class="dropdown-header">Nav header</li>
                                <li><a href="#">Separated link</a></li>
                                <li><a href="#">One more separated link</a></li>
                            </ul>
                        </li>
                        <li class="dropdown-toggle"><a href="${pageContext.request.contextPath}/lcoffice?acao=logout">Sair</a></li>
                    </ul>
                </div><!--/.nav-collapse -->
            </div>
        </div>
        <div class="container">