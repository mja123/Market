package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ProductPurchasePK implements Serializable {
    @Column(name = "id_compra")
    private Long purchaseId;
    @Column(name = "id_prodcuto")
    private Long productId;
}
