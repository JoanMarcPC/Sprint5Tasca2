package cat.itacademy.barcelonactiva.PedroCasulla.JoanMarc.s05.t02.S05T02PedroCasullaJoanMarc.service;

import cat.itacademy.barcelonactiva.PedroCasulla.JoanMarc.s05.t02.S05T02PedroCasullaJoanMarc.domain.Throw;

import java.util.Optional;

public interface ThrowService {
    Iterable<Throw> findAll();

    Optional<Throw> findById(Long Id);

    Throw add(Throw _throw);

    void deleteById(Long id);

    Throw updateById(Long id,Throw _throw);

}
