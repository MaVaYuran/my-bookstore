package by.mariayuran.my_bookstore.dao;

import by.mariayuran.my_bookstore.model.Bucket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BucketRepository extends JpaRepository<Bucket, Integer> {
}
