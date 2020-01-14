/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import model.MLogin;
import tipos.TUsuario;

/**
 *
 * @author leo_m
 */
public class CLogin {

    private TUsuario user;

    public TUsuario buscaUser(TUsuario user) throws SQLException {
        MLogin lg = new MLogin();
        setUser(lg.getUsuario(user.getUsuario()));
        return getUser();
    }

    public boolean doLogin(TUsuario user) {
        if (!(user == null) || !(this.user == null)) {
            if (getUser().getUsuario().equals(user.getUsuario())) {
                if (getUser().getSenha().equals(user.getSenha())) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * @return the user
     */
    public TUsuario getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(TUsuario user) {
        this.user = user;
    }
}
