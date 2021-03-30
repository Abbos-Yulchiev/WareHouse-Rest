package uz.pdp.appapiwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appapiwarehouse.entity.Measurement;

@RepositoryRestResource(path = "measurement")
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {

    boolean existsByName(String name);

}
