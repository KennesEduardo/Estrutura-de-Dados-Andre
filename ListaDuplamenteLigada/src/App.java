public class App {
    public static void main(String[] args) {
        ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
        No novoElemento = new No("A", null, null);
        lista.adicionar(novoElemento);
        lista.adicionar(new No("B", null, null));
        lista.adicionar(new No("C", null, null));
        lista.adicionar(new No("D", null, null));
        novoElemento = new No("E", null, null);
        lista.print();
    }
}
