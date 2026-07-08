package com.entra21.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.entra21.model.Usuario;

public class UsuarioDAO {
    
    // Função de login
    public Usuario autenticar(String usuarioDigitado, String senhaDigitada) {

        String sql = "SELECT * FROM usuarios WHERE usuario = ? AND senha = ?";
        Usuario usuarioEncontrado = null;

        try (
            Connection conexao = ConexaoDB.conectar();
            PreparedStatement comando = conexao.prepareStatement(sql)
        ) {

            comando.setString(1, usuarioDigitado);
            comando.setString(2, senhaDigitada);

            ResultSet resultado = comando.executeQuery();

            if(resultado.next()) {
                String nome = resultado.getString("nome");
                String usuario = resultado.getString("usuario");
                String senha = resultado.getString("senha");

                usuarioEncontrado = new Usuario(nome, usuario, senha);
                usuarioEncontrado.setId(resultado.getInt("id"));
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return usuarioEncontrado;
    }

    // Função de cadastro
    public boolean cadastrar(Usuario novoUsuario) {

        String sql = "INSERT INTO usuarios (nome, usuario, senha) VALUES (?, ?, ?)";

        try (
            Connection conexao = ConexaoDB.conectar(); 
            PreparedStatement comando = conexao.prepareStatement(sql)
        ) {

            comando.setString(1, novoUsuario.getNome());
            comando.setString(2, novoUsuario.getUsuario());
            comando.setString(3, novoUsuario.getSenha());

            return comando.executeUpdate() > 0;

        } catch(Exception e) {
            return false;
        }

    }

}
