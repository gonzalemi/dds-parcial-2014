import Lugares.Lugar;

import javax.persistence.*;

@Entity
public class Casa {

    @Id
    @GeneratedValue
    private Long id;

    String nombre;
    Integer patrimonio;
    Integer anioFundacion;
    @ManyToOne
    @JoinColumn(name = "casa_id")
    Lugar origen;

    //@ManyToOne
    //@JoinColumn(name = "id")
    //Casa matriz; //relacion vallasaDe
}
