package com.example.CustomerProduct.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    @ElementCollection(fetch = FetchType.EAGER) // Eagerly load the collection
    private Set<String> emails;

    @ElementCollection(fetch = FetchType.EAGER) // Eagerly load the collection
    private Set<String> familyMembers;
}
