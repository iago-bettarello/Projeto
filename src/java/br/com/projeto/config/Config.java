/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.config;

import javax.servlet.http.HttpSession;

/**
 * Classe de constantes que serão usadas no sistema
 * @author Iago
 */
public class Config {
    
    // Sessão de declarações de constantes
    
    /**
     * Driver de conexão com o banco.
     */
    public static final String DB_POSTGRES_DRIVER = "org.postgresql.Driver";
    
    /**
     * IP do banco para conexão.
     */
    public static final String DB_POSTGRES_IP = "localhost";
    
    /**
     * Porta para conexão.
     */
    public static final String DB_POSTGRES_PORTA = "5432";
    
    /**
     * Nome do banco de dados.
     */
    public static final String DB_POSTGRES_BANCO = "locadora_bd";
    
    /**
     * Usuário padrão que será usado para conexão na loja.
     */
    public static final String DB_POSTGRES_USUARIO = "loja";
    
    /**
     * Senha do usuario padrão.
     */
    public static final String DB_POSTGRES_SENHA = "i1a2g3o4";
    
    /**
     * Variavel que conterá as mensagens de erro que serão exibidas para o
     * usuario.
     */
    public static String MSG_ERRO = "";
}
