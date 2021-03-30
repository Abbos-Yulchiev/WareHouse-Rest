package uz.pdp.appapiwarehouse.payload;

import lombok.Data;

@Data
public class ProductDTO {

    private String code;
    private String name;
    private Integer categoryId;
    private Integer photoId;
    private Integer measurementId;

}
