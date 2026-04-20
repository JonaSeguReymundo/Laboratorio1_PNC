package com.example.laboratorio1.services;

import com.example.laboratorio1.domain.entities.Pokemon;
import com.example.laboratorio1.repositories.PokemonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor // Genera el constructor para los campos 'final'
public class PokemonService {

    private final PokemonRepository repository;

    public List<Pokemon> filtrarPorTipo(String tipo) {
        return repository.findAll().stream()
                .filter(p -> p.getTipo().equalsIgnoreCase(tipo))
                .collect(Collectors.toList());
    }

    public List<Pokemon> filtrarPorZona(String zona) {
        return repository.findAll().stream()
                .filter(p -> p.getZonas().stream().anyMatch(z -> z.equalsIgnoreCase(zona)))
                .collect(Collectors.toList());
    }

    public List<Pokemon> filtrarPorDebilidad(String debilidad) {
        return repository.findAll().stream()
                .filter(p -> p.getDebilidades().stream().anyMatch(d -> d.equalsIgnoreCase(debilidad)))
                .collect(Collectors.toList());
    }
}