// Hotel.java
public class Hotel {
    private static final int maxClientes =1000;
    private static final int maxPromos =30;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private String codPostal;

    private Cliente[] aClientes = new Cliente[maxClientes];
    private Promociones[] aPromociones = new Promocion[maxPromos];

    public Hotel(){
        this.nombre = "Hotel Costa del Sol";
        this.direccion = "Calle falsa nº 123";
        this.telefono = "690 420 777";
        this.email = "hotelchingon@gmail.com";
        this.codPostal = "42069";

    }

    public boolean addCliente(String nombre, String dni, String apellidos, String direccion, String email, String telefono, int edad, String fechaNacimineto){
        for(int i=0; i<aClientes.length;i++){
            if(aClientes[i]== null){
                Cliente miCliente = new Cliente(dni,nombre,apellidos,direccion,email,telefono,edad,fechaNacimineto);
                aClientes[i] = miCliente;
                
                return true;
            }
        }
       
        return false;

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
        if (aClientes[0]== null){
            return "No hay clientes";
        }else{

        
        for(int i=0;i<aClientes.length;i++){
            if(dni.compareTo(aClientes[i].getDni())==0){
                return aClientes[i].getDni() + "|" + aClientes[i].getNombre() + "|" + aClientes[i].getApellidos()+ "|" + aClientes[i].getDireccion()
                + "|" + aClientes[i].getEdad()+ "|" + aClientes[i].getEmail()+ "|" + aClientes[i].getFechaNacimiento()+ "|" + aClientes[i].getTelefono();
            }
        }
    }
        return "No existe un cliente con ese DNI, comprueba que esta bien escrito";
    }

    public boolean addPromo(int edadMin, int edadMax , String duracion, String descuento,int codigoPromo){
        for(int i=0;i<aPromociones.length;i++){
            if(aPromociones[i]==null){
                Promociones nuevaPromocion = new Promociones (edadMin,edadMax,duracion,descuento,codigoPromo);
                aPromociones[i] = nuevaPromocion;
                return true;
            }

        }
        return false;
    }

    public boolean removePromo(int codigoPromo){
        String sCodigoPromo = String.valueOf(codigoPromo);
        String sCompCodigoPromo;

        for(int i = 0; i<aPromociones.length;i++){
            sCompCodigoPromo = String.valueOf(aPromociones[i].getCodigoPromo());

                if(sCompCodigoPromo.compareTo(sCodigoPromo) == 0){
                    aPromociones[i] == null;
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
