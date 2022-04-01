public class Principal {
    public static void main(String[] args) throws Exception {

        //clinahdo objeto
        Pilha<String> pilha = new Pilha<>(3);

        System.out.println("----Pilha---");
        pilha.empilhar("A");
        pilha.empilhar("B");
        pilha.empilhar("C");
        pilha.empilhar("D");
        pilha.empilhar("F");
        pilha.empilhar("E");

        System.out.println("Ultimo elemento empilhado foi:" +pilha.topo());
        System.out.println("O elemento removido da pilha foi:" + pilha.desempilhar());
        System.out.println("O elemento de topo agora é:" + pilha.topo());
        pilha.empilhar("Z");
        System.out.println(pilha.toString());
    
    
    }

}
