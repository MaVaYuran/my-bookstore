package by.mariayuran.my_bookstore.controller;

import by.mariayuran.my_bookstore.dto.BucketDto;
import by.mariayuran.my_bookstore.service.BucketService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class BucketController {

    private final BucketService bucketService;

    public BucketController(BucketService bucketService) {
        this.bucketService = bucketService;
    }

    @GetMapping("/bucket")
    public String aboutBucket(Model model, Principal principal) {
        if (principal == null) {
            model.addAttribute("bucket", new BucketDto());
        }else {
            BucketDto bucketDto = bucketService.getBucketByUser(principal.getName());
            model.addAttribute("bucket", bucketDto);
        }
        return "bucket";
    }
}
