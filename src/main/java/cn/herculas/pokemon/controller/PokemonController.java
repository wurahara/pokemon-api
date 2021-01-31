package cn.herculas.pokemon.controller;

import cn.herculas.pokemon.data.DO.Pokemon;
import cn.herculas.pokemon.data.VO.ResponseVO;
import cn.herculas.pokemon.service.PokemonService;
import cn.herculas.pokemon.util.wrapper.ResponseWrapper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }
    @GetMapping("/id/{id}")
    public ResponseVO<?> findPokemon(@PathVariable(value = "id") Integer pokemonId) {
        // FIXME: VO Output
        return ResponseWrapper.success(pokemonService.retrievePokemon(pokemonId));
    }

    @GetMapping("/identifier/{identifier}")
    public ResponseVO<?> findPokemon(@PathVariable(value = "identifier") String pokemonIdentifier) {
        // FIXME: VO Output
        Pokemon res = pokemonService.retrievePokemon(pokemonIdentifier);
        return ResponseWrapper.success(res);
    }
}
