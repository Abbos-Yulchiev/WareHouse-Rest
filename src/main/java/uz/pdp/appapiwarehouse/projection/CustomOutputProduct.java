package uz.pdp.appapiwarehouse.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appapiwarehouse.entity.OutputProduct;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {

    Integer getId();

    Integer getProductId();

    Double getAmount();

    Double getPrice();

    Integer getOutputId();
}
