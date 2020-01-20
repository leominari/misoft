/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import api.ConexaoMysql;
import java.sql.SQLException;
import tipos.TCategoria;

/**
 *
 * @author leo_m
 */
public class MCadastroCategoria {

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
}
