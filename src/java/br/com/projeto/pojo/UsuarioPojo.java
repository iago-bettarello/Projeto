/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.pojo;

/**
 *
 * @author pc
 */
public class UsuarioPojo {
    
    private String usuario;
    private String senha;

    public UsuarioPojo() {
        this.usuario = "";
        this.senha = "";
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
