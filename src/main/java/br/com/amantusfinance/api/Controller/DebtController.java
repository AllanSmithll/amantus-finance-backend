package br.com.amantusfinance.api.Controller;

import br.com.amantusfinance.api.Model.Debt;
import br.com.amantusfinance.api.Service.DebtService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class DebtController {
    private final DebtService debtService;

    public DebtController(DebtService debtService) {
        this.debtService = debtService;
    }

    @GetMapping("/debts")
    public List<Debt> getDebts() {
        return this.debtService.getDebts();
    }

    @GetMapping("/debts/{id}")
    public Debt getDebtById(@PathVariable("id") Long idDebt) {
        return this.debtService.getDebtById(idDebt);
    }

    @PostMapping("/debts")
    public Debt insert(@RequestBody Debt debt) {
        return this.debtService.insertOrUpdate(debt);
    }

    @PutMapping("/debts/{id}")
    public Debt update(@PathVariable Long id, @RequestBody Debt debt) {
        debt.setId(id);
        return this.debtService.insertOrUpdate(debt);
    }

    @PatchMapping("/debts/{id}")
    public Debt updatePartially(@PathVariable Long id, @RequestBody Debt debt) {
        debt.setId(id);
        return this.debtService.insertOrUpdate(debt);
    }

    @DeleteMapping("/debts/{id}")
    public void delete(@PathVariable("id") Long id) {
        this.debtService.delete(id);
    }
}
