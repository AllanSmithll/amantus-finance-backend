package br.com.amantusfinance.api.Repositories;

import br.com.amantusfinance.api.Model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
