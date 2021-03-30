package uz.pdp.appapiwarehouse.payload;

import lombok.Data;

import java.sql.Date;

@Data
public class InputProductDTO {

    private Integer productId;
    private Double amount;
    private Double price;
    private Date expireDate;
    private Integer inputId;
}
