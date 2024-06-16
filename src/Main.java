import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean run = true;
        double[] numeros = new double[10];
        int contador = 0;

        // Ler números e adiconar no vetor
        while (run){
            System.out.println("Digite um numero: ");
            double n = sc.nextDouble();
            // Finalizar o programa
            if (contador >= numeros.length){
                System.out.println("Valor maximo de números atingido, finalizando a inserção");
                run = false;
            }
            else if (n == 0){
                System.out.println("Inserção de números finalizada");
                run = false;
            }
            // Adiconar o número a array
            else {
                numeros[contador] = n;
                contador ++;
            }
        }

        static void encontrarValorNoVetor (double[] numeros){
            Scanner sc = new Scanner(System.in);
            System.out.println("\nDigite um número para ser verificado no vetor: ");
            double valor = sc.nextDouble();
            int encontrado = 0;
            for (int i=0; i < numeros.length; i++){
                if (valor == numeros[i]){
                    encontrado ++;
                }
            }
            System.out.println("O número " + valor + " foi encontrado " + encontrado + " vezes no vetor.");
        }

        // Encontrar número no vetor
        encontrarValorNoVetor(numeros);

        // Calcular média
        double media = calcularMedia(numeros);
        System.out.println("\nA média é " + media);

        // Mostra numeros iguais ou maior que média
        maiorOuIgualMedia(numeros, media);

    }

    static double calcularMedia (double[] numeros){
        double media = 0;
        double somaDosNumeros = 0;
        for (int i=0; i < numeros.length; i++){
            somaDosNumeros += numeros[i];
        }
        media = somaDosNumeros / numeros.length;
        return media;
    }

    static void maiorOuIgualMedia (double[] numeros, double media){
        for (int i=0; i < numeros.length; i++){
            if (numeros[i] >= media){
                System.out.println("Valor maior ou igual a média: " + numeros[i]);
            }
        }
    }
}