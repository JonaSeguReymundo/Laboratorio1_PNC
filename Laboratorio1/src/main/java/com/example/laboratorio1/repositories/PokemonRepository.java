package com.example.laboratorio1.repositories;

import com.example.laboratorio1.domain.entities.Pokemon;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PokemonRepository {
    private final List<Pokemon> pokedex = new ArrayList<>();

    public PokemonRepository() {
        pokedex.add(Pokemon.builder()
                .nombre("Charmander")
                .tipo("Fuego")
                .debilidades(List.of("Agua", "Roca", "Tierra"))
                .zonas(List.of("Montaña"))
                .region("Kanto")
                .build());

        pokedex.add(Pokemon.builder()
                .nombre("Pikachu")
                .tipo("Eléctrico")
                .debilidades(List.of("Tierra"))
                .zonas(List.of("Bosque"))
                .region("Kanto")
                .build());

        pokedex.add(Pokemon.builder()
                .nombre("Bulbasaur")
                .tipo("Planta")
                .debilidades(List.of("Fuego", "Hielo", "Volador", "Psíquico"))
                .zonas(List.of("Bosque", "Pradera"))
                .region("Kanto")
                .build());

        pokedex.add(Pokemon.builder()
                .nombre("Squirtle")
                .tipo("Agua")
                .debilidades(List.of("Planta", "Eléctrico"))
                .zonas(List.of("Lago", "Mar"))
                .region("Kanto")
                .build());
    }

    public List<Pokemon> findAll() {
        return pokedex;
    }
}