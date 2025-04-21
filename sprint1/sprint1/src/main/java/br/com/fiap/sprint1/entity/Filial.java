package br.com.fiap.sprint1.entity;


import jakarta.persistence.*;

@Entity
@Table(name="TB_FILIAL")
@SequenceGenerator(name="filial", sequenceName = "tb_filial_id_filial_seq", allocationSize = 1)
public class Filial {
    @Id
    @Column(name = "id_filial")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "filial")
    protected int id;

    @Column(name = "nome_filial", length = 255, nullable = false)
    protected String nome;

    @Column(name = "pais_filial", length = 50, nullable = false)
    protected String pais;

    @Column(name = "estado_filial", length = 50, nullable = false)
    protected String estado;

    @Column(name = "cidade_filial", length = 50, nullable = false)
    protected String cidade;

    @Column(name = "rua_filial", length = 255, nullable = false)
    protected String rua;

    @Column(name = "numero_filial", length = 10, nullable = false)
    protected int numero;

    public Filial(){
    }

    public Filial(int id, String nome, String pais, String estado, String cidade, String rua, int numero) {
        this.id = id;
        this.nome = nome;
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
