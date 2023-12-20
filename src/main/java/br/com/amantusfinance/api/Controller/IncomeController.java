package br.com.amantusfinance.api.Controller;

import br.com.amantusfinance.api.Model.Income;
import br.com.amantusfinance.api.Service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class IncomeController {
    @Autowired
    private IncomeService incomeService;

    @GetMapping("/incomes")
    public List<Income> getIncomes() {
        return this.incomeService.getIncomes();
    }

    @GetMapping("/incomes/{id}")
    public Income getIncomeById(@PathVariable("id") Long idIncome) {
        return this.incomeService.getIncomeById(idIncome);
    }

    @PostMapping("/incomes")
    public Income inserirIncome(@RequestBody Income income) {
        return this.incomeService.inserirOuAtualizar(income);
    }

    @PutMapping("/incomes/{id}")
    public Income atualizarIncome(@PathVariable Long id, @RequestBody Income income) {
        income.setId(id);
        return this.incomeService.inserirOuAtualizar(income);
    }

    @PatchMapping("/incomes/{id}")
    public Income atualizarParcialIncome(@PathVariable Long id, @RequestBody Income income) {
        income.setId(id);
        return this.incomeService.inserirOuAtualizar(income);
    }

    @DeleteMapping("/incomes/{id}")
    public void apagarIncome(@PathVariable("id") Long id) {
        this.incomeService.apagar(id);
    }
}
