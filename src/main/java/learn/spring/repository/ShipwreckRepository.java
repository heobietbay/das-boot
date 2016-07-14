package learn.spring.repository;

import learn.spring.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by khoa on 7/14/2016.
 */
public interface ShipwreckRepository extends JpaRepository<Shipwreck,Long> {
}
