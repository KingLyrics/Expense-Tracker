package com.ekom.backend.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

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

}
