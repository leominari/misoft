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
import model.MCategoria;
import tipos.TCategoria;

/**
 *
 * @author leo_m
 */
public class CCategoria {

    private Mensagem msg;

    public boolean cadastraCategoria(TCategoria categoria) {
        msg = new Mensagem();
        try {
            if (new MCategoria().novaCategoria(categoria)) {
                msg.sucessoCadastro();
                return true;
            } else {
                msg.erroCadastro();
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
