package uz.pdp.appapiwarehouse.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {

    private String message;
    private Boolean status;
    private Object object;

    public Result(String message, Boolean status) {
        this.message = message;
        this.status = status;
    }
}
