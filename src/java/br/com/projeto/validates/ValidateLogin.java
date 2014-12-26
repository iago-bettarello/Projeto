/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.validates;

import br.com.projeto.pojo.UsuarioPojo;
import br.com.projeto.config.Config;
import br.com.projeto.dbConnection.ConnectionPostgreSql;
import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author pc
 */
public class ValidateLogin {
    private Connection con;
    
    public boolean login(UsuarioPojo up, HttpServletRequest req) {
        /**
         * Verifica se o usuario e senha são diferentes de vazio
         * para tentar fazer a conexão com o banco
         * se forem diferentes, irá tentar fazer a conexão e retornar a conexão
         *    ou nulo em caso de falha
         * se não, não irá tentar fazer a conexão e irá retornar nulo direto.
         */
        con = ConnectionPostgreSql.getConexao(up.getUsuario(), up.getSenha());
        
        /**
         * Se retornar nulo, significa que houve falha na conexão.
         */
        if (con == null) {
            return false;
        } else {
            try {
                /**
                 * Verifica se existe uma sessão criada,
                 * se existir irá retornar a mesma
                 * se não irá criar uma.
                 * Cria um atributo na sessão com o nome do usuário que logou
                 * no banco de dados.
                 */
                req.getSession(true).setAttribute("usuario", up.getUsuario());
                
                /**
                 * Fecha a conexão com o banco de dados e retorna true
                 * para informar que a conexão foi bem sucessida.
                 */
                con.close();
                
                return true;
            } catch (SQLException ex) {
                Config.MSG_ERRO = ex.getMessage();
                return false;
            }
        }
    }
}
