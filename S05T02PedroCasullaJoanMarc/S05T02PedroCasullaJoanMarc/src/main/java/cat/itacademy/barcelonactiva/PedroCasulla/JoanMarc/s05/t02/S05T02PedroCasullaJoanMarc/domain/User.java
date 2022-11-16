package cat.itacademy.barcelonactiva.PedroCasulla.JoanMarc.s05.t02.S05T02PedroCasullaJoanMarc.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Users")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", unique = false, nullable = false)
    private String name;

    @Column(name = "date", updatable = false)
    private LocalDateTime date;

    @Column(name = "success", nullable = true)
    private double success ;

    @Column(name = "pass",nullable = false)
    private String pass;

    public User (String name, String pass){
        this.name = name;
        this.pass = pass;
        this.date = LocalDateTime.now();
    }


}
