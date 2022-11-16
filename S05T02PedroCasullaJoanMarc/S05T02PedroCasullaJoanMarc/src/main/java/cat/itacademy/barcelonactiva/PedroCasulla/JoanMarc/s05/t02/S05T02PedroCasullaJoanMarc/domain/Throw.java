package cat.itacademy.barcelonactiva.PedroCasulla.JoanMarc.s05.t02.S05T02PedroCasullaJoanMarc.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

@Data
@Entity
@Table(name = "Throws")
@NoArgsConstructor
public class Throw {

    @Id //define primary key
    @GeneratedValue(strategy = GenerationType.AUTO) // per definir com es tractarà la primary key
    private long id;

    @Column(name = "dice1")
    private int dice1;

    @Column(name = "dice2")
    private int dice2;

    @Column(name = "win")
    private boolean win;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    @ToString.Exclude
    private User user;

    public Throw(User user) {
        this.user = user;
        this.dice1 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
        this.dice2 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
        if (dice1 + dice2 == 7) {
            this.win = true;
        }else{
            this.win = false;
        }
    }

}
