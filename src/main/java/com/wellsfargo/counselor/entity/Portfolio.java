package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Portfolio {
    
    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String creationDate;

    //below client
    @ManyToOne
    private Client client;

    protected Portfolio(){
        
    }

    public Portfolio(Client client, String creationDate) {
        this.creationDate = creationDate;
        this.client = client;
    }

    public String getName() {
        return creationDate;
    }

    public void setName(String creationDate) {
        this.creationDate = creationDate;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    //Get Set method for upper layer
    public Client getClient(){
        return client;
    }

    public void setClient(Client client){
        this.client = client;
    }

}
