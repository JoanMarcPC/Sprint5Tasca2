package cat.itacademy.barcelonactiva.PedroCasulla.JoanMarc.s05.t02.S05T02PedroCasullaJoanMarc.service;

import cat.itacademy.barcelonactiva.PedroCasulla.JoanMarc.s05.t02.S05T02PedroCasullaJoanMarc.domain.Throw;
import cat.itacademy.barcelonactiva.PedroCasulla.JoanMarc.s05.t02.S05T02PedroCasullaJoanMarc.domain.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
public interface ThrowService {
    Iterable<Throw> findAll();
    Iterable<Throw> findAllByUser_id(long id);

    Throw add(User user);


    void deleteAllByUser_id(long id);

    boolean existsByUser_id(long id);

    int countByUser_id(long id);
}
