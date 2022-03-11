public class Main {
    public static void main(String[] args) throws Exception {
    try {
        Vetor vetor = new Vetor(5);
        vetor.adiciona("elemeto 1");
        vetor.adiciona("elemeto 2");
        vetor.adiciona("elemento 3");
        System.out.println(vetor);
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	
    }
}    
