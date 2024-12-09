package by.mariayuran.my_bookstore.service;

import by.mariayuran.my_bookstore.dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> getAll();
    void addToUserBucket(Integer productId, String username);
}
