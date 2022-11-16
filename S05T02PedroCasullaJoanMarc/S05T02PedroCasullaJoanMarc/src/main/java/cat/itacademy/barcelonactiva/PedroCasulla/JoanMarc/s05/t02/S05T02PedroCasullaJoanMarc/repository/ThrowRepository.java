package cat.itacademy.barcelonactiva.PedroCasulla.JoanMarc.s05.t02.S05T02PedroCasullaJoanMarc.repository;

import cat.itacademy.barcelonactiva.PedroCasulla.JoanMarc.s05.t02.S05T02PedroCasullaJoanMarc.domain.Throw;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ThrowRepository extends JpaRepository <Throw,Long> {
    List<Throw> findAllByUser_id(long id);
    void deleteAllByUser_id(long id);

    boolean existsByUser_id(long id);

    int countByUser_id(long id);
}
