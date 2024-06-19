import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    System.out.println("Preencha os requisitos");
    System.out.println(" ");
System.out.println("Digite seu  nome:");
String nome = sc.next();
    System.out.println("Digite seu sobrenome");
    String sobrenome = sc.next();
    System.out.println("O seu nome completo é : " + nome + " " + sobrenome);
    System.out.println("Digite sua idade:");
    int idade = sc.nextInt();
    System.out.println("Digite sua Altura em Centímetros :");
    double Altura = sc.nextDouble();
    System.out.println("Digite sua Massa em Kg:");
    int Massa = sc.nextInt();
double AlturaMetros = Altura/100;
    double AlturaQuadrado = AlturaMetros * AlturaMetros;
    double MassaDividida = Massa / AlturaQuadrado;

    System.out.println(" ");
    System.out.println("Confirme suas Alternativas");
      System.out.println(" ");
    System.out.println("Seu nome completo é : " + nome + " " + sobrenome);
    System.out.println("Sua Idade é:" + " " + idade);
    System.out.println("Sua Massa é:" + " " + Massa);
    System.out.println(Altura + " " + "centimetros");
    System.out.println("Seu IMC é:" + " " + MassaDividida);
    System.out.println(" ");
    sc.close();
  }
}
