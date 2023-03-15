package revature.paulfranklin.ecommerce.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import revature.paulfranklin.ecommerce.dtos.requests.NewOrderRequest;
import revature.paulfranklin.ecommerce.dtos.responses.Principal;
import revature.paulfranklin.ecommerce.model.EcommerceUser;
import revature.paulfranklin.ecommerce.service.EcommerceOrderService;
import revature.paulfranklin.ecommerce.service.EcommerceTokenService;
import revature.paulfranklin.ecommerce.service.EcommerceUserService;

import javax.servlet.http.HttpServletRequest;

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

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createOrder(@RequestBody NewOrderRequest req, HttpServletRequest servletReq) {
        String token = servletReq.getHeader("authorization");
        if (token == null || token.isEmpty()) throw new RuntimeException("Missing token");

        if (req.getTotalPrice() == null) {
            throw new RuntimeException("Missing total price");
        }

        Principal principal = tokenService.retrievePrincipalFromToken(token);
        EcommerceUser user = userService.findUserById(principal.getUserId());

        orderService.createOrder(req, user);
    }
}
