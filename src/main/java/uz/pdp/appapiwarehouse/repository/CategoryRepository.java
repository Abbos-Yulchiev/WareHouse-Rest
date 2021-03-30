package uz.pdp.appapiwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appapiwarehouse.entity.Category;


import java.util.List;

@RepositoryRestResource(path = "category")
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    List<Category> findAllByParentCategoryId(Category parentCategoryId);
}
