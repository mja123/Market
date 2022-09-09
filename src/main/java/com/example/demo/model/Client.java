package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Client {
    @Id
    @Column(name = "id")
    private Long clientId;
    @Column(name = "nombre", nullable = false)
    private String name;
    @Column(name = "apellidos", nullable = false)
    private String lastName;
    @Column(name = "celular", nullable = false, unique = true)
    private Long phone;
    @Column(name = "correo_electronico", nullable = false, unique = true)
    private String email;
    @Column(name = "direccion", nullable = false)
    private String address;

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
