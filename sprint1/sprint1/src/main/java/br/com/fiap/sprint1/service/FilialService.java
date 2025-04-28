package br.com.fiap.sprint1.service;

import br.com.fiap.sprint1.entity.Filial;
import br.com.fiap.sprint1.repository.FilialRepository;

public class FilialService {

    private FilialRepository repository;

    public void cadastrarFilial(Filial filial) {
        repository.save(filial);
    }
}
