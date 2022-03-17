import java.nio.file.attribute.FileTime;
import java.util.Arrays;

public class Vetor {
    private String[] elementos; //criando vetor privado só para a classe ter acesso
    private int tamanho;
    
    public Vetor(int capacidade){//metado construtor 
        elementos = new String[capacidade];
        tamanho = 0;
    }

	
	/*public void adiciona(String elemento) {
		for(int i=0; i<elementos.length; i++) {
			if(elementos[i] ==null) {
				elementos[i] = elemento;
				break;
			}
		}
	}
	*/
   /* public void adiciona(String elemento) throws Exception {
    	if(tamanho < elementos.length) {
    		elementos[tamanho] = elemento;
    		tamanho++;
    	}else {
    		throw new Exception("vetor está cheio");    	
    	}
    }
	*/
	//sempre adiciona o elemento no final do vetor
	public boolean adiciona(String elemento){
		if(tamanho < elementos.length){
			elementos[tamanho] = elemento;
			tamanho++;
			return true;
		}
		return false;
	}
	public int tamanho(){
		return tamanho;
	}

	//buscando uma possicao e retornando	
	public String busca(int posicao) throws IllegalAccessException{
		if(!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalAccessException("Posição invalida!");
		}
		return elementos[posicao];
	}

	public int busca(String elemento){
		for (int i = 0; i < tamanho; i++){
			if(elementos[i].equals(elemento)){
				return i;
			}
		}
		return -1;
	}
    
	
	public String toString(){

		StringBuffer s = new StringBuffer();
		s.append("[");
		
		for(int i = 0; i < tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(",");
		}
		if(tamanho > 0) {
			s.append(elementos[tamanho-1]);
		}
		s.append("]");
		return s.toString();
		
	}
	
    

}


