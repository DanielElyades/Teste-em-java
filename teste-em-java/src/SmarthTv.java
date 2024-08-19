public class SmarthTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligarTv(){
        ligada = true;
    }
    public void desligarTv(){
        ligada = false;
    }
    public int mudarCanal(int canal){
        return this.canal = canal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
}