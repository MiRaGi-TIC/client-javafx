package um.edu.uy.business.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


public class Aeropuerto {

    public String nombre;
    public String ciudad;
    public String pais;
    public String IATA_id;

    // nro puertas, nro pistas

    public Aeropuerto(String nombre, String ciudad, String pais, String IATA_id) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.IATA_id = IATA_id;
    }
}
