package revature.paulfranklin.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import revature.paulfranklin.ecommerce.model.EcommerceOrder;

@Repository
public interface EcommerceOrderDAOInterface extends CrudRepository<EcommerceOrder, String> {
}
