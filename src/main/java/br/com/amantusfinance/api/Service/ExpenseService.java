package br.com.amantusfinance.api.Service;

import br.com.amantusfinance.api.Model.Expense;
import br.com.amantusfinance.api.Repositories.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepository;

    public List<Expense> getExpenses() {
        return this.expenseRepository.findAll();
    }

    public Expense getExpenseById(Long idExpense) {
        return this.expenseRepository.findById(idExpense).orElse(null);
    }

    @Transactional
    public Expense inserirOuAtualizar(Expense expense) {
        Expense expenseInserida = this.expenseRepository.save(expense);
        return expenseInserida;
    }

    public void apagar(Long id) {
        this.expenseRepository.deleteById(id);
    }
}
