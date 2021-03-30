package uz.pdp.appapiwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appapiwarehouse.entity.Supplier;

@Projection(types = Supplier.class)
public interface CustomSupplier {

    Integer getId();

    Integer getName();

    Boolean getActive();

    String getPhoneNumber();
}
