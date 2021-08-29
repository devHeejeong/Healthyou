package com.project.healthyou.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@EqualsAndHashCode(of = "id")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cid;

    @Column(name = "first_name", length = 10, nullable = false)
    private String firstName;

    private String lastName;

    private String birth;

    private String email;

    private LocalDate createdAt;

    private String phone;

    private String
}
