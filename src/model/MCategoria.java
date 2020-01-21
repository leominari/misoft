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
import tipos.TCategoria;
import tipos.TEstado;

/**
 *
 * @author leo_m
 */
public class MCategoria {

    public boolean novaCategoria(TCategoria categoria) throws SQLException {
        ConexaoMysql banco = new ConexaoMysql();
        String query;
        if (categoria.getSubCategoria() != null) {
            query = "INSERT INTO `categoria`(`nome`, `subcategoria`) VALUES ('"
                    + categoria.getCategoria() + "','" + categoria.getSubCategoria() + "');";
        } else {
            query = "INSERT INTO `categoria`(`nome`) VALUES ('"
                    + categoria.getCategoria() + "');";
        }

        return banco.upQuery(query);

    }
    
        public List<TCategoria> listaCategorias() throws SQLException {
        List<TCategoria> categorias = new ArrayList<>();
        String query = "SELECT * FROM categoria;";
        ConexaoMysql banco = new ConexaoMysql();
        ResultSet rs = banco.exQuery(query);
        while (rs.next()) {
            categorias.add(new TCategoria(rs.getString("id"), rs.getString("nome"), rs.getString("subcategoria")));
        }
        return categorias;
    }
}
