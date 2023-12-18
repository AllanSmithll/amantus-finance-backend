package br.com.amantusfinance.api.Service;

import br.com.amantusfinance.api.Model.Income;
import br.com.amantusfinance.api.Model.User;
import br.com.amantusfinance.api.Repositories.IncomeRepository;
import br.com.amantusfinance.api.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers() {
        return this.userRepository.findAll();
    }

    public User getUserById(Long idUser) {
        return this.userRepository.findById(idUser).orElse(null);
    }

    @Transactional
    public User inserirOuAtualizar(User user) {
        User userInserido = this.userRepository.save(user);
        return userInserido;
    }

    public void apagar(Long id) {
        this.userRepository.deleteById(id);
    }
}
