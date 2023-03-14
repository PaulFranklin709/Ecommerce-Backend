package revature.paulfranklin.ecommerce.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;

import revature.paulfranklin.ecommerce.dtos.requests.NewUserRequest;
import revature.paulfranklin.ecommerce.service.EcommerceTokenService;
import revature.paulfranklin.ecommerce.service.EcommerceUserService;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class EcommerceUserController {
    private final EcommerceTokenService tokenService;
    private final EcommerceUserService userService;

    public EcommerceUserController(EcommerceTokenService tokenService, EcommerceUserService userService) {
        this.tokenService = tokenService;
        this.userService = userService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void newUser(@RequestBody NewUserRequest req) {
        if (req.getUsername() == null || req.getPassword() == null) {
            throw new RuntimeException("Missing username or password");
        }

        try {
            userService.newUser(req);
        } catch (Exception exception) {
        	throw new RuntimeException(exception.getMessage());
        }
    }
}
