package school.cesar.poo.prova2;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTodosMemoria implements RepositorioTodos {
        private List<Todo> salvos = new ArrayList<Todo>();

        public void salvar(Todo todo) {
                salvos.add(todo);
        }

        public List<Todo> listar() {
                return salvos;
        }
}
