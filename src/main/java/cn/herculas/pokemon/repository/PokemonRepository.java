package cn.herculas.pokemon.repository;

import cn.herculas.pokemon.data.DO.Pokemon;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {
    Optional<Pokemon> findPokemonByPokemonId(Integer pokemonId);
    Optional<Pokemon> findPokemonByPokemonIdentifier(String pokemonIdentifier);
}
