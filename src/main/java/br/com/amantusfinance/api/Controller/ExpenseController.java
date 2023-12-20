package br.com.amantusfinance.api.Controller;

import br.com.amantusfinance.api.Model.Expense;
import br.com.amantusfinance.api.Service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;

    @GetMapping("/expenses")
    public List<Expense> getExpenses() {
        return this.expenseService.getExpenses();
    }

    @GetMapping("/expenses/{id}")
    public Expense getExpenseById(@PathVariable("id") Long idExpense) {
        return this.expenseService.getExpenseById(idExpense);
    }

    @PostMapping("/expenses")
    public Expense inserirExpense(@RequestBody Expense expense) {
        return this.expenseService.inserirOuAtualizar(expense);
    }

    @PutMapping("/expenses/{id}")
    public Expense atualizarExpense(@PathVariable Long id, @RequestBody Expense expense) {
        expense.setId(id);
        return this.expenseService.inserirOuAtualizar(expense);
    }

    @PatchMapping("/expenses/{id}")
    public Expense atualizarParcialExpense(@PathVariable Long id, @RequestBody Expense expense) {
        expense.setId(id);
        return this.expenseService.inserirOuAtualizar(expense);
    }

    @DeleteMapping("/expenses/{id}")
    public void apagarExpense(@PathVariable("id") Long id) {
        this.expenseService.apagar(id);
    }
}
