package revature.paulfranklin.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import revature.paulfranklin.ecommerce.model.EcommerceUser;

public interface EcommerceUserDAOInterface extends CrudRepository<EcommerceUser, String> {

}
