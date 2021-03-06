package com.vorkurt.entity.transport.car.base;


import lombok.Data;

import javax.persistence.*;

@MappedSuperclass
@Data
public abstract class CarBase {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String plateNumber;

    @Column
    private String reservoirFuel;

    @Column
    private float kgPerWeight;

    @Column
    private int numberPacks;
}
