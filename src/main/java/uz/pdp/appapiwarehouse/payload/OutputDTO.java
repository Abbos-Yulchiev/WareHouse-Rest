package uz.pdp.appapiwarehouse.payload;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class OutputDTO {

    private Timestamp date;
    private Integer warehouseId;
    private Integer clientId;
    private Integer currencyId;
    private String factureNumber;
    private String code;
}
