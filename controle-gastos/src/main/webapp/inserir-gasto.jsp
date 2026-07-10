<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <title>Novo Gasto - Controle de Gastos</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="flex-center">
        <div class="container-form">
            <h2>Registrar Nova Despesa</h2>
            <form action="inserirGasto" method="POST">
                <div class="form-group">
                    <label>Descrição (Ex: Compras no mercado):</label>
                    <input type="text" name="descricao" required>
                </div>
                
                <div class="form-group">
                    <label>Valor (R$):</label>
                    <input type="number" step="0.01" name="valor" required>
                </div>
                
                <div class="form-group">
                    <label>Data:</label>
                    <input type="date" name="data" required>
                </div>
                
                <div class="form-group">
                    <label>Categoria:</label>
                    <select name="categoria" required>
                        <option value="">Selecione uma categoria...</option>
                        <option value="Alimentação">Alimentação</option>
                        <option value="Moradia">Moradia</option>
                        <option value="Transporte">Transporte</option>
                        <option value="Saúde">Saúde</option>
                        <option value="Lazer">Lazer</option>
                        <option value="Educação">Educação</option>
                        <option value="Outros">Outros</option>
                    </select>
                </div>
                
                <div class="btn-group">
                    <a href="painel" class="btn btn-cancel">Cancelar</a>
                    <button type="submit">Salvar Despesa</button>
                </div>
            </form>
        </div>
    </div>
</body>
</html>