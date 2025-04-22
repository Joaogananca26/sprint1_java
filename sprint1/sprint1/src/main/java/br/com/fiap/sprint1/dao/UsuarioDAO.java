package br.com.fiap.sprint1.dao;

import br.com.fiap.sprint1.entity.Usuario;
import br.com.fiap.sprint1.exception.CommitException;
import br.com.fiap.sprint1.exception.UsuarioNaoEncotradoException;

public interface UsuarioDAO {
    public void cadastrarUsuario(Usuario usuario);

    public void removerUsuario(int id) throws UsuarioNaoEncotradoException;

    public void atualizarUsuario(Usuario usuario) throws UsuarioNaoEncotradoException;

    Usuario buscarUsuario(int id) throws UsuarioNaoEncotradoException;

    void commit() throws CommitException;
}
