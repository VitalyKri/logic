package com.seflaccounting.mainaccount.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "instrument")
@Setter
@Getter
@NoArgsConstructor
public class Instrument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "figi")
    private String figi;

    @Column(name = "ticker")
    String ticker;

    @Column(name = "class_code")
    String class_code;

    @Column(name = "sector")
    String sector;

}
