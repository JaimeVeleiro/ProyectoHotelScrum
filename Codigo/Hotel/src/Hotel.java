// Hotel.java
public class Hotel {
    private static final int maxClientes =1000;
    private static final int maxPromos =30;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private String codPostal;

    public Clientes[] aClientes = new Clientes[maxClientes];
    public Promociones[] aPromociones = new Promociones[maxPromos];

    public Hotel(){
        this.nombre = "Hotel Costa del Sol";
        this.direccion = "Calle falsa nยบ 123";
        this.telefono = "690 420 777";
        this.email = "hotelchingon@gmail.com";
        this.codPostal = "42069";

    }

    public void addCliente(String nombre, String dni, String apellidos, String direccion, String email, String telefono, int edad, String fechaNacimineto, int i){
       
        Clientes miCliente = new Clientes(dni,nombre,apellidos,direccion,email,telefono,edad,fechaNacimineto);
        aClientes[i] = miCliente;
    
        
    }

    public boolean removeCliente(String dni){
        for(int i=0;i<aClientes.length;i++){
            if (dni.compareTo(aClientes[i].getDni())== 0){
                aClientes[i]= null;
                
                return true;
            }
        }
        return false;

    }

    public String showCliente(String dni){
        for(int i=0;i<aClientes.length;i++){
            
            if(dni.compareTo(aClientes[i].getDni())==0){
                
                if (aPromociones[0] != null){
                    String[] a = new String[maxPromos];
                    int[] b = new int[maxPromos];
                    int k = 0;
                    
                    for (int j = 0; j < aPromociones.length && aPromociones[j] != null; j++){
                        
                        if (aClientes[i].getEdad() <= aPromociones[j].getEdadMax() && aClientes[i].getEdad() >= aPromociones[j].getEdadMin()){
                            a[k] = String.valueOf(aPromociones[j].getCodPromocion());
                            b[k] = aPromociones[j].getDescuento();
                            //aClientes[i].setPromocion(aPromociones[j].getCodPromocion());
                            k++;
                        }
                        
                    }
                    
                    if (a[0] == null){
                        aClientes[i].setPromocion(0);
                        
                    } else if (a[1] == null){
                        
                        aClientes[i].setPromocion(Integer.valueOf(a[0]));
                    } else {
                        
                        int iMax = 0;
                        
                        for (int x = 0; x < a.length && a[x] != null; x++){
                            
                            if (iMax < b[x]){
                                iMax = x;
                            }
                        }
                        aClientes[i].setPromocion(Integer.valueOf(a[iMax]));
                    }
                    
                }

                if (aPromociones[0] != null){
                    int z = Integer.valueOf(aClientes[i].getPromocion()) - 1;

                    return "Datos CLiente:\n" + aClientes[i].getDni() + "|" + aClientes[i].getNombre() + "|" + aClientes[i].getApellidos()+ "|" + aClientes[i].getDireccion()
                    + "|" + aClientes[i].getEdad()+ "|" + aClientes[i].getEmail()+ "|" + aClientes[i].getFechaNac()+ "|" + aClientes[i].getTelefono() 
                    + "|" + aClientes[i].getPromocion() + "\nMejor Promocion:\nCodigo " + aPromociones[z].getCodPromocion() + " | Descuento " + aPromociones[z].getDescuento() 
                    + "% | Duracion (Dias) " + aPromociones[z].getDuracion();
                }

                return aClientes[i].getDni() + "|" + aClientes[i].getNombre() + "|" + aClientes[i].getApellidos()+ "|" + aClientes[i].getDireccion()
                + "|" + aClientes[i].getEdad()+ "|" + aClientes[i].getEmail()+ "|" + aClientes[i].getFechaNac()+ "|" + aClientes[i].getTelefono() 
                + "|0";
            }
        }
    
        return "No existe un cliente con ese DNI, comprueba que esta bien escrito";
    }

     public boolean promCliente(int edad){

        return false;
        }

    public void addPromo(int edadMin, int edadMax , int duracion, int descuento,int codigoPromo, int i){
        
        Promociones nuevaPromocion = new Promociones (edadMin,edadMax,duracion,descuento,codigoPromo);
        aPromociones[i] = nuevaPromocion;      
    }


    public boolean removePromo(int codigoPromo){
        String sCodigoPromo = String.valueOf(codigoPromo);
        String sCompCodigoPromo;

        for(int i = 0; i<aPromociones.length;i++){
            sCompCodigoPromo = String.valueOf(aPromociones[i].getCodPromocion());

                if(sCompCodigoPromo.compareTo(sCodigoPromo) == 0){
                    aPromociones[i] = null;
                    return true;
                }
        }
        return false;
    }















    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodPostal() {
        return this.codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }
    

    
}