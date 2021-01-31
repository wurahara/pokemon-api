package cn.herculas.pokemon.repository;

import cn.herculas.pokemon.data.DO.Pokemon;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PokemonRepositoryTest {

    @Autowired
    private PokemonRepository repository;

    @Test
    void findPokemonByPokemonId() {
        Pokemon pokemon = repository.findPokemonByPokemonId(1).get();
        System.out.println(pokemon);
    }
}