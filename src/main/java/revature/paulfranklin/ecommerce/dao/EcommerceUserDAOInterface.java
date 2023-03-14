package revature.paulfranklin.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
import revature.paulfranklin.ecommerce.model.EcommerceUser;

@Repository
public interface EcommerceUserDAOInterface extends CrudRepository<EcommerceUser, String> {
    EcommerceUser findByUsername(String username);
}
