package br.com.fiap.sprint1.service;

import br.com.fiap.sprint1.entity.Filial;
import br.com.fiap.sprint1.entity.Usuario;
import br.com.fiap.sprint1.repository.UsuarioRepository;

import java.util.List;

public class UsuarioService {

    private UsuarioRepository repository;

    public void cadastrarUsuario(Usuario usuario) {
        repository.save(usuario);
    }

    public void atualizarUsuario(Usuario usuario){
        repository.save(usuario);
    }

    public List<Usuario> listarUsuarios(){
        return repository.findAll();
    }

    public void deletarUsuario(int id){
        repository.deleteAllById(id);
    }
}
