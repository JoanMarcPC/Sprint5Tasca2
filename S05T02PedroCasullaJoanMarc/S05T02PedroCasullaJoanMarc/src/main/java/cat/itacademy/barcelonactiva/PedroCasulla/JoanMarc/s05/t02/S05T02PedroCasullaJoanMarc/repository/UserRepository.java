package cat.itacademy.barcelonactiva.PedroCasulla.JoanMarc.s05.t02.S05T02PedroCasullaJoanMarc.repository;

import cat.itacademy.barcelonactiva.PedroCasulla.JoanMarc.s05.t02.S05T02PedroCasullaJoanMarc.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByName(String name);



}
