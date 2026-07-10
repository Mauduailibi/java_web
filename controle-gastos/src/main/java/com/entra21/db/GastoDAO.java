package com.entra21.db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import com.entra21.model.Gasto;
import com.entra21.db.ConexaoDB;

public class GastoDAO {

    public boolean inserirGasto(Gasto gasto) {

        String sql = "INSERT INTO gastos (usuario_id, descricao, valor, data_gasto, categoria) VALUES (?, ?, ?, ?, ?)";

        try (
            Connection conexao = ConexaoDB.conectar();
            PreparedStatement comando = conexao.prepareStatement(sql)
        ) {

            comando.setInt(1, gasto.getUsuarioId());
            comando.setString(2, gasto.getDescricao());
            comando.setDouble(3, gasto.getValor());
            comando.setDate(4, Date.valueOf(gasto.getDataGasto()));
            comando.setString(5, gasto.getCategoria());

            int linhasAfetadas = comando.executeUpdate();
            
            return linhasAfetadas > 0;

        } catch(Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

}
