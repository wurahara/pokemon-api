package cn.herculas.pokemon.data.DO;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Pokemon {
    @Id
    private Integer pokemonId;
    private String pokemonIdentifier;
    private Integer speciesId;
    private Integer pokemonHeight;
    private Integer pokemonWeight;
    private Integer baseExperience;
    private Integer sortOrder;
    private Integer isDefault;
}
