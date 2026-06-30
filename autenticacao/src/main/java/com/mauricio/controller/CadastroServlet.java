package com.mauricio.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.mauricio.data.BancoUsuario;
import com.mauricio.model.Usuario;

@WebServlet("/cadastro")
public class CadastroServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Garante que requisições e respostas processem acentos corretamente
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        // Seu código vem aqui
        String nomeDigitado = request.getParameter("nome");
        String usuarioDigitado = request.getParameter("usuario");
        String senhaDigitada = request.getParameter("senha");
        boolean existe = false;

        for(Usuario u : BancoUsuario.lista) {
            if(u.getUsuario().equals(usuarioDigitado)) {
                existe = true;
                break;
            }
        }

        if(existe) {
            request.setAttribute("mensagemErro", "Este usuário já existe!");
            request.getRequestDispatcher("cadastro.jsp").forward(request, response);
        } else {
            BancoUsuario.lista.add(new Usuario(nomeDigitado, usuarioDigitado, senhaDigitada));
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }

    }
}