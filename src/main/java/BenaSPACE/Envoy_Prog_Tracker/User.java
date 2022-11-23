package BenaSPACE.Envoy_Prog_Tracker;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity public class User {
    @Id
    private int id;

    private String username;
    private String password;
}
