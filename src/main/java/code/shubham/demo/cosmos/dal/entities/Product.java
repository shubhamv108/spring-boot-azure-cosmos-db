package code.shubham.demo.cosmos.dal.entities;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Container(containerName = "products")
public class Product {

    @Id
    private String productId;

    private String productName;

    private double price;

    @PartitionKey
    private String productCategory;
}