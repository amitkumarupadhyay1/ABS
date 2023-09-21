package awadh.bakery.models;

import org.springframework.data.jpa.repository.JpaRepository;

public interface orderRepository extends JpaRepository<order, Long> {
}
