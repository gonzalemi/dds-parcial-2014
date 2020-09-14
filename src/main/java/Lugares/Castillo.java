package Lugares;

import javax.persistence.Entity;

@Entity
public class Castillo extends Lugar {
    Integer cantidadTorres;
    Integer cantidadMurallas;
}
