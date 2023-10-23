package com.example.Netmoi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection ="petstore")
public class Pet {
    @Id
    private Integer id ;
    private String name ;
    private String photoUrl;
    private String category;
    private String status;
}
