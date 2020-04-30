import java.util.Objects;

public class clasePadre {
    private int numCarros;
    private double estatura;
    private boolean soltero;
    private char sexo;
    private byte edad;

    public clasePadre() {
    }

    public clasePadre(int numCarros, double estatura, boolean soltero, char sexo, byte edad) {
        this.numCarros = numCarros;
        this.estatura = estatura;
        this.soltero = soltero;
        this.sexo = sexo;
        this.edad = edad;
    }

    private void calcularEdad() {
        System.out.print("Aqui calculamos la edad");
    }

    public void mfkmf(){
        for (int i = 0; i < 10 ; i++) {
            if (i == 6) {
                break;
            }else {
                System.out.println("\t\tVuelta: " + i);
                calcularEdad();
            }
        }
    }



    @Override
    public String toString() {
        return "clasePadre: " + " numCarros=" + numCarros + ", estatura: " + estatura + ", soltero: " + soltero + ", sexo:" + sexo + ", edad:" + edad;
    }

    public int getNumCarros() {
        return numCarros;
    }

    public void setNumCarros(int numCarros) {
        this.numCarros = numCarros;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public boolean isSoltero() {
        return soltero;
    }

    public void setSoltero(boolean soltero) {
        this.soltero = soltero;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof clasePadre)) return false;
        clasePadre that = (clasePadre) o;
        return getNumCarros() == that.getNumCarros() &&
                Double.compare(that.getEstatura(), getEstatura()) == 0 &&
                isSoltero() == that.isSoltero() &&
                getSexo() == that.getSexo() &&
                getEdad() == that.getEdad();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumCarros(), getEstatura(), isSoltero(), getSexo(), getEdad());
    }
}
