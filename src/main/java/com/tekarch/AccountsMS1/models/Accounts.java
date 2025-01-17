package com.tekarch.AccountsMS1.models;

//import jakarta.persistence.Entity;
//import jakarta.persistence.*;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Accounts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;
    @Column(name = "account_number", nullable = false, unique = true, length = 20)
    private String accountNumber;// VARCHAR(20) UNIQUE, NOT NULL
    @Column(name = "account_type", nullable = false,length = 20)
    private String accountType;
    @Column(name = "currency",length = 10, columnDefinition = "VARCHAR(10) DEFAULT 'USD'")
    private String currency; // VARCHAR(10) with default value 'USD'
    @Column(name = "balance",columnDefinition = "DECIMAL(15,2) DEFAULT 0.0")
    private Double balance; // DECIMAL(15,2) with default value 0.0
    @Column(name = "created_at",columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;

    @PrePersist
    public void prePersist()
    {
        this.createdAt= LocalDateTime.now();
    }
}


