package com.example.demo.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "compras")
public class Purchase {

    @Id
    @Column(name = "id_compra")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long purchaseId;
    @Column(name = "fecha", nullable = false)
    private LocalDateTime date;
    @Column(name = "comentario", nullable = false)
    private String comment;
    @Column(name = "estado", nullable = false)
    private Boolean state;
    @Column(name = "medio_pago", nullable = false)
    private Boolean paymentMethod;
    public Long getPurchaseId() {
        return purchaseId;
    }
    @ManyToOne
    //Specifying the foreign key
    @JoinColumn(name = "id_cliente", nullable = false, insertable = false, updatable = false)
    private Client client;

    @OneToMany(mappedBy = "purchase")
    private List<ProductPurchase> products;

    public void setPurchaseId(Long purchaseId) {
        this.purchaseId = purchaseId;
    }
    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Boolean getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Boolean paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }

    public List<ProductPurchase> getProducts() {
        return products;
    }

    public void setProducts(List<ProductPurchase> products) {
        this.products = products;
    }
}
