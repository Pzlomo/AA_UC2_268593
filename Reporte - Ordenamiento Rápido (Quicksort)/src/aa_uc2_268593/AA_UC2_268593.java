package aa_uc2_268593;

public class AA_UC2_268593 {

    public static void main(String[] args) {
        Ordenamientos misOrdenamientos = new Ordenamientos();
        int[] miArreglo = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Iniciando algoritmo Quicksort...");
        
        // Llamamos a quicksort mandando el arreglo, el inicio (0) y el fin (tamaño - 1)
        misOrdenamientos.quicksort(miArreglo, 0, miArreglo.length - 1);
        
        System.out.println("Arreglo ordenado con éxito.");
    }
}