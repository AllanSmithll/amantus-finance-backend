package br.com.amantusfinance.api;

import br.com.amantusfinance.api.Model.Income;
import org.junit.jupiter.api.Test;

import java.sql.Date;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class IncomeTest {

    @Test
    public void testCreateIncome() {
        // Criação de uma instância de Income
        Income income = new Income();
        income.setId(1L);
        income.setDescription("Salary");
        income.setValue(2000.0);
        income.setDate(Date.valueOf("2023-01-01"));
        income.setCategory("Salary");
        income.setFrequency("Monthly");
        income.setOrigin("Job");

        // Verificação dos valores atribuídos
        assertThat(income.getId()).isEqualTo(1L);
        assertThat(income.getDescription()).isEqualTo("Salary");
        assertThat(income.getValue()).isEqualTo(2000.0);
        assertThat(income.getDate()).isEqualTo(Date.valueOf("2023-01-01"));
        assertThat(income.getCategory()).isEqualTo("Salary");
        assertThat(income.getFrequency()).isEqualTo("Monthly");
        assertThat(income.getOrigin()).isEqualTo("Job");
    }

    @Test
    void testIncomeInitialization() {
        Income income = new Income();
        assertNull(income.getId());
        assertNull(income.getDescription());
        assertNull(income.getValue());
        assertNull(income.getDate());
        assertNull(income.getCategory());
        assertNull(income.getFrequency());
        assertNull(income.getOrigin());
        assertNull(income.getAdd_information());
    }

    @Test
    void testIncomeSetterAndGetters() {
        Income income = new Income();

        // Set values
        income.setId(1L);
        income.setDescription("Salary");
        income.setValue(2000.0);
        income.setDate(Date.valueOf("2023-01-01"));
        income.setCategory("Salary");
        income.setFrequency("Monthly");
        income.setOrigin("Job");
        income.setAdd_information("Additional info");

        // Check values
        assertEquals(1L, income.getId());
        assertEquals("Salary", income.getDescription());
        assertEquals(2000.0, income.getValue());
        assertEquals(Date.valueOf("2023-01-01"), income.getDate());
        assertEquals("Salary", income.getCategory());
        assertEquals("Monthly", income.getFrequency());
        assertEquals("Job", income.getOrigin());
        assertEquals("Additional info", income.getAdd_information());
    }

    @Test
    void testIncomeToString() {
        Income income = new Income();
        income.setId(1L);
        income.setDescription("Salary");
        income.setValue(2000.0);
        income.setDate(Date.valueOf("2023-01-01"));
        income.setCategory("Salary");
        income.setFrequency("Monthly");
        income.setOrigin("Job");
        income.setAdd_information("Additional info");

        Income expectedIncome = new Income();
        expectedIncome.setId(1L);
        expectedIncome.setDescription("Salary");
        expectedIncome.setValue(2000.0);
        expectedIncome.setDate(Date.valueOf("2023-01-01"));
        expectedIncome.setCategory("Salary");
        expectedIncome.setFrequency("Monthly");
        expectedIncome.setOrigin("Job");
        expectedIncome.setAdd_information("Additional info");

        assertEquals(expectedIncome, income);
    }

    @Test
    public void testEquals() {
        // Duas instâncias de Income com os mesmos valores devem ser consideradas iguais
        Income income1 = new Income(1L, "Salary", 2000.0, Date.valueOf("2023-01-01"), "Salary", "Monthly", "Job", null);
        Income income2 = new Income(1L, "Salary", 2000.0, Date.valueOf("2023-01-01"), "Salary", "Monthly", "Job", null);

        assertThat(income1).isEqualTo(income2);
    }

    @Test
    public void testNotEquals() {
        // Duas instâncias de Income com valores diferentes não devem ser consideradas iguais
        Income income1 = new Income(1L, "Salary", 2000.0, Date.valueOf("2023-01-01"), "Salary", "Monthly", "Job", null);
        Income income2 = new Income(2L, "Bonus", 1500.0, Date.valueOf("2023-01-02"), "Bonus", "Yearly", "Bonus", "Extra Info");

        assertThat(income1).isNotEqualTo(income2);
    }

    // Outros testes conforme necessário
}
