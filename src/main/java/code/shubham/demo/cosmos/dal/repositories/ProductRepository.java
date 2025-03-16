package code.shubham.demo.cosmos.dal.repositories;

import code.shubham.demo.cosmos.dal.entities.Product;
import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.List;

@Repository
public interface ProductRepository extends ReactiveCosmosRepository<Product, String> {
    Flux<List> findByProductName(String productName);

}