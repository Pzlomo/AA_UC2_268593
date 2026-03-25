package aa_uc2_268593;

public class Ordenamientos {

    public void quicksort(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int indiceParticion = particion(arr, inicio, fin);
            quicksort(arr, inicio, indiceParticion - 1);
            quicksort(arr, indiceParticion + 1, fin);
        }
    }

    private int particion(int[] arr, int inicio, int fin) {
        int pivote = arr[fin];
        int i = (inicio - 1);

        for (int j = inicio; j < fin; j++) {
            // Compara si el actual es menor o igual al pivote
            if (arr[j] <= pivote) {
                i++;
                // Intercambio
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Intercambio final del pivote
        int temp = arr[i + 1];
        arr[i + 1] = arr[fin];
        arr[fin] = temp;

        return i + 1;
    }
}