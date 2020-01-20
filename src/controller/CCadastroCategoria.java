/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import api.Mensagem;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.MCadastroCategoria;
import tipos.TCategoria;

/**
 *
 * @author leo_m
 */
public class CCadastroCategoria {

    private Mensagem msg;

    public boolean cadastraCategoria(TCategoria categoria) {
        try {
            if (new MCadastroCategoria().novaCategoria(categoria)) {
                msg.sucessoCadastro();
                return true;
            } else {
                msg.erroCadastro();
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CCadastroCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
