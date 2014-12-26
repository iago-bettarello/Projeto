/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.encrypt;

import br.com.projeto.pojo.UsuarioPojo;
import br.com.projeto.config.Config;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Iago
 */
public class Encrypt {

    public String criptografar(UsuarioPojo up) {
        try {
            /**
             * Cria um atributo na sessão com o nome do usuário que logou no
             * banco de dados.
             */
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            try {
                byte msgDigest[] = md.digest(up.getSenha().getBytes("UTF-8"));
                StringBuilder str = new StringBuilder();

                for (byte b : msgDigest) {
                    str.append(String.format("%02X", 0xFF & b));
                }
                String senha = str.toString();
                
                return senha;
            } catch (UnsupportedEncodingException ex) {
                Config.MSG_ERRO = ex.getMessage();
                return null;
            }
        } catch (NoSuchAlgorithmException ex) {
            Config.MSG_ERRO = ex.getMessage();
            return null;
        }
    }
}
