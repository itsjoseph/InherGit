public class claseHija extends clasePadre {
    private byte numeroDeHijos;
    private int nuemeroDeCasas;

    public claseHija(byte numeroDeHijos, int nuemeroDeCasas) {
        super(5, 1.92, true, 'h', (byte) 20);
        this.numeroDeHijos = numeroDeHijos;
        this.nuemeroDeCasas = nuemeroDeCasas;
    }

    private void calcularCasas() {
        System.out.println("Aqui calculamos las casas:");
    }

    public byte getNumeroDeHijos() {
        return numeroDeHijos;
    }

    public void setNumeroDeHijos(byte numeroDeHijos) {
        this.numeroDeHijos = numeroDeHijos;
    }

    public int getNuemeroDeCasas() {
        return nuemeroDeCasas;
    }

    public void setNuemeroDeCasas(int nuemeroDeCasas) {
        this.nuemeroDeCasas = nuemeroDeCasas;
    }

    @Override
    public String toString() {
        return super.toString() + " claseHija: " + " numeroDeHijos: " + numeroDeHijos + ", nuemeroDeCasas: " + nuemeroDeCasas;
    }
}
