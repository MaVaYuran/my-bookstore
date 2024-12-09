package by.mariayuran.my_bookstore.service;

import by.mariayuran.my_bookstore.dto.BucketDto;
import by.mariayuran.my_bookstore.model.Bucket;
import by.mariayuran.my_bookstore.model.User;

import java.util.List;

public interface BucketService {
    Bucket createBucket(User user, List<Integer> productsId);
    void addProducts(Bucket bucket, List<Integer> productsId);
    BucketDto getBucketByUser(String name);
}
