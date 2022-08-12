package kg.megacom.sqlextext1.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "pc")
public class Pc {

    @Id
    Integer code;

    @ManyToOne
    @JoinColumn(name="model")

    Product product;
    @Column(length = 50)
    Integer speed;
    @Column(length = 50)
    Integer ram;
    @Column(length = 50)
    double hd;
    @Column(length = 50)
    String cd;
    @Column(length = 50)
    double price;


}
