package revature.paulfranklin.ecommerce.service;

import org.springframework.stereotype.Service;
import revature.paulfranklin.ecommerce.dao.EcommerceProductDAOInterface;
import revature.paulfranklin.ecommerce.model.EcommerceProduct;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class EcommerceProductService {
    private final EcommerceProductDAOInterface productRepository;

    public EcommerceProductService(EcommerceProductDAOInterface productRepository) {
        this.productRepository = productRepository;
    }

    public ArrayList<EcommerceProduct> findAllProducts() {
        ArrayList<EcommerceProduct> products = productRepository.findAll();
        if (products.size() == 0) {
            products.add(new EcommerceProduct(UUID.randomUUID().toString(), "First Product", "First Product Description", 1.00));
            products.add(new EcommerceProduct(UUID.randomUUID().toString(), "Second Product", "Second Product Description", 1.01));
        }
        return products;
    }
}
