package exemplos.exemplo04;

public  class  Relogio {
    private   int   hora , minuto , segundo ;

    public  void  Relogio ( int   hora , int   minuto , int   segundo ) {
        setHora ( hora );
        setMinuto ( minuto );
        setSegundo ( segundo );
    }  
        
}

    public   int   getHora () {
          hora de retorno ;
    }

    public   void   setHora ( int   hora ) {
        if ( hora >= 0 && hora < 24 ) {
            isso . hora = hora ;
        }
    }

    public   int   getMinuto () {
        voltar   minuto ;
    }

    public   void   setMinuto ( int   minuto ) {
        if ( minuto >= 0 && minuto < 60 ) {
            isso . minuto = minuto ;
        }  