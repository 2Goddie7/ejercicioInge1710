public class llamarClase {
    public static void main(String[] args) {
        vehiculos auto1 = new vehiculos("Toyota",2022,"Verde");
        vehiculos auto2 = new vehiculos("Camaro",2023,"Amarillo");
        auto1.imprimir();
        auto2.imprimir();

        vehiculos autoModelo = new vehiculos("Chiron");
        System.out.println();
        autoModelo.imprimirModelo();

        vehiculos auto3 = new vehiculos("Bugatti","Chiron",2023,"Negro","Nuevo");
        System.out.println();
        auto3.imprimirDos();

        vehiculos auto4 = new vehiculos();
        System.out.println();
        auto4.imprimir();
    }
}