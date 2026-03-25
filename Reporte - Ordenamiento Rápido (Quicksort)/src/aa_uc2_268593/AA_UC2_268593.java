package aa_uc2_268593;

public class AA_UC2_268593 {

    public static void main(String[] args) {
        // 1. Creamos un objeto de la clase Ordenamientos
        Ordenamientos misOrdenamientos = new Ordenamientos();
        
        // 2. Creamos un arreglo desordenado de prueba
        int[] miArreglo = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Iniciando algoritmo de ordenamiento...");
        
        // 3. Llamamos al método de la burbuja
        misOrdenamientos.ordenarBurbuja(miArreglo);
        
        System.out.println("Arreglo ordenado con éxito.");
        
        // Imprimimos para verificar
        for(int i = 0; i < miArreglo.length; i++){
            System.out.print(miArreglo[i] + " ");
        }
    }
}