package uz.pdp.appapiwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appapiwarehouse.entity.Supplier;

@RepositoryRestResource(path = "supplier")
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

    boolean existsByPoneNumber(String poneNumber);
}
