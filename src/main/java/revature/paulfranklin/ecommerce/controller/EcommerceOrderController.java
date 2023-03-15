package revature.paulfranklin.ecommerce.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import revature.paulfranklin.ecommerce.service.EcommerceOrderService;
import revature.paulfranklin.ecommerce.service.EcommerceTokenService;
import revature.paulfranklin.ecommerce.service.EcommerceUserService;

@CrossOrigin
@RestController
@RequestMapping("/orders")
public class EcommerceOrderController {
    private final EcommerceTokenService tokenService;
    private final EcommerceUserService userService;
    private final EcommerceOrderService orderService;

    public EcommerceOrderController(EcommerceTokenService tokenService, EcommerceUserService userService, EcommerceOrderService orderService) {
        this.tokenService = tokenService;
        this.userService = userService;
        this.orderService = orderService;
    }
}
