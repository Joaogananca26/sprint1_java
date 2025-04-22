package br.com.fiap.sprint1.entity;


import jakarta.persistence.*;

@Entity
@Table(name="TB_FILIAL")
@SequenceGenerator(name="filial", sequenceName = "tb_filial_id_filial_seq", allocationSize = 1)
public class Filial {
    @Id
    @Column(name = "id_filial")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "filial")
    protected int idFilial;

    @Column(name = "nome_filial", length = 255, nullable = false)
    protected String nomeFilial;

    @Column(name = "pais_filial", length = 50, nullable = false)
    protected String paisFilial;

    @Column(name = "estado_filial", length = 50, nullable = false)
    protected String estadoFilial;

    @Column(name = "cidade_filial", length = 50, nullable = false)
    protected String cidadeFilial;

    @Column(name = "rua_filial", length = 255, nullable = false)
    protected String ruaFilial;

    @Column(name = "bairro_filial", length = 50, nullable = false)
    protected String bairroFilial;

    @Column(name = "numero_filial", length = 10, nullable = false)
    protected int numeroFilial;

    @Column(name = "telefone_filial", length = 13, nullable = false)
    protected String telefoneFilial;

    public Filial(){
    }

    public Filial(int idFilial, String nomeFilial, String paisFilial, String estadoFilial, String cidadeFilial, String ruaFilial, int numeroFilial, String bairroFilial, String telefoneFilial) {
        this.idFilial = idFilial;
        this.nomeFilial = nomeFilial;
        this.paisFilial = paisFilial;
        this.estadoFilial = estadoFilial;
        this.cidadeFilial = cidadeFilial;
        this.ruaFilial = ruaFilial;
        this.numeroFilial = numeroFilial;
        this.bairroFilial = bairroFilial;
        this.telefoneFilial = telefoneFilial;
    }


    public int getIdFilial() {
        return idFilial;
    }

    public void setIdFilial(int idFilial) {
        this.idFilial = idFilial;
    }

    public String getNomeFilial() {
        return nomeFilial;
    }

    public void setNomeFilial(String nomeFilial) {
        this.nomeFilial = nomeFilial;
    }

    public String getPaisFilial() {
        return paisFilial;
    }

    public void setPaisFilial(String paisFilial) {
        this.paisFilial = paisFilial;
    }

    public String getEstadoFilial() {
        return estadoFilial;
    }

    public void setEstadoFilial(String estadoFilial) {
        this.estadoFilial = estadoFilial;
    }

    public String getCidadeFilial() {
        return cidadeFilial;
    }

    public void setCidadeFilial(String cidadeFilial) {
        this.cidadeFilial = cidadeFilial;
    }

    public String getRuaFilial() {
        return ruaFilial;
    }

    public void setRuaFilial(String ruaFilial) {
        this.ruaFilial = ruaFilial;
    }

    public String getBairroFilial() {
        return bairroFilial;
    }

    public void setBairroFilial(String bairroFilial) {
        this.bairroFilial = bairroFilial;
    }

    public int getNumeroFilial() {
        return numeroFilial;
    }

    public void setNumeroFilial(int numeroFilial) {
        this.numeroFilial = numeroFilial;
    }

    public String getTelefoneFilial() {
        return telefoneFilial;
    }

    public void setTelefoneFilial(String telefoneFilial) {
        this.telefoneFilial = telefoneFilial;
    }
}
