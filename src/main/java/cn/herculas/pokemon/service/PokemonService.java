package cn.herculas.pokemon.service;

import cn.herculas.pokemon.data.DO.Pokemon;

public interface PokemonService {
    Pokemon retrievePokemon(Integer pokemonId);
    Pokemon retrievePokemon(String pokemonIdentifier);
}
