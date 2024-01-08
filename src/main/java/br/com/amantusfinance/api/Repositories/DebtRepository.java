package br.com.amantusfinance.api.Repositories;

import br.com.amantusfinance.api.Model.Debt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DebtRepository extends JpaRepository<Debt, Long> {
}
