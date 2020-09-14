import Lugares.Lugar;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Region {

    @Id
    @GeneratedValue
    private Long id;

    String nombre;
    @ManyToMany
    List<Lugar> lugares;

}
