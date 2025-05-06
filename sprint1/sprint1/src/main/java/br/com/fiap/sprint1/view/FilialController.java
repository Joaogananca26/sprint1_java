package br.com.fiap.sprint1.view;


import br.com.fiap.sprint1.entity.Filial;
import br.com.fiap.sprint1.repository.FilialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Filial")
public class FilialController {

    @Autowired
    private FilialRepository dao;


}
