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
        pagina = "lcoffice/comum/login.jsp";
        up = new UsuarioPojo();
        
        up.setUsuario(request.getParameter("usuario"));
        up.setSenha(request.getParameter("senha"));
        
        if (new ValidateLogin().login(up, request)) {
            pagina = "lcoffice/comum/home.jsp";
        }
        
        return pagina;
    }
    
}
