package com.devstarrk.dslist.dto;

import com.devstarrk.dslist.entities.GameList;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;
@Getter
@Setter
@NoArgsConstructor
public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO(GameList entity){
        BeanUtils.copyProperties(entity, this);
    }
}
