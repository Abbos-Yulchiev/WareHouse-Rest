package uz.pdp.appapiwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appapiwarehouse.entity.OutputProduct;

@RepositoryRestResource(path = "outputProduct")
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {
}
