package br.com.fiap.sprint1.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_usuario")
@SequenceGenerator(name = "usuario", sequenceName = "tb_usuario_id_usuario_seq", allocationSize = 1)
public class Usuario {
    @Id
    @Column(name = "id_usuario")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario")
    protected int id;
}
