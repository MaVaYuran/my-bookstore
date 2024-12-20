package by.mariayuran.my_bookstore.model;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="buckets")
public class Bucket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    @JoinColumn(name ="user_id")
    private User user;
    @ManyToMany
    @JoinTable(name = "buckets_products",
            joinColumns = @JoinColumn(name="bucket_id"),
            inverseJoinColumns = @JoinColumn(name="product_id"))
    private List<Product> products;
}
