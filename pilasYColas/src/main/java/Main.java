import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String optionExit;
        String optionUserMenu;
        do {
           menu();
            Scanner scanOptionUser = new Scanner(System.in);
            optionUserMenu = scanOptionUser.nextLine();
            switch (optionUserMenu){
                case "1":
                    Pila pila = new Pila();
                    do {
                        menuPila();
                        Scanner scanMenuPila = new Scanner(System.in);
                        int optionMenuPila = scanMenuPila.nextInt();
                        if (!(optionMenuPila == 5)){
                            pila(optionMenuPila,pila);
                        }else {
                            optionUserMenu = "S";
                        }
                    }while (!optionUserMenu.equals("S"));
                    break;
                case "2":
                    Cola cola = new Cola();
                    do {
                        menuCola();
                        Scanner scanMenuCola = new Scanner(System.in);
                        int optionMenuCola = scanMenuCola.nextInt();
                        if (!(optionMenuCola == 5)){
                            cola(optionMenuCola,cola);
                        }else {
                            optionUserMenu = "S";
                        }
                    }while (!optionUserMenu.equals("S"));
                    break;
                case "5":
                    System.out.println("Saliendo del menu...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            System.out.println(" QUIERES SALIR DEL PROGRAMA? ");
            System.out.println("\t SI = [s]\tNO = [n] : ");
            System.out.print("-> ");
            Scanner scanner = new Scanner(System.in);
            optionExit = scanner.nextLine();
            optionExit.toUpperCase();
        }while (!optionExit.toUpperCase().equals("S"));
    }

    public static void menu(){
        System.out.println("\n########################################################");
        System.out.println("\tCREACION DE PILAS Y COLAS");
        System.out.println("\tELIGE QUE ESTRUCTURA CREAR");
        System.out.println("\t1) Pila ");
        System.out.println("\t2) Cola");
        System.out.println("\t5) Salir");
        System.out.println("########################################################");
        System.out.print("-> ");
    }
    public static void menuPila(){
        System.out.println("\n=======================================================");
        System.out.println("\t\tPILA");
        System.out.println("\tMetodos de la Pila:");
        System.out.println(" 1) Peek");
        System.out.println(" 2) Push");
        System.out.println(" 3) Pop");
        System.out.println(" 4) Tamanio de la Pila");
        System.out.println(" 5) Salir");
        System.out.println("=======================================================");
        System.out.print("-> ");
    }
    public static void menuCola(){
        System.out.println("\n=======================================================");
        System.out.println("\t\tCOLA");
        System.out.println("\tMetodos de la Cola:");
        System.out.println(" 1) Peek");
        System.out.println(" 2) Enqueue");
        System.out.println(" 3) Dequeue");
        System.out.println(" 4) Tamanio de la Cola");
        System.out.println(" 5) Salir");
        System.out.println("=======================================================");
        System.out.print("-> ");
    }

    public static void pila(int opcion, Pila pila){
        switch (opcion){
            case 1:
                System.out.println("\n\t#################################");
                System.out.println("\tElemento superior de la pila: " + pila.peek());
                System.out.println("\n\t#################################");
                break;
            case 2:
                System.out.println("Introduzca el valor del nuevo elemento: ");
                Scanner scanPushPila = new Scanner(System.in);
                Object valorElemento = scanPushPila.nextLine();
                pila.push(valorElemento);
                break;
            case 3:
                System.out.println("\n\t#################################");
                System.out.println("\tElemento eliminado: " + pila.pop());
                System.out.println("\n\t#################################");
                break;
            case 4:
                System.out.println("\n\t#################################");
                System.out.println("\tTamanio de la pila: " + pila.tamanioPila());
                System.out.println("\n\t#################################");
                break;
            case 5:
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
    public static void cola(int opcion, Cola cola){
        switch (opcion){
            case 1:
                System.out.println("\n\t#################################");
                System.out.println("\tElemento en el frente de la cola: " + cola.peek());
                System.out.println("\n\t#################################");
                break;
            case 2:
                System.out.println("Introduzca el valor del nuevo elemento: ");
                Scanner scanPushPila = new Scanner(System.in);
                Object valorElemento = scanPushPila.nextLine();
                cola.enqueue(valorElemento);
                break;
            case 3:
                System.out.println("\n\t#################################");
                System.out.println("\tElemento eliminado: " + cola.dequeue());
                System.out.println("\n\t#################################");
                break;
            case 4:
                System.out.println("\n\t#################################");
                System.out.println("\tTamanio de la cola: " + cola.tamanioCola());
                System.out.println("\n\t#################################");
                break;
            case 5:
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
}
