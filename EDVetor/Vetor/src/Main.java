public class Main {
    public static void main(String[] args) throws Exception {
    try {
        Vetor vetor = new Vetor(10);
        vetor.adiciona("elemeto 1");
        vetor.adiciona("elemeto 2");
        vetor.adiciona("elemento 3");
        vetor.adiciona("elemento 4");
         System.out.println(vetor);
         System.out.println(vetor.busca(2));
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	
    }
}    
