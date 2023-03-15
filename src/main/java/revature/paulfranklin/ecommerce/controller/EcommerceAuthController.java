package revature.paulfranklin.ecommerce.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import revature.paulfranklin.ecommerce.dtos.requests.NewLoginRequest;
import revature.paulfranklin.ecommerce.dtos.responses.Principal;
import revature.paulfranklin.ecommerce.model.EcommerceUser;
import revature.paulfranklin.ecommerce.service.EcommerceTokenService;
import revature.paulfranklin.ecommerce.service.EcommerceUserService;

@CrossOrigin
@RestController
@RequestMapping("/auth")
public class EcommerceAuthController {
    private final EcommerceUserService userService;
    private final EcommerceTokenService tokenService;

    public EcommerceAuthController(EcommerceUserService userService, EcommerceTokenService tokenService) {
        this.userService = userService;
        this.tokenService = tokenService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Principal login(@RequestBody NewLoginRequest req) {
        if (req.getUsername() == null || req.getPassword() == null) {
            throw new RuntimeException("Missing username or password");
        }

        EcommerceUser user = null;
        try {
            user = userService.findUser(req.getUsername());

            if (!req.getPassword().equals(user.getPassword())) {
                System.out.println(req.getPassword());
                System.out.println(user.getPassword());
                throw new Exception("Wrong password");
            }
        } catch (Exception exception) {
            throw new RuntimeException(exception.getMessage());
        }

        Principal principal = new Principal(user.getUserId(), user.getUsername());
        String token = tokenService.createNewToken(principal);

        return principal;
    }
}
