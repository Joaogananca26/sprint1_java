package br.com.fiap.sprint1.service;

import br.com.fiap.sprint1.entity.Usuario;
import br.com.fiap.sprint1.repository.UsuarioRepository;

public class UsuarioService {

    private UsuarioRepository repository;

    public void cadastrarUsuario(Usuario usuario) {
        repository.save(usuario);
    }
}
