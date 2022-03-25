import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        try {
            
            LinkedList<Contato> listaEncadeada = new LinkedList<>();


            Contato c1 = new Contato("c1", "111-1111", "c1@gmail.com.br");
            Contato c2 = new Contato("c2", "222-2222", "c2@gmail.com.br");
            Contato c3 = new Contato("c3", "333-3333", "c3@gmail.com.br");
            Contato c4 = new Contato("c4", "444-4444", "c4@gmail.com.br");
            Contato c5 = new Contato("c5", "555-5555", "c5@gmail.com.br");
            listaEncadeada.add(c1);
            listaEncadeada.add(c3);
            listaEncadeada.add(2,c2);
            listaEncadeada.addFirst(c4);
            listaEncadeada.addLast(c5);
            //listaEncadeada.remove(); para tirar o primeiro da lista
            listaEncadeada.remove(c5);
            System.out.println( listaEncadeada.contains(c5));
            System.out.println(listaEncadeada);

           /* Lista normal.
           List<Contato> lista = new ArrayList<>();
            lista.add(c1);
            lista.add(c2);
            lista.add(0, c3);
            System.out.println(lista.contains(c3)); 
            System.out.println(lista.get(1)); 
            
            System.out.println(lista);
            System.out.println("Tamanho:" + lista.size());

            */

           /*Lista<Contato> lista = new Lista(3);
            Lista<String> lista2 =new Lista(1);
            Lista<Integer> lista3 =new Lista(1); // interger = int ou inteiro
            Contato c1 = new Contato("c1", "111-1111", "c1@gmail.com.br");
            Contato c2 = new Contato("c2", "222-2222", "c2@gmail.com.br");
            Contato c3 = new Contato("c3", "333-3333", "c3@gmail.com.br");
            lista.adiciona(c1);
            lista.adiciona(c2);
            lista.adiciona(c3);
            lista2.adiciona("A");
            lista3.adiciona(10);
            System.out.println(lista);
            System.out.println(lista2);
            System.out.println(lista3); */

        	/*vetor.adiciona(2);
            vetor.adiciona(3);
            vetor.adiciona(5);
            vetor.adiciona(0, 1);
            vetor.adiciona(3, 4);
            System.out.println("Vetor Original");
            System.out.println(vetor);
            System.out.println("Vetor Depois de Remover");
            vetor.remover(0);
            vetor.remover(2);
            System.out.println(vetor);*/

            //System.out.println(vetor.busca(2));
            //System.out.println (vetor.busca("elemento 1"));
        } catch(Exception e) {
        	e.printStackTrace();
        }
        
        
        
        
        
    }
	
}
