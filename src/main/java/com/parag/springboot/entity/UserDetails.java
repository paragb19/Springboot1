package com.parag.springboot.entity;

import lombok.*;

import javax.persistence.*;

    @Builder
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    @Table(name = "user_details")
    public class UserDetails {
        @Id
        @Column
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        @Column(name = "first_name")
        private String firstName;
        @Column(name = "last_name")
        private String lastName;
        @Column
        private String email;
        @Column
        private String password;

    }

