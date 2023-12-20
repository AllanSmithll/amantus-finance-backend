package br.com.amantusfinance.api.Controller;

import br.com.amantusfinance.api.Model.Budget;
import br.com.amantusfinance.api.Service.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class BudgetController {
    @Autowired
    private BudgetService budgetService;

    @GetMapping("/budgets")
    public List<Budget> getBudgets() {
        return this.budgetService.getBudgets();
    }

    @GetMapping("/budgets/{id}")
    public Budget getBudgetById(@PathVariable("id") Long idBudget) {
        return this.budgetService.getBudgetById(idBudget);
    }

    @PostMapping("/budgets")
    public Budget inserirBudget(@RequestBody Budget budget) {
        return this.budgetService.inserirOuAtualizar(budget);
    }

    @PutMapping("/budgets/{id}")
    public Budget atualizarBudget(@PathVariable Long id, @RequestBody Budget budget) {
        budget.setId(id);
        return this.budgetService.inserirOuAtualizar(budget);
    }

    @PatchMapping("/budgets/{id}")
    public Budget atualizarParcialBudget(@PathVariable Long id, @RequestBody Budget budget) {
        budget.setId(id);
        return this.budgetService.inserirOuAtualizar(budget);
    }

    @DeleteMapping("/budgets/{id}")
    public void apagarBudget(@PathVariable("id") Long id) {
        this.budgetService.apagar(id);
    }
}
