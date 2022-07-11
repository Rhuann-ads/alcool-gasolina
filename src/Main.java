import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        menu(sc);


        calcular(sc);
        sc.close();
    }

    private static void menu(Scanner sc) {

        int opcao;

        System.out.println("----------MENU-----------");
        System.out.println("1 - Calcular");
        System.out.println("2 - Sair");
        System.out.print("\nDigite a opção: ");
        opcao = sc.nextInt();

        try {
            if(opcao == 1){
                calcular(sc);
            }else if(opcao == 2){
                System.exit(0);
            }else{
                System.out.println("\nOpção invalida\n");
                menu(sc);
            }
        }catch (InputMismatchException e){
            System.out.println("\nOpção invalida\n");
        }
        finally {
            menu(sc);
        }

    }

    private static void calcular(Scanner sc) {
        double alcool;
        double gasolina;
        int opcao;

        System.out.println("Informe o valor da alcool: ");
        alcool = sc.nextDouble();
        System.out.println("Informe o valor da gasolina: ");
        gasolina = sc.nextDouble();

        double calculo = alcool / gasolina;

        if(calculo < 0.7){
            System.out.println("\n Abasteça com alcool \n");
        }else{
            System.out.println("\n Abasteça com gasolina \n");
        }

        System.out.println("---------MENU----------");
        System.out.println("1 - Calcular novamente ");
        System.out.println("2 - Sair ");
        opcao = sc.nextInt();

        if(opcao == 1){
            calcular(sc);
        }else{
            System.exit(0);
        }

    }
}