import reinos.Animal;
// ex10
public class Zoologico {
    public static void main(String[] args) {
        Animal animais[] = new Animal [100]; // ex 11

       

        for( int i = 0; i < 100; i++){
            animais[i] = new Animal(); // for foi preencher o vetor 
            //System.out.println("Nome:" +animais[i].getNome() 
            //+ "Idade:" +animais[i].getIdade()); //Nome e Idade ex13
            animais[i].imprimirDetalhes(); // ex 17
        }

        Animal h = new Animal( "Hashirama", 4); //ex15
        //System.out.println("Nome:" +h.getNome() 
            //+ "Idade:" +h.getIdade()); // ex16
            h.imprimirDetalhes(); // ex18

        
           
          

        

       

    }
        
    }
    

