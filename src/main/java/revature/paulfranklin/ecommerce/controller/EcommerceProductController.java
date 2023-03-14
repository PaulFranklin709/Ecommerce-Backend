package revature.paulfranklin.ecommerce.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import revature.paulfranklin.ecommerce.model.EcommerceProduct;
import revature.paulfranklin.ecommerce.service.EcommerceProductService;
import revature.paulfranklin.ecommerce.service.EcommerceUserService;

@CrossOrigin
@RestController
@RequestMapping("/products")
public class EcommerceProductController {
    private final EcommerceProductService productService;

    public EcommerceProductController(EcommerceProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Iterable<EcommerceProduct> getProducts() {
        return productService.findAllProducts();
    }
}
