package com.backend.House;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import org.hibernate.Length;

import java.util.List;

@Data
@Embeddable

public class FarmHouse {
    private String title;
    @Column(length = 1000)
    private List<String> images;

    private  String description;
    private  Long id ;


}
