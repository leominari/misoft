/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import api.ConexaoMysql;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tipos.TProduto;

/**
 *
 * @author leo_m
 */
public class MProduto {

    public boolean novoCadastro(TProduto produto) {
        ConexaoMysql banco = new ConexaoMysql();
        String query = "INSERT INTO `produto`(`codigo`,`nome`, `descricao`, `unidade`, `categoria`, `custo`, `precominimo`, `preco`) VALUES ('"
                + produto.getCodigo() + "','"
                + produto.getNome() + "','"
                + produto.getDescricao() + "','"
                + produto.getUnidade() + "',"
                + produto.getCategoria() + ",'"
                + produto.getCusto() + "','"
                + produto.getPrecominimo() + "','"
                + produto.getPreco() + "');";
        return banco.upQuery(query);

    }

    public boolean verificaCadastroExiste(String nome) {
        String query = "SELECT nome FROM produto WHERE nome='" + nome + "';";
        ConexaoMysql banco = new ConexaoMysql();
        ResultSet rs = banco.exQuery(query);
        try {
            if (rs.next()) {
                return false;
            } else {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public List<TProduto> listaProdutos() throws SQLException {
        List<TProduto> produtos = new ArrayList<>();
        String query = "SELECT * FROM produto ORDER BY nome;";
        ConexaoMysql banco = new ConexaoMysql();
        ResultSet rs = banco.exQuery(query);
        while (rs.next()) {
            produtos.add(new TProduto(
                    rs.getString("id"),
                    rs.getInt("codigo"),
                    rs.getString("nome"),
                    rs.getString("descricao"),
                    rs.getString("unidade"),
                    rs.getDouble("custo"),
                    rs.getDouble("precominimo"),
                    rs.getDouble("preco"),
                    rs.getString("categoria")
            ));
        }
        return produtos;
    }
}
