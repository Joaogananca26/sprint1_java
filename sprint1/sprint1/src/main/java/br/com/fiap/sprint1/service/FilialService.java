package br.com.fiap.sprint1.service;

import br.com.fiap.sprint1.entity.Filial;
import br.com.fiap.sprint1.repository.FilialRepository;

import java.util.List;

public class FilialService {

    private FilialRepository repository;

    public void cadastrarFilial(Filial filial) {
        repository.save(filial);
    }

    public void atualizarFilial(Filial filial){
        repository.save(filial);
    }

    public List<Filial> listarFiliais(){
        return repository.findAll();
    }

    public void deletarFilial(int id){
        repository.deleteAllById(id);
    }
}
