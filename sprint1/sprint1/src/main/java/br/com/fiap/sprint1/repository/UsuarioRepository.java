package br.com.fiap.sprint1.repository;

import br.com.fiap.sprint1.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    void deleteAllById(int id);
}
