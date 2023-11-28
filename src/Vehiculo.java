
public class Vehiculo {
    int numeroMatricula;
    String modelo;
    String marca;
    String fecha;

    public Vehiculo() {
    }

    public Vehiculo(int numeroMatricula, String modelo, String marca, String fecha) {
        this.numeroMatricula = numeroMatricula;
        this.modelo = modelo;
        this.marca = marca;
        this.fecha = fecha;
    }

    public int getnumeroMatricula() {
        return numeroMatricula;
    }

    public void setnumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getmodelo() {
        return modelo;
    }

    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }

    public String getmarca() {
        return marca;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    public String getfecha() {
        return fecha;
    }

    public void setfecha(String fecha) {
        this.fecha = fecha;
    }
}


