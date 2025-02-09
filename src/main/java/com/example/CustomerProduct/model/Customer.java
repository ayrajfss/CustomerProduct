package com.example.CustomerProduct.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    @ElementCollection
    private List<String> emails;

    @ElementCollection
    private List<String> familyMembers;
}
