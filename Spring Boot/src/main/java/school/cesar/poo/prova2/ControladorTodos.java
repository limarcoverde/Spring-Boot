package school.cesar.poo.prova2;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todos")
public class ControladorTodos {
        public RepositorioTodosMemoria repo = new RepositorioTodosMemoria();

        @PostMapping
        public void salvar(@RequestBody Todo todo){
                repo.salvar(todo);
        }
        
        @GetMapping
        public List<Todo> listar() {
                return repo.listar();
        }
}
