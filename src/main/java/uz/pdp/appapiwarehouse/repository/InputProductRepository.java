package uz.pdp.appapiwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appapiwarehouse.entity.InputProduct;
import uz.pdp.appapiwarehouse.payload.DailyTotal;

import java.util.Date;
import java.util.List;

@RepositoryRestResource(path = "inputProduct")
public interface InputProductRepository extends JpaRepository<InputProduct, Integer> {


    @Query(value = "select sum(ip.amount) as totalAmount, sum(ip.price) as totalPrice from input_product ip left join input i on ip.input_id = i.id where i.date between date and now()", nativeQuery = true)
    DailyTotal findDailyInput(Date date);


    @Query(value = "select * from input_product where expire_status=0 and expire_date between now() and :after10", nativeQuery = true)
    List<InputProduct> getWarningProducts(Date after10);


    @Query(value = "select count() from input_product where expire_status=1", nativeQuery = true)
    List<InputProduct> getAllWarningProducts();
}
