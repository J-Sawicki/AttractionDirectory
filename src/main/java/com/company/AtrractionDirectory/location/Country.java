package com.company.AtrractionDirectory.location;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country extends Location {

    @Id
    private Long id;
    private String name;
}
