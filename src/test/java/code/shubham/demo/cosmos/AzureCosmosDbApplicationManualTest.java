package code.shubham.demo.cosmos;

import code.shubham.demo.cosmos.dal.entities.Product;
import code.shubham.demo.cosmos.dal.repositories.ProductRepository;
import com.azure.cosmos.models.PartitionKey;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

//@SpringBootTest
public class AzureCosmosDbApplicationManualTest {

    @Autowired
    ProductRepository productRepository;

//    @Test
    public void givenProductIsCreated_whenCallFindById_thenProductIsFound() {
        Product product = new Product();
        product.setProductId("1001");
        product.setProductCategory("Shirt");
        product.setPrice(110.0);
        product.setProductName("Blue Shirt");

        productRepository.save(product);
        Product retrievedProduct = productRepository.findById("1001", new PartitionKey("Shirt"))
                .block();
        Assert.notNull(retrievedProduct, "Retrieved Product is Null");
    }

}