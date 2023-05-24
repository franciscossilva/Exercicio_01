import java.util.Scanner;
public class ControleDePeso {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            double peso, excesso, multa;
        System.out.print("Digite o peso do peixe: ");
        peso = scanner.nextDouble();
        if (peso>50){
            excesso=peso-50;
            multa=excesso*4;
            System.out.println("Voce excedeu o limite de peso " +excesso+ "e deve pagar : "+multa);}
             else  {
                 System.out.println("voce nao excedeu o limite de peso");
        }}}
