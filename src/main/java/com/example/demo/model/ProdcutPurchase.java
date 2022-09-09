package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "compras_productos")
public class ProdcutPurchase {
    @EmbeddedId
    private ProductPurchasePK productPurchaseId;
    @Column(name = "cantidad")
    private Integer count;
    @Column(name = "estado")
    private Boolean state;
    @Column(name = "total")
    private Long total;

    public ProductPurchasePK getProductPurchaseId() {
        return productPurchaseId;
    }

    public void setProductPurchaseId(ProductPurchasePK productPurchaseId) {
        this.productPurchaseId = productPurchaseId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
