package by.mariayuran.my_bookstore.controller;

import by.mariayuran.my_bookstore.dto.ProductDto;
import by.mariayuran.my_bookstore.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;


    public ProductController(ProductService productService) {
        this.productService = productService;

    }

    @GetMapping
    public String getProducts(Model model) {
        List<ProductDto> productList = productService.getAll();
        model.addAttribute("products", productList);
        return "products";
    }

    @GetMapping("/{id}/bucket")
    public String addBucket(@PathVariable Integer id, Principal principal) {
        if (principal == null) {
            return "redirect:/products";
        }
        productService.addToUserBucket(id, principal.getName());
        return "redirect:/products";
    }
}
