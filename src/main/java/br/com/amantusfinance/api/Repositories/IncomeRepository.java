package br.com.amantusfinance.api.Repositories;

import br.com.amantusfinance.api.Model.Income;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepository extends JpaRepository<Income, Long> {
}
