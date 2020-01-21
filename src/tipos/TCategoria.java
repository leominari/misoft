/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos;

import java.sql.SQLException;
import java.util.List;
import model.MCategoria;

/**
 *
 * @author leo_m
 */
public class TCategoria {

    private String id;
    private String categoria;
    private String subCategoria;

    public TCategoria(String id, String categoria, String subcategoria) {
        setId(id);
        setCategoria(categoria);
        setSubCategoria(subCategoria);
    }

    public TCategoria() {

    }

    @Override
    public String toString() {
        return getCategoria(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    public List<TCategoria> getCategorias() throws SQLException {
        return new MCategoria().listaCategorias();
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
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the subCategoria
     */
    public String getSubCategoria() {
        return subCategoria;
    }

    /**
     * @param subCategoria the subCategoria to set
     */
    public void setSubCategoria(String subCategoria) {
        this.subCategoria = subCategoria;
    }

    public void toStr() {
        System.out.println(getId());
        System.out.println(getCategoria());
        System.out.println(getSubCategoria());
    }

}
