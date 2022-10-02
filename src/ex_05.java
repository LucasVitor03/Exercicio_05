import java.util.Scanner;

public class ex_05 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        float metros = 0.00f;
        float centimetros = 0.00f;

        System.out.println("Digite quantos metros para ser convertido: ");
        metros = sc.nextFloat();

        centimetros = metros * 100;

        System.out.println(metros + " metros" + " em centímetros: " +  centimetros);

        sc.close();


    }
}
