package br.com.amantusfinance.api.Service;

import br.com.amantusfinance.api.Model.Budget;
import br.com.amantusfinance.api.Repositories.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BudgetService {
    @Autowired
    private BudgetRepository budgetRepository;

    public List<Budget> getBudgets() {
        return this.budgetRepository.findAll();
    }

    public Budget getBudgetById(Long idBudget) {
        return this.budgetRepository.findById(idBudget).orElse(null);
    }

    @Transactional
    public Budget inserirOuAtualizar(Budget budget) {
        Budget budgetInserida = this.budgetRepository.save(budget);
        return budgetInserida;
    }

    public void apagar(Long id) {
        this.budgetRepository.deleteById(id);
    }
}
