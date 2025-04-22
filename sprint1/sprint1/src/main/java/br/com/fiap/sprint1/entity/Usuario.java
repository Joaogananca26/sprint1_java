package br.com.fiap.sprint1.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "TB_usuario")
@SequenceGenerator(name = "usuario", sequenceName = "tb_usuario_id_usuario_seq", allocationSize = 1)
public class Usuario {
    @Id
    @Column(name = "id_usuario")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario")
    protected int id;

    @Column(name = "nome_usuario", length = 100, nullable = false)
    protected String nomeUsuario;

    @Column(name = "dt_nascimento_usuario", nullable = false)
    protected Date dataNascimentoUsuario;

    @Column(name = "cpf_usuario", length = 11, nullable = false)
    protected String cpfUsuario;

    @Column(name = "telefone_usuario", length = 13, nullable = false)
    protected String telefoneUsuario;

    @Column(name = "email_usuario", length = 255, nullable = false)
    protected String emailUsuario;

    @Column(name = "senha_usuario", length = 100, nullable = false)
    protected String senhaUsuario;

    public Usuario(){

    }

    public Usuario(int id, String nomeUsuario, Date dataNascimentoUsuario, String cpfUsuario, String telefoneUsuario, String emailUsuario, String senhaUsuario) {
        this.id = id;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimentoUsuario = dataNascimentoUsuario;
        this.cpfUsuario = cpfUsuario;
        this.telefoneUsuario = telefoneUsuario;
        this.emailUsuario = emailUsuario;
        this.senhaUsuario = senhaUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public Date getDataNascimentoUsuario() {
        return dataNascimentoUsuario;
    }

    public void setDataNascimentoUsuario(Date dataNascimentoUsuario) {
        this.dataNascimentoUsuario = dataNascimentoUsuario;
    }

    public String getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpfUsuario(String cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public String getTelefoneUsuario() {
        return telefoneUsuario;
    }

    public void setTelefoneUsuario(String telefoneUsuario) {
        this.telefoneUsuario = telefoneUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }
}
