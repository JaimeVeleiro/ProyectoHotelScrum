import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Hotel miHotelMain = new Hotel();
        Scanner sc = new Scanner(System.in);
        int opcion = 1, edad, edadMax, edadMin, descuento, duracion, codPromocion;
        String dni, nombre, apellidos, direccion, email, telefono, fechaNac;
        
        while (opcion != 6){
            System.out.println("1.- Añadir Cliente\n2.- Eliminar Cliente\n3.- Consultar Cliente\n4.- Añadir Promoción\n5.- Eliminar Promoción\n6.-Salir");
            opcion = Integer.valueOf(sc.nextLine());

            switch (opcion){
                case 1:
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

                    if (miHotelMain.addCliente(nombre, dni, apellidos, direccion, email, telefono, edad, fechaNac)){
                        System.out.println("Cliente Añadido!!");
                    } else {
                        System.out.println("Error al añadir al cliente");
                    }
                    
                    break;
                case 2:
                    System.out.println("Indique el DNI de la cliente que desea borrar");
                    dni = sc.nextLine();

                    if (miHotelMain.removeCliente(dni)){
                        System.out.println("Cliente eliminado correctamente");
                    } else {
                        System.out.println("Error al eliminar cliente");
                    }

                    break;
                case 3:
                    System.out.println("Dime el DNI del cliente que quieras consultar");
                    dni = sc.nextLine();

                    System.out.println(miHotelMain.showCliente(dni));
                    break;
                case 4:
                    System.out.println("CodPromocion 2 digitos");
                    codPromocion = Integer.valueOf(sc.nextLine());
                    System.out.println("Edad maxima de la promo");
                    edadMax = Integer.valueOf(sc.nextLine());
                    System.out.println("Edad minima de la promo");
                    edadMin = Integer.valueOf(sc.nextLine());
                    System.out.println("Descuento");
                    descuento = Integer.valueOf(sc.nextLine());
                    System.out.println("Duracion en dias");
                    duracion = Integer.valueOf(sc.nextLine());

                    if (miHotelMain.addPromo(codPromocion, edadMax, edadMin, descuento, duracion)){
                        System.out.println("Promoción añadida correctamente");
                    } else {
                        System.out.println("Error al añadir la Promoción");
                    }

                    break;
                case 5:
                    System.out.println("Indique el Código de la Promoción que desea eliminar");
                    codPromocion = Integer.valueOf(sc.nextLine());

                    if (miHotelMain.removePromo(codPromocion)){
                        System.out.println("Promoción eliminadad correctamente");
                    } else {
                        System.out.println("Error al eliminar la Promoción");
                    }
                case 6:
                    System.out.println("Hasta la próxima!!");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
        sc.close();
    }
}