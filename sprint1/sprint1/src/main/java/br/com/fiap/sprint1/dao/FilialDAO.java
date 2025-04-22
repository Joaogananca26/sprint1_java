package br.com.fiap.sprint1.dao;

import br.com.fiap.sprint1.entity.Filial;
import br.com.fiap.sprint1.exception.CommitException;
import br.com.fiap.sprint1.exception.FilialNaoEncontradaException;

public interface FilialDAO {

    public void adicionarFilial(Filial filial);

    public void atualizarFilial(Filial filial) throws FilialNaoEncontradaException;

    public void removerFilial(int id) throws FilialNaoEncontradaException;

    Filial buscarFilial(int id) throws FilialNaoEncontradaException;

    void commit() throws CommitException;
}
