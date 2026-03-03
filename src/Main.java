import javax.swing.*;
import java.util.*;
void main() {
    // para que el usuario pueda escribir

    Scanner teclado = new Scanner(System.in);

    ArrayList<MASCOTA >LISTA_MASCOTA= new ArrayList<>();


    int opcion=0, menu=0;
    String nombre1= " ";
    MASCOTA m= null;


    do{
        System.out.println("""
            ---Elige una opcion---
            1.Crear objeto
            2.Mostrar todo
            3.Buscar por nombre
            4. Modificar estado de tu mascota
            """);
        opcion=teclado.nextInt();


        switch (opcion) {

            case 1:

                System.out.println("Digita el nombre de tu mascota: ");
                teclado.nextLine();
                nombre1=teclado.nextLine();


                System.out.println("Digita la especie de tu mascota: ");
                String especie1=teclado.nextLine();

                System.out.println("Digita la edad de tu mascota: ");
                int edad1=teclado.nextInt();

                System.out.println("Digita el peso de tu mascota: ");
                double peso1=teclado.nextDouble();

                m = new MASCOTA(nombre1,especie1,edad1,peso1);

                break;


            case 2:
                System.out.println(LISTA_MASCOTA);
                break;

            case  3:

                System.out.println("Digita el nombre a buscar:");
                teclado.nextLine();
                nombre1 = teclado.nextLine();

                boolean encontrar= false;

                for (MASCOTA masc : LISTA_MASCOTA) {
                    if (masc.getNombre().equalsIgnoreCase(nombre1)) {
                        System.out.println(masc);
                        encontrar = true;
                        break;
                    }
                }
                if(encontrar==false){
                    System.out.println("El nombre no fue encontrado :(");
                }

                break;

            case 4:

            System.out.println("Elige una opcion del menu:");
            System.out.println("""
             
             --------MENU MASCOTA-------
            1. Verificar vacunación
            2. Alimentar mascota
            3. Cumplir años
            4. Mostrar información final
            5. Salir
            """);
                menu = teclado.nextInt();


            switch (menu) {

                case 1:
                    m.vacunado();
                    break;

                case 2:
                    System.out.print("Cantidad de alimento que le vas a dar: ");
                    double comida = teclado.nextDouble();
                    System.out.println("El peso final de tu mascota es: ");
                    System.out.println(m.alimentar(comida));
                    break;

                case 3:
                    System.out.print("Tu mascota cumplira: " + m.cumplir_anios() + "anios 4\n");
                    break;

                case 4:
                    System.out.println(m.toString());
                    break;

                case 5:
                    System.out.println("Fin del programa");
                    break;

                default:
                    System.out.println("Opción inválida");
            }
        }


        if (m != null) {
            LISTA_MASCOTA.add(m);
        }

        } while (menu != 5);

        teclado.close();

    System.out.println(LISTA_MASCOTA.toString());
    System.out.println("La cantidad de objetos que tienes es de: "+LISTA_MASCOTA.size());





}