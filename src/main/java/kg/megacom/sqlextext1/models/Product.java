package kg.megacom.sqlextext1.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table
public class Product {

    @Id
            @Column(length = 50)
    String model;
    @Column(length = 50)
    String maker;
    @Column(length = 50)
    String type;
}
