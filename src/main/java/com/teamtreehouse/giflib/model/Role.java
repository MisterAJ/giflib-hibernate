package com.teamtreehouse.giflib.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private byte[] bytes;
    private String description;

    @ManyToOne
    private Collaborator collaborator;

    public Role(){}
}
