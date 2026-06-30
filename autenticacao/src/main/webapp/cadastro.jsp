<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="pt-BR">
    <head>
        <meta charset="UTF-8">
        <title>Projeto Autenticação</title>
    </head>
    <body>
        <h2>Faça o cadastro</h2>

        <form action="cadastro" method="post">

            <input name="nome" placeholder="Informe seu nome" /> <br><br>
            <input name="usuario" placeholder="Informe o usuario" /> <br><br>
            <input name="senha" type="password" placeholder="Informe a senha" /> <br><br>

            <button type="submit">Cadastrar</button> <br><br>
            <a href="/autenticacao">Faça login</a>

            <br>

            <p style="color: red;">${mensagemErro}</p>

        </form>        
    
    </body>
</html>