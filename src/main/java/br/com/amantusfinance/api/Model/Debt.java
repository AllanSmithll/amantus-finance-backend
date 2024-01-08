package br.com.amantusfinance.api.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table(name = "tb_debt")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Debt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String debtor_name;
    private Double debt_value;
    private Double debt_value_pending;
    private DebtType debt_type;
    @Column(nullable = true)
    private Double interest_rates_tax;
    private Double debt_penalties;
    private Date debt_date;
    private Date debt_expiration;
    private DebyStatus debt_status;
    @Column(nullable = true)
    private String contact_information;
}
