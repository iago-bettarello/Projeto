/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dbConnection;

import br.com.projeto.config.Config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pc
 */
public class ConnectionPostgreSql {
    
    /**
     * Variavel que irá conter a mensagem do erro gerado se ocorrer
     */
    public static String msgError = "";
    
    /**
     * Função para conexão com o banco de dados
     * esta função é estática para não ser necessário
     * uma instancia dela, podendo ser chamado a qualquer
     * momento
     * @param usuario - Usuario para conexão com o banco
     * @param senha - Senha do usuario para estabelecer a conexão com o banco
     * @return - Retorna a conexão com o banco ou nulo em caso de falha
     */
    public static Connection getConexao(String usuario, String senha) {
        
        /**
         * Veridica se o usuário e/ou senha estão vazios
         * se estiverem não inicia o processo de conexão com o banco de dados.
         */
        if ((usuario == null | "".equals(usuario)) || (senha == null | "".equals(senha))) {
            Config.MSG_ERRO = "";
            return null;
        } else {
            
            /**
             * Monta a String do driver de conexão com o Banco Postgres.
             */
            String url = "jdbc:postgresql://"+Config.DB_POSTGRES_IP+":"+Config.DB_POSTGRES_PORTA+"/"+Config.DB_POSTGRES_BANCO;

            try {
                
                /**
                 * Cria o driver de conexão com o banco.
                 */
                Class.forName(Config.DB_POSTGRES_DRIVER);
                try {
                    
                    /**
                     * Tenta fazer a conexão com o banco, passando a url para
                     * conexão, usuario e senha do usuario no banco.
                     * Em caso de falha, ele irá retornar nulo.
                     */
                    return DriverManager.getConnection(url, usuario, senha);
                } catch (SQLException ex) {
                    Config.MSG_ERRO = "Usu&aacute;rio e/ou Senha inv&aacute;lido(s)";
                    return null;
                }
            } catch (ClassNotFoundException ex) {
                Config.MSG_ERRO = "Erro ao tentar criar o driver de conex&atilde;o";
                return null;
            }
        }
    }
}
