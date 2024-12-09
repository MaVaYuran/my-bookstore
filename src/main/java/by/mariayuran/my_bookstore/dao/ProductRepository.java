package by.mariayuran.my_bookstore.dao;

import by.mariayuran.my_bookstore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {


}
