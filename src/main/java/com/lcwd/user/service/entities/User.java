package com.lcwd.user.service.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="micro_users")
public class User {

    @Id
    @Column(name="Id")
    private String userId;

    @Column(name="NAME" ,length=20)
    private String name;

    @Column(name="EMAIL")
    private String email;

    @Column(name="ABOUT")
    private String about;

    @Transient //don't store in db;
    private List<Rating> ratings = new ArrayList<>();
}
