package revature.paulfranklin.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class EcommerceProduct {
    @Id
    private String productId;

    @Column(nullable = false, unique = true)
    private String productName;

    @Column(nullable = false)
    private String productDescription;

    @Column(nullable = false)
    private Double producePrice;

    public EcommerceProduct() {
    }

    public EcommerceProduct(String productId, String productName, String productDescription, Double producePrice) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.producePrice = producePrice;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Double getProducePrice() {
        return producePrice;
    }

    public void setProducePrice(Double producePrice) {
        this.producePrice = producePrice;
    }
}
