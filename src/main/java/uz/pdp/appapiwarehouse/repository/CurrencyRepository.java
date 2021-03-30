package uz.pdp.appapiwarehouse.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appapiwarehouse.entity.Currency;
import uz.pdp.appapiwarehouse.projection.CustomCurrency;

@RepositoryRestResource(path = "currency", collectionResourceRel = "list", excerptProjection = CustomCurrency.class)
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {

    boolean existsByName(String name);
}
