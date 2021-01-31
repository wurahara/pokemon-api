package cn.herculas.pokemon.service.implement;

import cn.herculas.pokemon.data.DO.Pokemon;
import cn.herculas.pokemon.enumeration.ExceptionEnum;
import cn.herculas.pokemon.exception.BusinessException;
import cn.herculas.pokemon.repository.PokemonRepository;
import cn.herculas.pokemon.service.PokemonService;

import org.springframework.stereotype.Service;

@Service
public class PokemonServiceImpl implements PokemonService {

    private final PokemonRepository pokemonRepository;

    public PokemonServiceImpl(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    @Override
    public Pokemon retrievePokemon(Integer pokemonId) {
        return pokemonRepository
                .findPokemonByPokemonId(pokemonId)
                .orElseThrow(() -> new BusinessException(ExceptionEnum.POKEMON_NOT_EXIST));
    }

    @Override
    public Pokemon retrievePokemon(String pokemonIdentifier) {
        return pokemonRepository
                .findPokemonByPokemonIdentifier(pokemonIdentifier)
                .orElseThrow(() -> new BusinessException(ExceptionEnum.POKEMON_NOT_EXIST));
    }
}
