package revature.paulfranklin.ecommerce.service;

import org.springframework.stereotype.Service;
import revature.paulfranklin.ecommerce.dao.EcommerceProductDAOInterface;
import revature.paulfranklin.ecommerce.model.EcommerceProduct;

@Service
public class EcommerceProductService {
    private final EcommerceProductDAOInterface productRepository;

    public EcommerceProductService(EcommerceProductDAOInterface productRepository) {
        this.productRepository = productRepository;
    }

    public Iterable<EcommerceProduct> findAllProducts() {
        Iterable<EcommerceProduct> products = productRepository.findAll();
        return productRepository.findAll();
    }
}
