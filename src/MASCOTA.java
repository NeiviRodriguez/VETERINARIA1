public class MASCOTA {
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
            this.vacunado = false;

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

        public boolean vacunado() {
            if(vacunado){


            }
            return (this.);

        }





    }



}
