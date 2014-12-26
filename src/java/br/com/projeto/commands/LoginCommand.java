/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.commands;

import br.com.projeto.pojo.UsuarioPojo;
import br.com.projeto.validates.ValidateLogin;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Iago
 */
public class LoginCommand implements Command {

    private UsuarioPojo up;
    private String pagina;

    @Override
    public String execute(HttpServletRequest request) {
        if (isLogged(request) == false) {
            pagina = "lcoffice/comum/login.jsp";
            up = new UsuarioPojo();

            up.setUsuario(request.getParameter("usuario"));
            up.setSenha(request.getParameter("senha"));

            if (new ValidateLogin().login(up, request)) {
                pagina = "lcoffice/comum/home.jsp";
            }
        } else {
            pagina = "lcoffice/comum/home.jsp";
        }
        return pagina;
    }

    public static boolean isLogged(HttpServletRequest req) {

        if (req.getSession(false) != null) {
            return req.getSession(false).getAttribute("usuario") != null && !"".equals(req.getSession(false).getAttribute("usuario"));
        } else {
            return false;
        }
    }
}
