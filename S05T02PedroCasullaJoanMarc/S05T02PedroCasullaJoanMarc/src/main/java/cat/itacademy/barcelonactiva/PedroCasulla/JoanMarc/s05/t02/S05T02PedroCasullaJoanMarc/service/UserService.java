package cat.itacademy.barcelonactiva.PedroCasulla.JoanMarc.s05.t02.S05T02PedroCasullaJoanMarc.service;

import cat.itacademy.barcelonactiva.PedroCasulla.JoanMarc.s05.t02.S05T02PedroCasullaJoanMarc.domain.User;
import cat.itacademy.barcelonactiva.PedroCasulla.JoanMarc.s05.t02.S05T02PedroCasullaJoanMarc.dto.UserDTO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Transactional
public interface UserService {
    Iterable<UserDTO> findAll();

    Optional<UserDTO> findById(long Id);

    Optional<UserDTO> add(User user);

    void deleteById(long id);

    Optional<UserDTO> updateById(long id,User user);

    boolean existByName(String name);
     UserDTO EntityToDTO(User entity);
     User DTOtoEntity (UserDTO dto);

     boolean existsById(long id);

}
