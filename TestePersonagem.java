public class TestePersonagem{
  static public void main(String [] args){
    //p é uma variável de referência. Ela faz referência ao objeto construído com new
    // Personagem p = new Personagem();
    //java 10+ (inferência de tipo)
    var p = new Personagem();
    p.nome = "John";
    p.cacar();
    p.comer();
    p.dormir();

  }
}