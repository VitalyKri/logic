package com.seflaccounting.mainaccount.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "operation")
@Setter
@Getter
@NoArgsConstructor
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "operation_type")
    private String operationType;

    @Column(name = "current")
    private String current;

    @Column(name = "instrument_type")
    private String instrumentType;

    @Column(name = "price")
    private double price;

    @Column(name = "count")
    private int count;

    @Column(name = "payment")
    private int payment;

    @Column(name = "ticker")
    private String ticker;
}
