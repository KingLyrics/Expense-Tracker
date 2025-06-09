package com.ekom.backend.Service;

import com.ekom.backend.Model.Expense;
import com.ekom.backend.Repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    private  final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public Expense addExpense(Expense expense){
        return expenseRepository.save(expense);
    }

    public List<Expense> getAllExpenses(){
        return  expenseRepository.findAll();
    }

    public void deleteExpenseById(Long id){
       expenseRepository.deleteById(id);
    }

    public List<Expense> getExpensesByCategory(){
        return  expenseRepository.findAll();
    }
}
