/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarefaDAO;

import util.FabricaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tarefa.Tarefa;

/**
 *
 * @author muril
 */
public class TarefaDAO {

//----------- METODO DE LISTAR TODOS OS ATRIBUTOS -------------------------------------------------
    public static List<Tarefa> listarTodos() throws SQLException, ClassNotFoundException {
        Connection con = FabricaConexao.getConexao();
        PreparedStatement comando = con.prepareStatement("select * from tarefa");
        ResultSet rs = comando.executeQuery();
        List<Tarefa> retorno = new ArrayList<>();

        try {
            con = FabricaConexao.getConexao();
            comando = con.prepareStatement("select * from sistema.tarefa");
            rs = comando.executeQuery();
            while (rs.next()) {
                Tarefa trf = new Tarefa();
                trf.setId(rs.getInt("id"));
                trf.setNomeTarefa(rs.getString("nome_tarefa"));
                trf.setResponsavel(rs.getString("responsavel"));
                trf.setDataAbertura(rs.getString("data_abertura"));
                trf.setDataLimite(rs.getString("data_limite"));
                trf.setStatus(rs.getString("status_tarefa"));
                retorno.add(trf);
            }
            con.close();

        } catch (SQLException | ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
        return retorno;
    }
    
//----------- INSERIR TAREFAS ------------------------------------------------------------------
    public void inserirTarefa(Tarefa trf) throws ClassNotFoundException, SQLException {
        Connection con = FabricaConexao.getConexao();
        PreparedStatement comando = con.prepareStatement("insert into sistema.tarefa (nome_tarefa, categoria, descricao, responsavel, email_responsavel, setor, data_abertura, data_limite, status_tarefa) values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
        comando.setString(1, trf.getNomeTarefa());
        comando.setString(2, trf.getCategoria());
        comando.setString(3, trf.getDescricao());
        comando.setString(4, trf.getResponsavel());
        comando.setString(5, trf.getEmailResponsavel());
        comando.setString(6, trf.getSetor());
        comando.setString(7, trf.getDataAbertura());
        comando.setString(8, trf.getDataLimite());
        comando.setString(9, trf.getStatus());
        comando.execute();
        con.close();
    }
//----------- CONSULTAR TAREFA BY ID ------------------------------------------------------------
    public Tarefa consultarById(Tarefa trf) throws SQLException, ClassNotFoundException {
        Connection con = FabricaConexao.getConexao();
        PreparedStatement comando = con.prepareStatement("select * from sistema.tarefa where id = ?");
        comando.setInt(1, trf.getId());
        ResultSet rs = comando.executeQuery();
        if (rs.next()) {
            trf.setId(rs.getInt("id"));
            trf.setNomeTarefa(rs.getString("nome_tarefa"));
            trf.setCategoria(rs.getString("categoria"));
            trf.setDescricao(rs.getString("descricao"));
            trf.setResponsavel(rs.getString("responsavel"));
            trf.setEmailResponsavel(rs.getString("email_responsavel"));
            trf.setSetor(rs.getString("setor"));
            trf.setDataAbertura(rs.getString("data_abertura"));
            trf.setDataLimite(rs.getString("data_limite"));
            trf.setStatus(rs.getString("status_tarefa"));

        }
        con.close();
        return trf;

    }
//----------- DELETAR TAREFA ---------------------------------------------------------------------
    public boolean deletar(Tarefa trf) throws SQLException, ClassNotFoundException {
        Connection con = FabricaConexao.getConexao();
        PreparedStatement comando = con.prepareStatement("delete from sistema.tarefa where id = (?)");
        boolean retorno = false;

        comando.setInt(1, trf.getId());
        comando.execute();
        con.close();
        return retorno;
    }
    // METODO ABAIXO É CONTROLE PARA O DELETAR
    
//---------- ATUALIZAR STATUS BY ID --------------------------------------------------------------     
    public void atualizar(Tarefa trf) throws SQLException, ClassNotFoundException {
    Connection con = FabricaConexao.getConexao();
    PreparedStatement comando = con.prepareStatement("update sistema.tarefa set status_tarefa = (?) where id = (?)");
    
    comando.setString(1, trf.getStatus()); // Corrigido: primeiro parâmetro é uma String
    comando.setInt(2, trf.getId()); // Corrigido: segundo parâmetro é um int
    comando.executeUpdate(); // Corrigido: executeUpdate() para executar uma atualização
    
    con.close();
    }

}
