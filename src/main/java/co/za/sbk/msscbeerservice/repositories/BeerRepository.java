package co.za.sbk.msscbeerservice.repositories;

import co.za.sbk.msscbeerservice.domain.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * @author Thato Seboko on 2021/02/04
 */
public interface BeerRepository extends JpaRepository<Beer, UUID> {
}
