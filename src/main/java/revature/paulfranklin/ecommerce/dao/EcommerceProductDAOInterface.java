package revature.paulfranklin.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import revature.paulfranklin.ecommerce.model.EcommerceProduct;

import java.util.ArrayList;

@Repository
public interface EcommerceProductDAOInterface extends CrudRepository<EcommerceProduct, String> {
    ArrayList<EcommerceProduct> findAll();
}
