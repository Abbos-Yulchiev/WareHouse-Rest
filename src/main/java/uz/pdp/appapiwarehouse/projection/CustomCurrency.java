package uz.pdp.appapiwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appapiwarehouse.entity.Currency;

@Projection(types = Currency.class)
public interface CustomCurrency {

    Integer getId();

    String getName();

    Boolean getActive();
}
