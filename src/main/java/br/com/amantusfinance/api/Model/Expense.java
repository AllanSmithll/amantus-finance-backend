package br.com.amantusfinance.api.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.sql.Date;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "tb_expense")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Expense extends Transaction {
    private String payment_method;
}
