package com.entra21.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.time.LocalDate;

import com.entra21.db.GastoDAO;
import com.entra21.model.Gasto;
import com.entra21.model.Usuario;

@WebServlet("/inserirGasto")
public class InserirGastoServlet extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession();
        if (session == null || session.getAttribute("usuarioLogado") == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        Usuario usuario = (Usuario) session.getAttribute("usuarioLogado");

        // 1. Peguem as informações digitadas pelo usuario no inserir-gasto.jsp
        // conversao string para double --> Double.parseDouble(String s)
        // conversao string para LocalDate --> LocalDate.parse(String s)
        String descricao = request.getParameter("descricao");
        double valor = Double.parseDouble(request.getParameter("valor"));
        LocalDate data = LocalDate.parse(request.getParameter("data"));
        String categoria = request.getParameter("categoria");  
        int uId = usuario.getId();   

        // 2. Transformar as informações digitas em um novo objeto do tipo Gasto
        Gasto novoGasto = new Gasto(uId, descricao, valor, data, categoria);

        // 3. Criem uma instância do GastoDAO
        GastoDAO dao = new GastoDAO();

        // 4. Chamar o método inserirGasto passando o objeto novoGasto
        boolean inseriuGasto = dao.inserirGasto(novoGasto);

        // 5. Se o gasto foi inserido redirecionar o usuário para o painel 
        if (inseriuGasto) {
            response.sendRedirect("painel");
        } else {
            request.setAttribute("mensagemErro", "Ocorreu um erro.");
            request.getRequestDispatcher("inserir-gasto.jsp").forward(request, response);
        }

    }

}
