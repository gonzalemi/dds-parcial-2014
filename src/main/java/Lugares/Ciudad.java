package Lugares;

import javax.persistence.Entity;

@Entity
public class Ciudad extends Lugar {
    Integer cantidadDeComercios;
    Integer cantidadDeSantuarios;
    Double tasaDeMortalidad;
}
