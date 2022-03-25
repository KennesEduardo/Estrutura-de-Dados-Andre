import java.util.Arrays;

public class Pilha<T> {

    //1 passo para criar a pilha
    private T[] elementos;
    private int tamanho;

    public Pilha(int capacidade){
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;

    }

    public Pilha(){
        this(10);
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public T topo(){
        if(this.estaVazia()){
            return null;
        }
        return elementos[tamanho-1];
    }

    public boolean empilhar(T elemento){
        if(tamanho < elementos.length){
            elementos[tamanho] = elemento;
            tamanho ++;
            return true;

        }
        return false;
    }

    @Override
    public String toString() {
        return "Pilha [elementos=" + Arrays.toString(elementos) + "]";
    }
    

}
