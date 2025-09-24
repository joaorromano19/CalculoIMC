import java.util.Scanner;

public class Calculadora {
    public static Double peso;
    public static Double altura;
    public static String opcao;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do{
            try{
                System.out.print("\nDigite o seu peso: ");
                peso = peso.parseDouble(scanner.nextLine().replace(",", ".")) ;
                if (peso <= 0) {
                   throw new IllegalArgumentException("Peso deve ser positivo!");
                   
                }

                System.out.print("Digite a sua altura: ");
                altura = altura.parseDouble(scanner.nextLine().replace(",", "."));

                if (altura <= 0) {
                   throw new IllegalArgumentException("Altura deve ser positivo!");
                }

                Double imc = peso / (altura * altura);
                  
                System.out.printf("Seu IMC é: %.2f\n", imc);
            
            }catch(NumberFormatException e){
                System.out.println("\nDigite somente numeros!");
                System.out.println("\n ========= Tente novamete ========= \n");
            }
            catch(IllegalArgumentException e){
                System.out.println("\n" + e.getMessage());
                System.out.println("\n ========= Tente novamete ========= \n");
            }

            System.out.print("\nDeseja continuar? (s)/(n) ");
            opcao = scanner.nextLine();
            

        }while (opcao.equals("s"));

        System.out.println("\nObrigado por usar a calculadora de IMC!");
        scanner.close();
    }
    
}