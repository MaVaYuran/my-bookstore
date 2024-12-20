package by.mariayuran.my_bookstore.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class ProductDto {
    private Integer id;
    private String title;
    private BigDecimal price;

}
