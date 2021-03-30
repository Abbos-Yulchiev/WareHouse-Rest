package uz.pdp.appapiwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appapiwarehouse.entity.Output;


@RepositoryRestResource(path = "output")
public interface OutputRepository extends JpaRepository<Output, Integer> {
}
