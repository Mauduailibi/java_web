package com.entra21.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import com.entra21.db.UsuarioDAO;
import com.entra21.model.Usuario;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        // 1. Capturar o usuario e senha digitados no form de login
        String usuarioDigitado = request.getParameter("usuario");
        String senhaDigitada = request.getParameter("senha");

        // 2. Instanciar o UsuarioDAO
        UsuarioDAO dao = new UsuarioDAO();

        // 3. Chamar o método autenticar do DAO passando o usuario 
        // e senha digitados
        Usuario usuarioEncontrado = dao.autenticar(usuarioDigitado, senhaDigitada);

        // 4. Verificar se o usuarioEncontrado é null.
        // Se for null, redireciono para login.jsp com mensagem de erro 
        // Se não for null, redireciono para painel.jsp
        if (usuarioEncontrado == null) {
            request.setAttribute("mensagemErro", "Usuario ou senha inválidos!");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else {
            response.sendRedirect("painel.jsp");
        }

    }

}
