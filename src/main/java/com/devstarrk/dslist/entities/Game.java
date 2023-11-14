package com.devstarrk.dslist.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb-game")
public class Game {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(name = "game-year")
    private Integer year;
    private String genre;
    private String platform;
    private String imgUrl;
    private Double score;
    private String shortDescription;
    private String longDescription;

}
