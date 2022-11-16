package cat.itacademy.barcelonactiva.PedroCasulla.JoanMarc.s05.t02.S05T02PedroCasullaJoanMarc.service;

import cat.itacademy.barcelonactiva.PedroCasulla.JoanMarc.s05.t02.S05T02PedroCasullaJoanMarc.domain.Throw;
import cat.itacademy.barcelonactiva.PedroCasulla.JoanMarc.s05.t02.S05T02PedroCasullaJoanMarc.domain.User;
import cat.itacademy.barcelonactiva.PedroCasulla.JoanMarc.s05.t02.S05T02PedroCasullaJoanMarc.repository.ThrowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service

public class ThrowServiceImp implements ThrowService {

    @Autowired
    ThrowRepository throwRepository;

    @Override
    public List<Throw> findAll() {
        return throwRepository.findAll();
    }

    @Override
    public List<Throw> findAllByUser_id(long id) {
        return throwRepository.findAllByUser_id(id);
    }

    @Override
    public Throw add(User user) {
        return throwRepository.save(new Throw (user));
    }

    @Override
    public void deleteAllByUser_id(long id) {
        throwRepository.deleteAllByUser_id(id);
    }

    @Override

    public boolean existsByUser_id(long id) {
       return throwRepository.existsByUser_id(id);
    }

    @Override
    public int countByUser_id(long id) {
        return throwRepository.countByUser_id(id);
    }


}
