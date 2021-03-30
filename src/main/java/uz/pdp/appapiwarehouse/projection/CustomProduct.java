package uz.pdp.appapiwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appapiwarehouse.entity.Product;

@Projection(types = Product.class)
public interface CustomProduct {

    Integer getId();

    String getName();

    Boolean getActive();

    Integer getCategoryId();

    Integer getPhotoId();

    String getCode();

    Integer getMeasurementId();
}
