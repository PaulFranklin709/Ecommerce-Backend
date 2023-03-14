package revature.paulfranklin.ecommerce.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import revature.paulfranklin.ecommerce.model.EcommerceProduct;
import revature.paulfranklin.ecommerce.service.EcommerceProductService;

import java.util.ArrayList;

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
    public ArrayList<EcommerceProduct> getProducts() {
        return productService.findAllProducts();
    }
}
