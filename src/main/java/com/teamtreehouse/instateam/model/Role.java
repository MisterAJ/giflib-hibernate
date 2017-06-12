package com.teamtreehouse.instateam.model;

import javax.persistence.*;

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

    public Role(String description) {
        this.description = description;
    }
}
