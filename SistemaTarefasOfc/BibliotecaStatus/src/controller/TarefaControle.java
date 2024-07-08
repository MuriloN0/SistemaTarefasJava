/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.SQLException;
import java.util.List;
import tarefa.Tarefa;
import tarefaDAO.TarefaDAO;
import static tarefaDAO.TarefaDAO.listarTodos;

/**
 *
 * @author muril
 */
public class TarefaControle {
   
    public static List<Object[]> obterTodos() throws SQLException, ClassNotFoundException {
        List<Object[]> retorno = new java.util.ArrayList<>();
        List<Tarefa> tarefas = listarTodos();
        for (Tarefa trf : tarefas) {
            retorno.add(new Object[]{trf.getId(), trf.getNomeTarefa(), trf.getResponsavel(), trf.getDataAbertura(), trf.getDataLimite(), trf.getStatus()});
        }
        return retorno;
    }
    
     public static void deletarId(String [] dados) throws SQLException, ClassNotFoundException{
       int id = Integer.parseInt(dados[0]);
       Tarefa trf = new Tarefa();
       trf.setId(id);
       TarefaDAO trfDao = new TarefaDAO();
       trfDao.deletar(trf);
    }
     
}
