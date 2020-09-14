package Lugares;

import javax.persistence.*;

@Entity
@Inheritance(strategy= InheritanceType.JOINED)
public class Lugar {

    @Id
    @GeneratedValue
    private Long id;

    String nombre;
    Integer anioFundacion;
    Integer poblacion;
}
