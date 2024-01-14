package com.pokemonreview.api.utils;

import com.pokemonreview.api.models.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class PokemonVO {

    public List<Pokemon> getPokemonList () {
        List<Pokemon> pokemonList = new ArrayList<>();
        // Create and add Pokemon objects to the list
        pokemonList.add(new Pokemon("Bulbasaur", "Grass, Poison", 7, 69, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png"));
        pokemonList.add(new Pokemon("Ivysaur", "Grass, Poison", 10, 130, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/2.png"));
        pokemonList.add(new Pokemon("Venusaur", "Grass, Poison", 20, 1000, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/3.png"));
        pokemonList.add(new Pokemon("Charmander", "Fire", 6, 85, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/4.png"));
        pokemonList.add(new Pokemon("Charmeleon", "Fire", 11, 190, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/5.png"));
        pokemonList.add(new Pokemon("Charizard", "Fire, Flying", 17, 905, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/6.png"));
        pokemonList.add(new Pokemon("Squirtle", "Water", 5, 90, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/7.png"));
        pokemonList.add(new Pokemon("Wartortle", "Water", 10, 225, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/8.png"));
        pokemonList.add(new Pokemon("Blastoise", "Water", 16, 855, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/9.png"));

        pokemonList.add(new Pokemon("Metapod", "Bug", 7, 99, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/11.png"));
        pokemonList.add(new Pokemon("Butterfree", "Bug, Flying", 11, 320, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/12.png"));
        pokemonList.add(new Pokemon("Weedle", "Bug, Poison", 3, 32, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/13.png"));
        pokemonList.add(new Pokemon("Kakuna", "Bug, Poison", 6, 100, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/14.png"));
        pokemonList.add(new Pokemon("Beedrill", "Bug, Poison", 10, 295, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/15.png"));
        pokemonList.add(new Pokemon("Pidgey", "Normal, Flying", 3, 18, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/16.png"));
        pokemonList.add(new Pokemon("Pidgeotto", "Normal, Flying", 11, 300, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/17.png"));
        pokemonList.add(new Pokemon("Pidgeot", "Normal, Flying", 15, 395, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/18.png"));
        pokemonList.add(new Pokemon("Rattata", "Normal", 3, 35, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/19.png"));
        pokemonList.add(new Pokemon("Raticate", "Normal", 7, 185, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/20.png"));

        pokemonList.add(new Pokemon("Spearow", "Normal, Flying", 3, 20, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/21.png"));
        pokemonList.add(new Pokemon("Fearow", "Normal, Flying", 12, 380, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/22.png"));
        pokemonList.add(new Pokemon("Ekans", "Poison", 20, 69, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/23.png"));
        pokemonList.add(new Pokemon("Arbok", "Poison", 35, 650, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/24.png"));
        pokemonList.add(new Pokemon("Pikachu", "Electric", 4, 60, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/25.png"));
        pokemonList.add(new Pokemon("Raichu", "Electric", 8, 300, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/26.png"));
        pokemonList.add(new Pokemon("Sandshrew", "Ground", 6, 120, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/27.png"));
        pokemonList.add(new Pokemon("Sandslash", "Ground", 10, 295, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/28.png"));
        pokemonList.add(new Pokemon("Nidoran-f", "Poison", 4, 70, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/29.png"));
        pokemonList.add(new Pokemon("Nidorina", "Poison", 8, 200, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/30.png"));


        pokemonList.add(new Pokemon("Nidoqueen", "Poison, Ground", 13, 600, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/31.png"));
        pokemonList.add(new Pokemon("Nidoran-m", "Poison", 5, 90, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/32.png"));
        pokemonList.add(new Pokemon("Nidorino", "Poison", 9, 195, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/33.png"));
        pokemonList.add(new Pokemon("Nidoking", "Poison, Ground", 14, 620, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/34.png"));
        pokemonList.add(new Pokemon("Clefairy", "Fairy", 6, 75, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/35.png"));
        pokemonList.add(new Pokemon("Clefable", "Fairy", 13, 400, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/36.png"));
        pokemonList.add(new Pokemon("Vulpix", "Fire", 6, 99, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/37.png"));
        pokemonList.add(new Pokemon("Ninetales", "Fire", 11, 199, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/38.png"));
        pokemonList.add(new Pokemon("Jigglypuff", "Normal, Fairy", 5, 55, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/39.png"));
        pokemonList.add(new Pokemon("Wigglytuff", "Normal, Fairy", 10, 120, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/40.png"));

        pokemonList.add(new Pokemon("Zubat", "Poison, Flying", 8, 75, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/41.png"));
        pokemonList.add(new Pokemon("Golbat", "Poison, Flying", 16, 550, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/42.png"));
        pokemonList.add(new Pokemon("Oddish", "Grass, Poison", 5, 54, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/43.png"));
        pokemonList.add(new Pokemon("Gloom", "Grass, Poison", 8, 86, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/44.png"));
        pokemonList.add(new Pokemon("Vileplume", "Grass, Poison", 12, 186, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/45.png"));
        pokemonList.add(new Pokemon("Paras", "Bug, Grass", 3, 54, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/46.png"));
        pokemonList.add(new Pokemon("Parasect", "Bug, Grass", 10, 295, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/47.png"));
        pokemonList.add(new Pokemon("Venonat", "Bug, Poison", 10, 300, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/48.png"));
        pokemonList.add(new Pokemon("Venomoth", "Bug, Poison", 15, 125, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/49.png"));
        pokemonList.add(new Pokemon("Diglett", "Ground", 2, 8, "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/50.png"));

        return pokemonList;
    }

}
