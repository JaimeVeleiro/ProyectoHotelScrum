import java.util.Scanner;

public class Controlador {

    private String sNombre;

    Hotel miHotelControlador = new Hotel();

    public Controlador(){
        this.sNombre = "Controlador";
    }

    public boolean compCliente(){
        for (int i = 0; i < miHotelControlador.aClientes.length; i++){
            if ( miHotelControlador.aClientes[i] == null){
                String dni, nombre, apellidos, direccion, email, telefono, fechaNac;
                int edad;

                Scanner sc = new Scanner(System.in);
                System.out.println("DNI sin guion");
                dni = sc.nextLine();
                System.out.println("Nombre");
                nombre = sc.nextLine();
                System.out.println("Apellidos");
                apellidos = sc.nextLine();
                System.out.println("Direccion");
                direccion = sc.nextLine();
                System.out.println("Email");
                email = sc.nextLine();
                System.out.println("Telefono");
                telefono = sc.nextLine();
                System.out.println("Edad");
                edad = Integer.valueOf(sc.nextLine());
                System.out.println("Fecha Nac XX/XX/XXXX");
                fechaNac= sc.nextLine();

                miHotelControlador.addCliente(nombre, dni, apellidos, direccion, email, telefono, edad, fechaNac, i);
                return true;
                
            }
        }
        return false;
    }
    
    public String compRemoveCliente(){
        if (miHotelControlador.aClientes[0] == null){
            return "No hay ningun cliente dado de alta todavía";
            
        } else {
            String dni;
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca el DNI del cliente que desea eliminar");
            dni = sc.nextLine();

            if (miHotelControlador.removeCliente(dni)){
                return "Cliente borrado";
                
            } else {
                return "El DNI introducido no coincide con ninguno de los clientes";

            }
        }
    }

    public String showCliente(){
        if (miHotelControlador.aClientes[0] == null){
            return "No hay clientes en el hotel";
            
        } else{
            Scanner sc = new Scanner(System.in);
            System.out.println("DNI del cliente del que quiera hacer la consulta");
            String dni = sc.nextLine();

            return miHotelControlador.showCliente(dni);
        }
    }

    
    public boolean compPromocion(){
        for (int i = 0; i < miHotelControlador.aPromociones.length; i++){
            if ( miHotelControlador.aPromociones[i] == null){
                int edadMax, edadMin, descuento, duracion;

                Scanner sc = new Scanner(System.in);
                System.out.println("Edad maxima");
                edadMax = Integer.valueOf(sc.nextLine());
                System.out.println("Edad minima");
                edadMin = Integer.valueOf(sc.nextLine());
                System.out.println("Descuento");
                descuento = Integer.valueOf(sc.nextLine());
                System.out.println("Duracion");
                duracion = Integer.valueOf(sc.nextLine());
                
                miHotelControlador.addPromo(i + 1, edadMax, edadMin, descuento, duracion, i);

                return true;
            }
        }
        return false;
    }

    public String compRemovePromo(){
        if (miHotelControlador.aClientes[0] == null){
            return "No hay ninguna Promocion actualmente";
            
        } else {
            int codPromocion;
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca el Codigo de la Promocion que desea eliminar");
            codPromocion = Integer.valueOf(sc.nextLine());

            if (miHotelControlador.removePromo(codPromocion)){
                return "Promocion borrada";
                
            } else {
                return "El Codigo introducido no coincide con ninguna Promocion";

            }
        }
    }

    public String compShowPromos(){
        if (miHotelControlador.aPromociones[0] == null){
            return "No hay ninguna Promoción";

        } else{
            System.out.println("Codigo Promoción | Edad Máxima | Edad Mínima | Descuento (%) | Duración (Días)");

            for (int i = 0; i < miHotelControlador.aPromociones.length; i++){
                if (miHotelControlador.aPromociones[i] != null){
                    System.out.println(miHotelControlador.aPromociones[i].getCodPromocion() + " | " + miHotelControlador.aPromociones[i].getEdadMax() + " | " + 
                    miHotelControlador.aPromociones[i].getEdadMin() + " | " + miHotelControlador.aPromociones[i].getDescuento() + " | " + 
                    miHotelControlador.aPromociones[i].getDuracion());
                } 
            }
            return "Listo!!";
        }
    }

}