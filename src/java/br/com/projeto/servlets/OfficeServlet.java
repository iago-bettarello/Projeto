/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.servlets;

import br.com.projeto.commands.Command;
import br.com.projeto.commands.LoginCommand;
import br.com.projeto.commands.LogoutCommand;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Iago
 */
public class OfficeServlet extends HttpServlet {

    private static final long serialVersionUID = -4849181048298975507L;

    private final Map<String, Command> comandos = new HashMap<>();
    private Command comando;
    private String acao;
    private String pagina;

    @Override
    public void init() throws ServletException {
        comandos.put("", new LoginCommand());
        comandos.put("login", new LoginCommand());
        comandos.put("logout", new LogoutCommand());
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        acao = (req.getParameter("acao") != null) ? req.getParameter("acao") : "";
        pagina = null;
        
        comando = this.verificarCommand(acao);
        pagina = comando.execute(req);
        req.getRequestDispatcher(pagina).forward(req, resp);
    }

    private Command verificarCommand(String acao) {
        for (String key : comandos.keySet()) {
            if (key.equalsIgnoreCase(acao)) {
                comando = comandos.get(key);
            }
        }
        return comando;
    }

}
