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
    private String creditor_name;
    private Double value;
    private Double value_pending;
    private DebtType type;
    @Column(nullable = true)
    private Double interest_rates_tax = 0.00;
    @Column(nullable = true)
    private Double penalties = 0.00;
    private Date date;
    private Date date_expiration;
    private DebtStatus status;
    @Column(nullable = true)
    private String contact_information = "";
}
