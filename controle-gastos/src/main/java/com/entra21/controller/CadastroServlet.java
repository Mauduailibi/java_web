package com.entra21.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import com.entra21.db.UsuarioDAO;
import com.entra21.model.Usuario;

@WebServlet("/cadastro")
public class CadastroServlet extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
    
        // 1. Capturar nome, usuario e senha digitados no formulário de cadastro
        String nome = request.getParameter("nome");
        String usuario = request.getParameter("usuario");
        String senha = request.getParameter("senha");

        // 2. Transformar esses dados em um novoUsuario do tipo Usuario
        Usuario novoUsuario = new Usuario(nome, usuario, senha);

        // 3. Instanciar o UsuarioDAO
        UsuarioDAO dao = new UsuarioDAO();

        // 4. chamar a função cadastrar do UsuarioDAO passando o novoUsuario 
        // E verificar se o retorno é true ou false
        boolean cadastrouUsuario = dao.cadastrar(novoUsuario);

        // Se for true, levem o usuário para a tela de login.jsp com uma mensagemSucesso
        // Se for falso, levem o usuário para a tela de cadastro.jsp com uma mensagemErro
        if(cadastrouUsuario) {
            request.setAttribute("mensagemSucesso", "Usuário cadastrado com sucesso!");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else {
            request.setAttribute("mensagemErro", "Erro ao cadastrar!");
            request.getRequestDispatcher("cadastro.jsp").forward(request, response);
        }
    }

}
