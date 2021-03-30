package uz.pdp.appapiwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appapiwarehouse.entity.Warehouse;
import uz.pdp.appapiwarehouse.projection.CustomWarehouse;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "list", excerptProjection = CustomWarehouse.class)
public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {

    boolean existsByName(String name);

}
