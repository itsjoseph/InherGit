import java.util.Objects;

public class ClaseHijastra  extends clasePadre{
    private int nuemeroDeHijastros;
    private double estaturasDeHijastros;
    private boolean jasles;

    public ClaseHijastra(int nuemeroDeHijastros, double estaturasDeHijastros, boolean jasles) {
        this.nuemeroDeHijastros = nuemeroDeHijastros;
        this.estaturasDeHijastros = estaturasDeHijastros;
        this.jasles = jasles;
    }

    public int getNuemeroDeHijastros() {
        return nuemeroDeHijastros;
    }

    public void setNuemeroDeHijastros(int nuemeroDeHijastros) {
        this.nuemeroDeHijastros = nuemeroDeHijastros;
    }

    public double getEstaturasDeHijastros() {
        return estaturasDeHijastros;
    }

    public void setEstaturasDeHijastros(double estaturasDeHijastros) {
        this.estaturasDeHijastros = estaturasDeHijastros;
    }

    public boolean isJasles() {
        return jasles;
    }

    public void setJasles(boolean jasles) {
        this.jasles = jasles;
    }

    @Override
    public String toString() {
        return "ClaseHijastra{" +
                "nuemeroDeHijastros=" + nuemeroDeHijastros +
                ", estaturasDeHijastros=" + estaturasDeHijastros +
                ", jasles=" + jasles +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClaseHijastra)) return false;
        if (!super.equals(o)) return false;
        ClaseHijastra that = (ClaseHijastra) o;
        return getNuemeroDeHijastros() == that.getNuemeroDeHijastros() &&
                Double.compare(that.getEstaturasDeHijastros(), getEstaturasDeHijastros()) == 0 &&
                isJasles() == that.isJasles();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNuemeroDeHijastros(), getEstaturasDeHijastros(), isJasles());
    }
}
