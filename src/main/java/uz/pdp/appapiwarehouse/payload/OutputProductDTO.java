package uz.pdp.appapiwarehouse.payload;

import lombok.Data;

@Data
public class OutputProductDTO {

    private Integer productId;
    private Double amount;
    private Double price;
    private Integer outputId;
}
