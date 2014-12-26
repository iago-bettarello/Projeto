package br.com.projeto.commands;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Iago
 */
public interface Command {
    
    public String execute(HttpServletRequest request);
}
