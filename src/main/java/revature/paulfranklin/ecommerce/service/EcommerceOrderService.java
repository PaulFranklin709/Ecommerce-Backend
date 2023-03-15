package revature.paulfranklin.ecommerce.service;

import org.springframework.stereotype.Service;
import revature.paulfranklin.ecommerce.dao.EcommerceOrderDAOInterface;
import revature.paulfranklin.ecommerce.dtos.requests.NewOrderRequest;
import revature.paulfranklin.ecommerce.model.EcommerceOrder;
import revature.paulfranklin.ecommerce.model.EcommerceUser;

import java.util.UUID;

@Service
public class EcommerceOrderService {
    private final EcommerceOrderDAOInterface orderRepository;

    public EcommerceOrderService(EcommerceOrderDAOInterface orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void createOrder(NewOrderRequest req, EcommerceUser user) {
        EcommerceOrder order = new EcommerceOrder(UUID.randomUUID().toString(), user, req.getTotalPrice());
        orderRepository.save(order);
    }
}
