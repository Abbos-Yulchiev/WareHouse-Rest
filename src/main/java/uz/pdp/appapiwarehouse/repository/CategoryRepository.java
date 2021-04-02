package uz.pdp.appapiwarehouse.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.RequestParam;
import uz.pdp.appapiwarehouse.entity.Category;
import uz.pdp.appapiwarehouse.projection.CustomCategory;


import java.util.List;

@RepositoryRestResource(path = "category", collectionResourceRel = "list", excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    @RestResource(path = "name")
    Page<Category> findByName(@RequestParam("name") String name, Pageable p);
}
