package com.pokemonreview.api.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "pokemons")
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    private Integer height;
    private Integer weight;
    private String imageUrl;

    public Pokemon(String name, String type, Integer height, Integer weight, String imageUrl) {
        this.name = name;
        this.type = type;
        this.height = height;
        this.weight = weight;
        this.imageUrl = imageUrl;
    }
}
