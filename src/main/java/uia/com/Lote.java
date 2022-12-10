package uia.com.inventarios;

public class Lote extends InfoUIA{

    private String fechaIngreso = "";
    private Proveedor proveedor = new Proveedor();
    private Embalaje embalajePrimario = new Embalaje();
    private CondicionesAlmacenamiento condicionesAlmacenamiento = new CondicionesAlmacenamiento();


    public Lote() {
        super();
    }

    public Lote(String idLote, String descLote, String cantidad, String fechaIngreso, String idProv, String descProv,
                String tipo, String temperatura, String humendad)
    {
        super("Lote", idLote, descLote, cantidad, "Ingresado");
        this.fechaIngreso = fechaIngreso;
        proveedor.setName(descLote);
        proveedor.setId(idProv);
        condicionesAlmacenamiento.setTipo(tipo);
        condicionesAlmacenamiento.setTemperatura(temperatura);
        condicionesAlmacenamiento.setHumedad(humendad);
       // embalajePrimario.largo(tipoE);

    }

    public Embalaje getEmbalajePrimario() {
        return embalajePrimario;
    }

    public void setEmbalajePrimario(Embalaje embalajePrimario) {
        this.embalajePrimario = embalajePrimario;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }


    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public CondicionesAlmacenamiento getCondicionesAlmacenamiento() {
        return condicionesAlmacenamiento;
    }

    public void setCondicionesAlmacenamiento(CondicionesAlmacenamiento condicionesAlmacenamiento) {
        this.condicionesAlmacenamiento = condicionesAlmacenamiento;
    }
}
