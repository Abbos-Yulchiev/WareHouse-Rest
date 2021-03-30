package uz.pdp.appapiwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appapiwarehouse.entity.OutputProduct;
import uz.pdp.appapiwarehouse.projection.CustomOutputProduct;

@RepositoryRestResource(path = "outputProduct", collectionResourceRel = "list", excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {
}
