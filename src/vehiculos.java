public class vehiculos {

    String marca;
    String modelo;
    int anio;
    String color;
    String condicion;

    public vehiculos(String marca, String modelo, int anio, String color, String condicion){
        this.marca=marca;
        this.modelo=modelo;
        this.anio=anio;
        this.color=color;
        this.condicion=condicion;
    }

    public void imprimirDos(){
        System.out.println("La marca es: "+marca+". El modelo es: "+modelo+". El año es: "+anio+". El color es: "+color+". La condicion es: "+ condicion);
    }

    public vehiculos(String modelo, int anio, String color){// metodo constructor para inicializar las variables
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
    }

    public void imprimir(){//metodo imprimir
        System.out.println("El módelo del vehiculo es: "+modelo+". El año es: "+anio+" y el color es: "+color);
    }

    public vehiculos(String modelo){
        this.modelo = modelo;
    }

    public void imprimirModelo(){
        System.out.println("El módelo del carro es: "+modelo);
    }

    public vehiculos(){
        this.modelo = "R8";
        this.anio = 2008;
        this.color = "Rojo";
    }

}