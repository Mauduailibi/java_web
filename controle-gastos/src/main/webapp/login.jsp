<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <title>Login - Controle de Gastos</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="flex-center">
        <div class="container-auth">
            <h2>Controle de Gastos</h2>
            <div class="error">${mensagemErro}</div>
            <div class="success">${mensagemSucesso}</div>
            <form action="login" method="POST">
                <div class="form-group">
                    <label>Usuário:</label>
                    <input type="text" name="usuario" required>
                </div>
                <div class="form-group">
                    <label>Senha:</label>
                    <input type="password" name="senha" required>
                </div>
                <button type="submit" class="btn-auth-primary">Acessar Conta</button>
            </form>
            <div class="links links-primary">
                <a href="cadastro.jsp">Ainda não tem conta? Cadastre-se</a>
            </div>
        </div>
    </div>
</body>
</html>