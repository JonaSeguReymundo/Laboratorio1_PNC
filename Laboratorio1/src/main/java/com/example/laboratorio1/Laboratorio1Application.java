package com.example.laboratorio1;

import com.example.laboratorio1.services.PokemonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Laboratorio1Application {

    public static void main(String[] args) {
        SpringApplication.run(Laboratorio1Application.class, args);
    }

    @Bean
    public CommandLineRunner run(PokemonService pokemonService) {
        return args -> {
            System.out.println("--- POKÉDEX DIGITAL DEL PROFESOR OAK ---");

            System.out.println("\n1. Pokémon filtrados por Tipo (Fuego):");
            pokemonService.filtrarPorTipo("Fuego").forEach(System.out::println);

            System.out.println("\n2. Pokémon filtrados por Zona (Bosque):");
            pokemonService.filtrarPorZona("Bosque").forEach(System.out::println);

            System.out.println("\n3. Pokémon filtrados por Debilidad (Tierra):");
            pokemonService.filtrarPorDebilidad("Tierra").forEach(System.out::println);
        };
    }

}

