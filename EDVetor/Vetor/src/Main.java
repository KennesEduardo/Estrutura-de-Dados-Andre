public class Main {
    public static void main(String[] args) throws Exception {
    try {
        Vetor vetor = new Vetor(10);
        vetor.adiciona("B");
        vetor.adiciona("D");
        vetor.adiciona("E");
        vetor.adiciona("X");
        System.out.println(vetor);
        System.out.println(vetor.busca(0));
        System.out.println(vetor.busca("B"));
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	
    }
}    
