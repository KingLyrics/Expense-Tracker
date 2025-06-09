package com.ekom.backend.Model;

public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Double amount;
    private ExpenseType category;
    private LocalDate date;

}
