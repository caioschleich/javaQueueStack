import java.util.*;

public class JavaEstruturaDados {
    public static void main(String[] args) {
        /* inserir números 1 a 5 em uma lista */
        List<Integer> lista5 = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            lista5.add(i);
        }

        /* passar os dados da lista para uma pilha */
        /* nota: nesse momento a ordem dos números se inverte */
        Stack<Integer> pilha = new Stack<>();
        while (!lista5.isEmpty()) {
            pilha.push(lista5.remove(0));
        }

        /* passar os dados da pilha para uma fila */
        Queue<Integer> fila = new LinkedList<>();
        while (!pilha.isEmpty()) {
            fila.offer(pilha.pop());
        }

        /* inserir números 6 a 10 em uma nova lista */
        List<Integer> lista10 = new ArrayList<>();
        for (int i = 6; i <= 10; i++) {
            lista10.add(i);
        }

        /* passar os dados da nova lista para uma nova pilha */
        /* nota: novamente, nesse momento a ordem dos números se inverte */
        Stack<Integer> novaPilha = new Stack<>();
        while (!lista10.isEmpty()) {
            novaPilha.push(lista10.remove(0));
        }

        /* passar os dados da nova pilha para a fila */
        while (!novaPilha.isEmpty()) {
            fila.offer(novaPilha.pop());
        }

        /* é exibida a fila no console */
        /* o resultado esperado é que os números não estejam em ordem crescente, e que comece pelo número 5 e termine pelo número 6 */
        System.out.println(fila);
    }
}
