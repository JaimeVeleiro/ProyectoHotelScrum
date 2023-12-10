import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Controlador miControlador = new Controlador();
        Scanner sc = new Scanner(System.in);
        int opcion = 1;
        
        while (opcion != 7){
            System.out.println("1.- Añadir Cliente\n2.- Eliminar Cliente\n3.- Consultar Cliente\n4.- Añadir Promoción\n5.- Eliminar Promoción\n6.-Salir");
            opcion = Integer.valueOf(sc.nextLine());

            switch (opcion){
                case 1:
                    if (miControlador.compCliente()){
                        System.out.println("Cliente Añadido!!");
                    } else {
                        System.out.println("No hay espacio para mas clientes, pruebe a borrar alguno si es posible");
                    }

                    break;
                case 2:
                    System.out.println(miControlador.compRemoveCliente());

                    break;
                case 3:
                    System.out.println(miControlador.showCliente());

                    break;
                case 4:
                    if (miControlador.compPromocion()){
                        System.out.println("Promocion Añadida!!");
                    } else {
                        System.out.println("No hay espacio para mas promociones, pruebe a borrar alguna si es posible");
                    }

                    break;
                case 5:
                    System.out.println(miControlador.compRemoveCliente());
                    
                case 6:
                    System.out.println(miControlador.compShowPromos());
                break;
                case 7:
                System.out.println("Hasta la próxima!!");

                break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
        sc.close();
    }
}