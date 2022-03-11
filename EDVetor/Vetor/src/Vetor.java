import java.util.Arrays;

public class Vetor {
    private String[] elementos; //criando vetor privado só para a classe ter acesso

    public Vetor(int capacidade){//metado construtor 
        elementos = new String[capacidade];
    }

	@Override
	public String toString() {
		return "Vetor [elementos=" + Arrays.toString(elementos) + "]";
	}


    

}


