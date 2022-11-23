package BenaSPACE.Envoy_Prog_Tracker;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Player {
    @Id
    private int id;

    String name;
    String apikey;

    boolean[] envoyIprog;
    boolean[] envoyIIprog;
}
