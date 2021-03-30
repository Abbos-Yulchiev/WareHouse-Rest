package uz.pdp.appapiwarehouse.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DailyTotal {
    String totalAmount;
    String totalPrice;
}
