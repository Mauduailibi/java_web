<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <title>Cadastro - Controle de Gastos</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="flex-center">
        <div class="container-auth">
            <h2>Criar Conta</h2>
            <div class="error">${mensagemErro}</div>
            <form action="cadastro" method="POST">
                <div class="form-group">
                    <label>Nome Completo:</label>
                    <input type="text" name="nome" required>
                </div>
                <div class="form-group">
                    <label>Usuário:</label>
                    <input type="text" name="usuario" required>
                </div>
                <div class="form-group">
                    <label>Senha:</label>
                    <input type="password" name="senha" required>
                </div>
                <button type="submit" class="btn-auth-secondary">Cadastrar</button>
            </form>
            <div class="links links-secondary">
                <a href="login.jsp">Voltar para o Login</a>
            </div>
        </div>
    </div>
</body>
</html>