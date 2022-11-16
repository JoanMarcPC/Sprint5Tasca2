package cat.itacademy.barcelonactiva.PedroCasulla.JoanMarc.s05.t02.S05T02PedroCasullaJoanMarc.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDTO {

    private long id;
    private String name;
    private LocalDateTime date;
    private double success;
    @JsonIgnore
    private String pass;
}
