import java.util.Scanner;

public class MASCOTA {
    // ATRIBUTOS

    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private boolean vacunado;

    //CONSTRUCTOR


    public MASCOTA() {
    }

    //CONSTRUCTOR QUE INICIALICE TODAS LAS VARIABLES (PARÁMETROS)


    public MASCOTA(String nombre, String especie, int edad, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.vacunado = true;

    }

    //

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    @Override
    public String toString() {
        return "MASCOTA{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", vacunado=" + vacunado +
                '}';
    }

    //MÉTODOS
    //VERIFICAR

    void verificar(){
        if(vacunado) {
            System.out.println("Vacunado");}
        else{
            vacunado=true;
            System.out.println("Vacunar");

        }
    }

    //ALIMENTAR

    double peso (double alimentar){

        if(alimentar>0){
            return (this.peso+alimentar);
        }
        else{
            System.out.println ("No se aceptan cantidades negastivas");
            return (this.peso);
        }
    }
//CUMPLIR AÑOS


    int edad (int cumplir_anios){
        return (this.edad+cumplir_anios);

    }
 // MENÚ

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MASCOTA m = new MASCOTA();

        int opcion;

        do {
            System.out.println("""
             MENU MASCOTA
             Sellecione una opción:
             
            1.Verificar vacunación
            2. Alimentar mascota
            3. Cumplir años
            4. Mostrar información final
            5. Salir
            """);

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    m.verificar();
                    break;

                case 2:
                    System.out.print("Cantidad de alimento: ");
                    double cant = sc.nextDouble();
                    System.out.println("Peso resultante: " + m.peso(cant));
                    break;

                case 3:
                    System.out.print("Años a cumplir: ");
                    int anios = sc.nextInt();
                    System.out.println("Edad resultante: " + m.edad(anios));
                    break;

                case 4:
                    System.out.println(m);
                    break;

                case 5:
                    System.out.println("Fin del programa");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 5);

        sc.close();
    }
}