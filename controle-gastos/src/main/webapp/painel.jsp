<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <title>Meu Painel - Controle de Gastos</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body class="body-dashboard">
    <div class="navbar">
        <h2>Olá, ${nomeUsuario}!</h2>
        <a href="logout" class="btn btn-danger">Sair da Conta</a>
    </div>

    <div class="container-dashboard">
        <div class="header-content">
            <h3>Histórico de Gastos</h3>
            <a href="inserir-gasto.jsp" class="btn btn-primary">+ Adicionar Novo Gasto</a>
        </div>
        
        <div class="success">${mensagemSucesso}</div>

        <table>
            <thead>
                <tr>
                    <th>Data</th>
                    <th>Descrição</th>
                    <th>Categoria</th>
                    <th>Valor</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td colspan="4" style="text-align: center; color: #6b7280;">Nenhum gasto registrado ainda. Comece a anotar!</td>
                </tr>
            </tbody>
        </table>

        <div class="total-box">
            Total de Despesas: <span class="total-valor">R$ ${totalGastos}</span>
        </div>
    </div>
</body>
</html>