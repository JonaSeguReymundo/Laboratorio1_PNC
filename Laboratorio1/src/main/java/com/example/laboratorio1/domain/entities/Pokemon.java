package com.example.laboratorio1.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pokemon {
    private String nombre;
    private String tipo;
    private List<String> debilidades;
    private List<String> zonas;
    private String region;

    // Personalizamos el toString para cumplir con el requisito del tag [PKMN]
    @Override
    public String toString() {
        return String.format("[PKMN] Nombre: %s | Tipo: %s | Debilidades: %s",
                nombre, tipo, String.join(", ", debilidades));
    }
}