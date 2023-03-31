package com.example.smartcity.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Cutremur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cutremurid")
    private long cutremurID;

    @Column(name = "magnitudine")
    private String magnitudine;

    @Column(name = "latitudine")
    private String latitudine;

    @Column(name = "longitudine")
    private String longitudine;

    @Column(name = "adancime")
    private int adancime;

    @Column(name = "an_cutremur")
    private int anCutremur;

    @Column(name = "luna_cutremur")
    private int lunaCutremur;

    @Column(name = "ziua_cutremur")
    private int ziuaCutremur;

    @Column(name = "ora")
    private int ora;

    @Column(name = "minut")
    private int minut;
}
