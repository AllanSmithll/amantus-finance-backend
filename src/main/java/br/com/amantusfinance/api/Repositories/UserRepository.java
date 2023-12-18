package br.com.amantusfinance.api.Repositories;

import br.com.amantusfinance.api.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
