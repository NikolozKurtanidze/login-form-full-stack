package com.login.loginback.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "pwd")
    private String pwd;
}
