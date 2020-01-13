/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.List;
import model.MEndereco;

/**
 *
 * @author leo_m
 */
public class Estado {

    private String id;
    private String nome;
    private String UF;

    public Estado() {
    }

    public Estado(String id, String nome, String UF) {
        setId(id);
        setNome(nome);
        setUF(UF);
    }

    public List<Estado> getEstados() throws SQLException {
        return new MEndereco().listaEstados();
    }

    @Override
    public String toString() {
        return getNome(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the UF
     */
    public String getUF() {
        return UF;
    }

    /**
     * @param UF the UF to set
     */
    public void setUF(String UF) {
        this.UF = UF;
    }
}
