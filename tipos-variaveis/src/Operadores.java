public class Operadores 
{
    public static void main(String[] args)
    {
        String nomeCompleto = "Leonardo" + " Ferreira";
        String concatenacao = "?";
        int numero = 5;
        int num = 2;
        boolean condicao = true;
        int vlrPrincipal = 0;
        int vlrAuxiliar = 100;

        //Invertendo condicao
        condicao = !condicao;

        //Invertendo valores, nao funciona da mesma forma do negativo para o positivo
        numero = - numero;

        //negativo para o positivo
        numero =  numero * -1;

        // incrementando valores
        num = num + 8;
        num++;

        concatenacao = 1 + 1 + 1 + "1";
        //System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        //System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        //System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        //System.out.println(concatenacao);

        concatenacao = "1" + ( 1 + 1 + 1 );
        //System.out.println(concatenacao);

        //Ternario, pode ser feito com outros tipos de variaveis tambem
        String resultado = vlrPrincipal == vlrAuxiliar ? "Verdadeiro" : "Falso";

        System.out.println( nomeCompleto );
        System.out.println( concatenacao );
        System.out.println( numero );
        System.out.println( num );
        //Regra de impressao
        System.out.println( "Esta expressao incrementa e depois imprime: "+ ++num );
        System.out.println( "Esta expressao incrementa após a impressao: " + num++ );
        System.out.println( "O numero apos a expressao é: " + num );
        //Opetador de negacao
        System.out.println( "A condicao atual é: " + !condicao );
        //Retorno Ternario
        System.out.println("O resultado da comparacao é: ".concat( resultado )  );
    }
}
