package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "productos")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long productId;
    @Column(name = "nombre", nullable = false)
    private String name;
    @Column(name = "estado")
    private Boolean state;
    @Column(name = "precio_venta", nullable = false)
    private Integer price;
    @Column(name = "codigo_barras", unique = true)
    private String barcode;
    @Column(name = "cantidad_stock", nullable = false)
    private Integer stock;

    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false, insertable = false, updatable = false)
    private Category category;

    @OneToMany(mappedBy = "product")
    private List<ProductPurchase> purchases;


    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<ProductPurchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<ProductPurchase> purchases) {
        this.purchases = purchases;
    }


}
