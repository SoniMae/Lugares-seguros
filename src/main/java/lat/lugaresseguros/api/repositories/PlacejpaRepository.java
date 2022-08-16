package lat.lugaresseguros.api.repositories;

import lat.lugaresseguros.api.models.PlaceModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlacejpaRepository extends JpaRepository<PlaceModel, Long> {
}
