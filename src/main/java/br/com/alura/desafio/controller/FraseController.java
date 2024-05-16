package br.com.alura.desafio.controller;

import br.com.alura.desafio.dto.FraseDTO;
import br.com.alura.desafio.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class FraseController {
    @Autowired
    private FraseService servico;

    @GetMapping("/frases")
    public FraseDTO obterFrase() {
        return servico.obterFrase();
    }
}
