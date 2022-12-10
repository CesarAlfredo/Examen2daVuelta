package uia.com.inventarios;

public class Volumen {
    private String largo;
    private String ancho;
    private String alto;
    private String volumen;

    public Volumen(){

    }

    public Volumen(String largo, String ancho, String alto, String volumen) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        this.volumen = volumen;
    }

    public String getLargo() {
        return largo;
    }

    public void setLargo(String largo) {
        this.largo = largo;
    }

    public String getAncho() {
        return ancho;
    }

    public void setAncho(String ancho) {
        this.ancho = ancho;
    }

    public String getAlto() {
        return alto;
    }

    public void setAlto(String alto) {
        this.alto = alto;
    }

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Volumen{");
        sb.append("largo='").append(largo).append('\'');
        sb.append(", ancho='").append(ancho).append('\'');
        sb.append(", alto='").append(alto).append('\'');
        sb.append(", volumen='").append(volumen).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
