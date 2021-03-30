package uz.pdp.appapiwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appapiwarehouse.entity.Product;

@RepositoryRestResource(path = "product")
public interface ProductRepository extends JpaRepository<Product, Integer> {

    boolean existsByNameAndCategoryId(String name, Integer category_id);

    @Query(value = "select max (id) from product", nativeQuery = true)
    Integer maxProductId();
}
