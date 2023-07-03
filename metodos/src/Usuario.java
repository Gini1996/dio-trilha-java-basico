public class Usuario 
{
    public static void main(String[] args) throws Exception 
    {
        //Instanciando a classe SmarTv dentro de uma variavel no metodo principal
        SmartTv smartTv = new SmartTv();
    
        System.out.println( "TV Ligada ?    " + smartTv.ligada );
        System.out.println( "Canal Atual ?  " + smartTv.canal );
        System.out.println( "Volume Atual ? " + smartTv.volume );

        smartTv.ligar();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(13);
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
 
        System.out.println( "\nNovo Status do aparelho"        );
        System.out.println( "TV Ligada ?    " + smartTv.ligada );
        System.out.println( "Canal Atual ?  " + smartTv.canal  );
        System.out.println( "Volume Atual ? " + smartTv.volume );
    }
}
