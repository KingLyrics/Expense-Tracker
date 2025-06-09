package com.ekom.backend.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "Expenses")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Double amount;
    @Enumerated(EnumType.STRING)
    private ExpenseType category;
    private LocalDate date;

    public Expense(){}


}
