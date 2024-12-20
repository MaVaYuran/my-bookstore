package by.mariayuran.my_bookstore.mapper;

import by.mariayuran.my_bookstore.dto.ProductDto;
import by.mariayuran.my_bookstore.model.Product;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public interface ProductMapper {
    ProductMapper MAPPER = Mappers.getMapper(ProductMapper.class);

    Product toProduct(ProductDto dto);

    @InheritInverseConfiguration
    ProductDto fromProduct(Product product);

    List<Product> toProductList(List<ProductDto> productDtos);
    List<ProductDto> fromProductList(List<Product> products);
}
