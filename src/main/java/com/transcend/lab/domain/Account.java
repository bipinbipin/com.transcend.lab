package com.transcend.lab.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Profile;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Profile("middle")
public class Account {

    @Id
    @GeneratedValue
    private Long id;

    private String owner;
    private Integer balance;

}
