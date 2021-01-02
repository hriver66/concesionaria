
package Logica;

public class Auto extends Vehiculo {
    private int puertas;

    public Auto() {
    }

    public Auto(int puertas) {
        this.puertas = puertas;
    }

    public Auto(int id_vehiculo, String marca, String modelo,int puertas, double precio) {
        super(id_vehiculo, marca, modelo, precio);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return  super.toString()+" Puertas: " + puertas +" // Precio: "+super.formatPrecio(getPrecio());
    }
    
}
