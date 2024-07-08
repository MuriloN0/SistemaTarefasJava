/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarefa;

/**
 *
 * @author muril
 */
public class Tarefa {

    private int id;
    private String nomeTarefa;
    private String categoria;
    private String descricao;
    private String responsavel;
    private String emailResponsavel;
    private String setor;
    private String dataAbertura;
    private String dataLimite;
    private String status;

    /*public Tarefa(int id, String nomeTarefa, String categoria, String descricao, String responsavel, String nomeResponsavel, String setor, String dataAbertura, String dataLimite, String status) {
        this.id = id;
        this.categoria = categoria;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.nomeResponsavel = nomeResponsavel;
        this.setor = setor;
        this.dataAbertura = dataAbertura;
        this.dataLimite = dataLimite;
        this.status = status;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getEmailResponsavel() {
        return emailResponsavel;
    }

    public void setEmailResponsavel(String nomeResponsavel) {
        this.emailResponsavel = nomeResponsavel;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(String dataLimite) {
        this.dataLimite = dataLimite;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
