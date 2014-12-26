package br.com.projeto.commands;

import br.com.projeto.pojo.UsuarioPojo;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Iago
 */
public class LogoutCommand implements Command {

    private UsuarioPojo up;
    private String pagina;
    
    @Override
    public String execute(HttpServletRequest request) {
        pagina = "lcoffice/comum/login.jsp";
        up = new UsuarioPojo();
        
        up.setSenha(null);
        up.setUsuario(null);
        
        if (request.getSession(false) != null) {
            request.getSession(false).invalidate();
        }
        
        return pagina;
    }
    
}
