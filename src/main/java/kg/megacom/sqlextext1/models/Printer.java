package kg.megacom.sqlextext1.models;

import com.sun.istack.NotNull;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "printer")
public class Printer {

    @Id
    Integer code;
    char color;
    String type;
    //@NotNull
    double price;

    @ManyToOne
    @JoinColumn(name="model")
    Product product;
}
