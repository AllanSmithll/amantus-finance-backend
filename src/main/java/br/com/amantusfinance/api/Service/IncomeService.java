package br.com.amantusfinance.api.Service;

import br.com.amantusfinance.api.Model.Income;
import br.com.amantusfinance.api.Repositories.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class IncomeService {
    @Autowired
    private IncomeRepository incomeRepository;

    public List<Income> getIncomes() {
        return this.incomeRepository.findAll();
    }

    public Income getIncomeById(Long idIncome) {
        return this.incomeRepository.findById(idIncome).orElse(null);
    }

    @Transactional
    public Income inserirOuAtualizar(Income income) {
        Income incomeInserida = this.incomeRepository.save(income);
        return incomeInserida;
    }

    public void apagar(Long id) {
        this.incomeRepository.deleteById(id);
    }

}
