package com.seflaccounting.mainaccount.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "portfolio_position")
@Setter
@Getter
@NoArgsConstructor
public class PositionPortfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "figi")
    private String figi;

    @Column(name = "instrument_type")
    private String instrumentType;

    @Column(name = "quantity")
    private String quantity;

    @Column(name = "average_position_price")
    private double averagePositionPrice;

    @Column(name = "payment")
    private double payment;

    @Column(name = "current_price")
    private double currentPrice;

}
