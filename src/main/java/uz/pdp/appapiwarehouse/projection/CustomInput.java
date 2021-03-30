package uz.pdp.appapiwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appapiwarehouse.entity.Input;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {

    Integer getId();

    Timestamp getDate();

    Integer getWarehouseId();

    Integer getSupplier();

    Integer getCurrency();

    String getFactureNumber();
}
