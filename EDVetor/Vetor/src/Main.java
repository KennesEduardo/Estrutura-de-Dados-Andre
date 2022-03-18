public class Main {
    public static void main(String[] args) {
        
        try {
            VetorObjeto vetor = new VetorObjeto(3);
            Contato c1 = new Contato("c1", "111-1111", "c1@gmail.com.br");
            Contato c2 = new Contato("c2", "222-2222", "c2@gmail.com.br");
            Contato c3 = new Contato("c3", "333-3333", "c3@gmail.com.br");
            vetor.adiciona(c1);
            vetor.adiciona(c2);
            vetor.adiciona(c3);
            System.out.println(vetor);
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
