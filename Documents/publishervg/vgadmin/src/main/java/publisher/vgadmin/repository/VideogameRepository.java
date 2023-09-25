package publisher.vgadmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import publisher.vgadmin.model.Videogame;

@Repository
public interface VideogameRepository extends JpaRepository<Videogame, Long> {

}
