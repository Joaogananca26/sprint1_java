package br.com.fiap.sprint1.dao;

import br.com.fiap.sprint1.entity.Usuario;
import br.com.fiap.sprint1.exception.UsuarioNaoEncotradoException;

public interface UsuarioDAO {
    public void cadastrarUsuario(Usuario usuario) throws UsuarioNaoEncotradoException;

    public void removerFuncionario(Usuario usuario) throws UsuarioNaoEncotradoException;


}
