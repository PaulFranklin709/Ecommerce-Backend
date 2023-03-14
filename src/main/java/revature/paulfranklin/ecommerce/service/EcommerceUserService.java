package revature.paulfranklin.ecommerce.service;

import org.springframework.stereotype.Service;

import revature.paulfranklin.ecommerce.dao.EcommerceUserDAOInterface;
import revature.paulfranklin.ecommerce.dtos.requests.NewUserRequest;
import revature.paulfranklin.ecommerce.model.EcommerceUser;

import java.util.UUID;

@Service
public class EcommerceUserService {
    private final EcommerceUserDAOInterface userRepository;

    public EcommerceUserService(EcommerceUserDAOInterface userRepository) {
        this.userRepository = userRepository;
    }

    public void newUser(NewUserRequest req) {
        EcommerceUser user = new EcommerceUser(UUID.randomUUID().toString(), req.getUsername(), req.getPassword());
        try {
            userRepository.save(user);
        } catch (Exception exception) {
            throw new RuntimeException("Database issue");
        }
    }
}
