public class ClientePremium extends Persona implements Tiquete{

    private int numeroTarjeta;
    
    @Override
    public float calcularCosto(float costoBase){

        float costoReal = (float) (costoBase - (costoBase*0.50));
        return costoReal;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getNumeroTarjeta() {
        return this.numeroTarjeta;

    }
}
