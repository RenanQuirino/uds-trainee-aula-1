import java.util.Scanner;
import java.util.function.Function;
public class Main {
    public static String converterDecimalParaRomano(int numero) {
        switch (numero) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            case 10:
                return "X";

            default:
                return "numero invalido digite um numero de 1 a 10";

        }
    }

    public static void main(String[] args) {


        System.out.println("Hello World");
        String nome = "Renan Quirino";
        Integer idade = 22;
        Boolean sexoFeminino = false;
        Double peso = 95.2;
        System.out.println(nome + " " + idade);
        System.out.println("Ola, meu nome é " + nome + " tenho " + idade + " anos de idade meu peso é " + peso + " ");
        if (idade <= 18)
            System.out.println("Novinho(a)");
        else if (idade >= 18 && idade <= 30)
            System.out.println("Tiozinho");
        else if (idade > 30)
            System.out.println("Tiozão");

        int diaSemana = 0;

        switch (diaSemana) {
            case 0:
                System.out.println("Domingo");
                break;
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("sexta");
                break;
            case 6:
                System.out
                        .println("sabado");
                break;

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero");
        Integer entrada = scanner.nextInt();

        System.out.println(converterDecimalParaRomano(entrada));

        for (int i = 1; i <= 10; i++) {
            String valorConvertido = converterDecimalParaRomano(i);
            System.out.println(valorConvertido);

        }
        int i = 1;
        while (i <= 10) {
            String valorConvertido = converterDecimalParaRomano(i);
            System.out.println(valorConvertido);
            i++;

        }

        Double saldo = 1500.0;
        System.out.println(saldo);

        System.out.println("Menu");
        System.out.println("[1] - Pistolas");
        System.out.println("[2] - Metralhadoras");
        System.out.println("[3] - Rifles");
        System.out.println("[4} - Submetralhadoras");
        System.out.println("[5] - Arma Branca");
        int menu = scanner.nextInt();
        switch (menu) {
            case 1:
                System.out.println("[1] - Glock          $100");
                System.out.println("[2] - Desert Eagle   $150");
                System.out.println("[3} - Berreta        $200");
                break;
            case 2:
                System.out.println("[1] - M416           $350");
                System.out.println("[2] - AKM            $250");
                System.out.println("[3] - AUG            $500");
                break;
            case 3:
                System.out.println("[1] - AWM            $700");
                System.out.println("[2] - Kar98          $550");
                System.out.println("[3] - Winchester     $400");
                break;
            case 4:
                System.out.println("[1] - Ump            $200");
                System.out.println("[2] - Uzi            $100");
                System.out.println("[3] - Vector         $150");
                break;
            case 5:
                System.out.println("[1] - Faca           $50");
                System.out.println("[2] - Pé de cabra    $20");
                System.out.println("[3] - Espada         $100");
                break;

        }

    }

}