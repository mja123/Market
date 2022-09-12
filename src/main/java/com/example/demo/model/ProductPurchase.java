package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "compras_productos")
public class ProductPurchase {
    @EmbeddedId
    private ProductPurchasePK productPurchaseId;
    @Column(name = "cantidad")
    private Integer count;
    @Column(name = "estado")
    private Boolean state;
    @Column(name = "total")
    private Long total;
    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "id_compra", updatable = false, insertable = false, nullable = false)
    private Purchase purchase;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }
}
