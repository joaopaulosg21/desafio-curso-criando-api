package br.com.alura.desafio.service;

import br.com.alura.desafio.dto.FraseDTO;
import br.com.alura.desafio.model.Frase;
import br.com.alura.desafio.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repositorio;

    public FraseDTO obterFrase() {
        Frase frase = repositorio.obterFrase();

        return new FraseDTO(frase.getFrase(),frase.getPersonagem(),frase.getTitulo(),frase.getPoster());
    }
}
