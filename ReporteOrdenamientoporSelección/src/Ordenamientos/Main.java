package Ordenamientos;

public class Main {

    public static void main(String[] args) {
        Ordenamientos ordenador = new Ordenamientos();
        
        int[] datos = {50, 20, 40, 10, 30};
        
        System.out.println("Iniciando ordenamiento...");
        
        ordenador.burbuja(datos);
        
        System.out.println("Arreglo ordenado:");
        for (int num : datos) {
            System.out.print(num + " ");
        }
    }
}