package br.com.amantusfinance.api.Repositories;

import br.com.amantusfinance.api.Model.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
}
