public class Usuario {
    public static void main(String[] args) throws Exception {
        SmarthTv smarthTv = new SmarthTv();
        
        System.out.println("Estado atual: " + smarthTv.ligada);
        smarthTv.ligarTv();
        System.out.println("Estado atual: " + smarthTv.ligada);

        System.out.println("Canal atual: " + smarthTv.canal);

        smarthTv.mudarCanal(34);
        System.out.println("Canal atual: " + smarthTv.canal);

        smarthTv.aumentarCanal();
        smarthTv.diminuirCanal();
        System.out.println("Canal atual: " + smarthTv.canal);

        System.out.println("Volume atual: " + smarthTv.volume);
        smarthTv.aumentarVolume();
        smarthTv.aumentarVolume();
        smarthTv.diminuirVolume();

    }
}
