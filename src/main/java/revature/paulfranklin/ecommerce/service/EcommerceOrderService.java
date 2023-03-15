package revature.paulfranklin.ecommerce.service;

import org.springframework.stereotype.Service;
import revature.paulfranklin.ecommerce.dao.EcommerceOrderDAOInterface;

@Service
public class EcommerceOrderService {
    private final EcommerceOrderDAOInterface orderRepository;

    public EcommerceOrderService(EcommerceOrderDAOInterface orderRepository) {
        this.orderRepository = orderRepository;
    }
}
