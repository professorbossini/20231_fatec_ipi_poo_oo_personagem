public class TestePersonagem{
  static public void main(String [] args) throws Exception{

    //p é uma variável de referência. Ela faz referência ao objeto construído com new
    // Personagem p = new Personagem();
    //java 10+ (inferência de tipo)
    var p = new Personagem(2, 4, 10);
    var p2 = new Personagem(8, 10, 2);
    p.nome = "John";
    while (true){
      p.cacar();
      Thread.sleep(5000);
      p.comer();
      Thread.sleep(5000);
      p.dormir();
      Thread.sleep(5000);
      p.cacar();
      Thread.sleep(5000);
      p.cacar();
      Thread.sleep(5000);
      p.cacar();
      System.out.println("======================================");
      Thread.sleep(10000);
    }

  }
}
    // int idade = 18;

    // if (idade >= 18)
    //   System.out.println("Sim, pode dirigir");
    // else
    //   System.out.println("Não, não pode dirigir");

    // System.out.println(idade >= 18 ? "Sim" : "Não");