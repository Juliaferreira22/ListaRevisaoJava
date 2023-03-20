package reinos; 
public class Animal{
    private String nome, especie, cor;
    private int idade; 



    //ex13

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    } //ex 13

   public void envelhecer (){

     this.idade ++; 

   }

   public void recolorir (String novaCor){

    if (novaCor.equals("Azul") || 
    novaCor.equals("Verde") || novaCor.equals("Marrom") || novaCor.equals("Preto") ||
    novaCor.equals("Branco")
    ) {
    this.cor =novaCor; 
}else {
    System.out.println("Erro: Cor Inválida");
}


   }

   public void renomear (String novoNome ){

     if (novoNome.equals("Bife")  || novoNome.equals("Picanha")){
        System.out.println("ERRO: Por favor não faça isso");
     } else {

        this.nome = novoNome; 
    }

   }


   public Animal(){ // ex12
    this.nome = "Indefinido";
    this.especie = "Nenhuma"; 
    this.idade = 0;
    this.cor = "Azul"; 
   
}

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    } // ex 14

    public void imprimirDetalhes(){ // ex17
        System.out.println("Nome:" +this.nome+ 
        "Especie" +this.especie+ 
        "Cor" +this.cor+ 
        "Idade" +this.idade);
    }  



}

