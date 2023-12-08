public class Promociones {
	private int codPromocion;
	private int edadMax;
	private int edadMin;
	private int descuento;
	private int duracion;


public Promociones(int codPromocion, int edadMax, int edadMin, int descuento, int duracion){
    this.codPromocion = codPromocion;
    this.edadMax = edadMax;
    this.edadMin = edadMin;
    this.descuento = descuento;
    this.duracion = duracion;
}

public int getEdadMax() {
    return edadMax;
}


public void setEdadMax(int edadMax) {
    this.edadMax = edadMax;
}


public int getEdadMin() {
    return edadMin;
}


public void setEdadMin(int edadMin) {
    this.edadMin = edadMin;
}


public int getDescuento() {
    return descuento;
}


public void setDescuento(int descuento) {
    this.descuento = descuento;
}


public int getDuracion() {
    return duracion;
}


public void setDuracion(int duracion) {
    this.duracion = duracion;
}

public int getCodPromocion() {
    return codPromocion;
}

public void setCodPromocion(int codPromocion) {
    this.codPromocion = codPromocion;
}
    
}
