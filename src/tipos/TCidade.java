/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos;

import java.sql.SQLException;
import java.util.List;
import model.MEndereco;

/**
 *
 * @author leo_m
 */
public class TCidade {

    private String id;
    private String nome;

    public TCidade() {
    }

    public TCidade(String id, String nome) {
        setId(id);
        setNome(nome);
    }

    public List<TCidade> getCidades(String id) throws SQLException {
        return new MEndereco().listaCidadePorEstado(id);
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
}
