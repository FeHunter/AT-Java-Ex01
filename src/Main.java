import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean run = true;
        double[] numeros = new double[10];
        int contador = 0;

        // Ler números e adiconar no vetor
        while (run){
            // Ler número
            double n = lerValorDouble("Digite um numero: ","valor invalido");

            // Adiconar o número a array
            numeros[contador] = n;
            contador ++;

            // Finalizar o programa ao atingir limite
            run = finalizarProgramaPorLimite(contador, numeros.length);

            // Finaliar com zero
            if (n == 0){
                run = false;
            }
        }

        // Encontrar número no vetor
        encontrarValorNoVetor(numeros, contador);

        // Calcular média
        double media = calcularMedia(numeros, contador);
        System.out.println("\nA média é " + media);

        // Mostra numeros iguais ou maior que média
        maiorOuIgualMedia(numeros, media);

    }

    static boolean finalizarProgramaPorLimite (int contador, int max){
        if (contador == max){
            System.out.println("Valor maximo de números atingido, finalizando a inserção");
            return false;
        }else {
            return true;
        }
    }

    static void encontrarValorNoVetor (double[] numeros, int contagem){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDigite um número para ser verificado no vetor: ");
        double valor = sc.nextDouble();
        int encontrado = 0;
        for (int i=0; i < contagem; i++){ // alterar para tamanho de números digitados
            if (valor == numeros[i]){
                encontrado ++;
            }
        }
        System.out.println("O número " + valor + " foi encontrado " + encontrado + " vezes no vetor.");
    }

    static double calcularMedia (double[] numeros, int contagem){
        double media = 0;
        double somaDosNumeros = 0;
        for (int i=0; i < numeros.length; i++){
            somaDosNumeros += numeros[i];
        }
        media = somaDosNumeros / contagem; // alterar para tamanho de números digitados
        return media;
    }

    static void maiorOuIgualMedia (double[] numeros, double media){
        for (int i=0; i < numeros.length; i++){
            if (numeros[i] >= media){
                System.out.println("Valor maior ou igual a média: " + numeros[i]);
            }
        }
    }

    static double lerValorDouble (String msg, String erroMsg){
        Scanner sc = new Scanner(System.in);
        double valor = -1;
        do {
            try {
                System.out.print(msg);
                valor = sc.nextInt();
            }catch (Exception e){
                System.out.println(erroMsg);
                sc.next(); // limpar entrada
            }
        }while (valor < 0);

        return valor;
    }
}