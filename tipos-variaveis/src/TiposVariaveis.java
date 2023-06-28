public class TiposVariaveis {
    public static void main(String[] args) throws Exception 
    {
       String meuNome = "Leonardo Ferreira";
       double salarioMinimo = 2500;
       int idade = 27;
       float peso = 105.5F;

       short numeroCurto = 1;
       int numeroNormal = numeroCurto;
       //Casting de int para short pois int possui tamanho base maior, gerando assim erro caso não seja aplicada a conversão
       short numeroCurto2 = (short) numeroNormal;

       int numero = 5;
       numero = 10;

       //Final torna a variavel constante
       //Variaveis final utilizam Caixa Alta
       final double VALOR_DE_PI = 3.14;

       System.out.println("Olá, eu sou ".concat(meuNome).concat("\nTenho ") + idade + " anos.".concat(" \nPeso atualmente ") + peso + " quilos.");
       System.out.println("O custo de vida medio em meu país é de: R$" + salarioMinimo);
       System.out.println("Imprimindo um numero convertido: " + numeroCurto2);
       System.out.println("Variavel comum: " + numero);
       System.out.println("PI é imutavel assim como sua variavel: " + VALOR_DE_PI);
    }
}
