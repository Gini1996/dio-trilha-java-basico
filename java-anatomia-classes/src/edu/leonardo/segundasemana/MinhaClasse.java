package edu.leonardo.segundasemana;
public class MinhaClasse 
{
    //Main, função inicializadora
    public static void main(String[] args) 
    {
        //Aula 2 - Explicando Variaveis
        //Final torna a variavel imutavel
        final String BR = "Brasil";

        //Padroes de variaveis aceitos pelo Java
        final int anoDoCurso = 2023;
        final int NOTA_DO_CURSO = 10;
        
        //Aula 3 - Metodos
        String primeiroNome = "Leonardo";
        String segundoNome = "Ferreira";

        String nomeCompleto = nomeCompleto( primeiroNome, segundoNome );

        System.out.println( "Primeira Aula de Anatomia Java" );
        System.out.println( "Aula 2, explicando variáveis. \nPais: " +  BR  + " \nAno: " + anoDoCurso + " \nCurso nota: " + NOTA_DO_CURSO );
        System.out.println( nomeCompleto );
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome)
    {
        //Concat, função para concatenar valores, pode ser utilizado também o operador +
        return "Aula 3, criando e utilizando metodos. \nO nome do Dev eh: " + primeiroNome.concat(" ").concat( segundoNome );
    }
}
