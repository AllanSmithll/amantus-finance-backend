package br.com.amantusfinance.api.Service;

import br.com.amantusfinance.api.Model.Debt;
import br.com.amantusfinance.api.Repositories.DebtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DebtService {
    private final DebtRepository debtRepository;

    public DebtService(DebtRepository debtRepository) {
        this.debtRepository = debtRepository;
    }

    public List<Debt> getDebts() {
        return this.debtRepository.findAll();
    }

    public Debt getDebtById(Long idDebt) {
        return this.debtRepository.findById(idDebt).orElse(null);
    }

    public Debt insertOrUpdate(Debt debt) {
        return this.debtRepository.save(debt);
    }

    public void delete(Long id) {
        this.debtRepository.deleteById(id);
    }

}
