/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufra.edu.br.projeto_nap2_poo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ufra.edu.br.projeto_nap2_poo.entity.Ovos;
import ufra.edu.br.projeto_nap2_poo.util.FactoryConnection;

/**
 *
 * @author RODRIGO
 */
public class OvosDAO {

    public void save(Ovos ovos) {
        try {
            Connection connection = FactoryConnection.getConnection();
            PreparedStatement prepared;
            if (ovos.getId() == null) {
                prepared = connection.prepareStatement("INSERT INTO `ovos`(`quantidadeovos`,`pesototal`,`quantidadeovospequenos`,`quantidadeovosjumbo`,`quantidadeovossujo`,`quantidadeovostrincados`,`quantidadeovoscomsangue`,`quantidadeovosestranhos`) VALUES (?,?,?,?,?,?,?,?)");
            }else{
                prepared = connection.prepareStatement("update ovos set quantidadeovos=?, pesototal=?, quantidadeovospequenos=?, quantidadeovosjumbo=?, quantidadeovossujo=?, quantidadeovostrincados=?, quantidadeovoscomsangue=?, quantidadeovosestranhos=? where id=?");
                prepared.setInt(9, ovos.getId());
            }
            prepared.setInt(1, ovos.getQuantidadeovos());
            prepared.setDouble(2, ovos.getPesototal());
            prepared.setInt(3, ovos.getQuantidadeovospequeno());
            prepared.setInt(4, ovos.getQuantidadeovosjumbo());
            prepared.setInt(5, ovos.getQuantidadeovossujo());
            prepared.setInt(6, ovos.getQuantidadeovostrincado());
            prepared.setInt(7, ovos.getQuantidadeovoscomsangue());
            prepared.setInt(8, ovos.getQuantidadeovosestranho());
            prepared.execute();
            FactoryConnection.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(OvosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Ovos> search() {
        try {
            Connection connection = FactoryConnection.getConnection();
            PreparedStatement prepared = connection.prepareStatement("select * from ovos");
            ResultSet resultSet = prepared.executeQuery();
            List<Ovos> ovos = new ArrayList<>();
            while (resultSet.next()) {
                Ovos ovo = new Ovos();
                ovo.setId(resultSet.getInt("id"));
                ovo.setQuantidadeovos(resultSet.getInt("quantidadeovos"));
                ovo.setPesototal(resultSet.getDouble("pesototal"));
                ovo.setQuantidadeovospequeno(resultSet.getInt("quantidadeovospequenos"));
                ovo.setQuantidadeovosjumbo(resultSet.getInt("quantidadeovosjumbo"));
                ovo.setQuantidadeovossujo(resultSet.getInt("quantidadeovossujo"));
                ovo.setQuantidadeovostrincado(resultSet.getInt("quantidadeovostrincados"));
                ovo.setQuantidadeovoscomsangue(resultSet.getInt("quantidadeovoscomsangue"));
                ovo.setQuantidadeovosestranho(resultSet.getInt("quantidadeovoscomsangue"));
                ovos.add(ovo);
            }
            return ovos;
        } catch (SQLException ex) {
            Logger.getLogger(OvosDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
