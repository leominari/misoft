/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.MProduto;

/**
 *
 * @author leo_m
 */
public class TProduto {

    private String id;
    private int codigo;
    private String nome;
    private String descricao;
    private String unidade;
    private Double custo;
    private Double precominimo;
    private Double preco;
    private String categoria;

    public TProduto(String id, int codigo, String nome, String descricao, String unidade, double custo, double precominimo, double preco, String categoria) {
        setId(id);
        setCodigo(codigo);
        setNome(nome);
        setDescricao(descricao);
        setUnidade(unidade);
        setCusto(custo);
        setPrecominimo(precominimo);
        setPreco(preco);
        setCategoria(categoria);
    }

    public TProduto() {

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
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the unidade
     */
    public String getUnidade() {
        return unidade;
    }

    /**
     * @param unidade the unidade to set
     */
    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    /**
     * @return the custo
     */
    public Double getCusto() {
        return custo;
    }

    /**
     * @param custo the custo to set
     */
    public void setCusto(Double custo) {
        this.custo = custo;
    }

    /**
     * @return the precominimo
     */
    public Double getPrecominimo() {
        return precominimo;
    }

    /**
     * @param precominimo the precominimo to set
     */
    public void setPrecominimo(Double precominimo) {
        this.precominimo = precominimo;
    }

    /**
     * @return the preco
     */
    public Double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(Double preco) {
        this.preco = preco;
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
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public List<TProduto> getProdutos() {
        try {
            return new MProduto().listaProdutos();
        } catch (SQLException ex) {
            Logger.getLogger(TProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public String toString() {
        return getNome(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
