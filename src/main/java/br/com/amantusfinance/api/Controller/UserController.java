package br.com.amantusfinance.api.Controller;

import br.com.amantusfinance.api.Model.User;
import br.com.amantusfinance.api.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsuarios() {
        return this.userService.getUsers();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable("id") Long idUser) {
        return this.userService.getUserById(idUser);
    }

    @PostMapping("/users")
    public User inserirUser(@RequestBody User user) {
        return this.userService.inserirOuAtualizar(user);
    }

    @PutMapping("/users/{id}")
    public User atualizarIncome(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        return this.userService.inserirOuAtualizar(user);
    }

    @PatchMapping("/users/{id}")
    public User atualizarParcialUser(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        return this.userService.inserirOuAtualizar(user);
    }

    @DeleteMapping("/users/{id}")
    public void apagarUser(@PathVariable("id") Long id) {
        this.userService.apagar(id);
    }
}
