public class Principal {
    public static void main(String[] args) throws Exception {

        //clinahdo objeto
        Pilha<String> pilha = new Pilha<>();

        System.out.println("----Pilha---");
        pilha.empilhar("A");
        pilha.empilhar("B");
        pilha.empilhar("C");
        pilha.empilhar("D");
        pilha.empilhar("F");
        pilha.empilhar("E");

        System.out.println(pilha.topo());
        System.out.println(pilha.toString());
    
    
    }
}
