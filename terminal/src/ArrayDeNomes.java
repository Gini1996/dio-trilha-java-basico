import java.util.*; 

public class ArrayDeNomes
{
    public static void main(String[] args)
    {
    
        Scanner sc = new Scanner(System.in);
      	String[] nomes = new String[10];
		
		for(int i=0 ; i<10 ; i++)
		{
			nomes[i] = sc.next();
			
			if( i == 2 || i == 6 || i == 8 )
			   System.out.println( "O nome é: " + nomes[i] );
		}

        sc.close();
    	
    }
}