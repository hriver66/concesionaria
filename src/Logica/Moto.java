
package Logica;

public class Moto extends Vehiculo{
    private int cilindrada;

    public Moto() {
    }

    public Moto(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Moto(int id_vehiculo, String marca, String modelo,int cilindrada, double precio) {
        super(id_vehiculo, marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
       return  super.toString()+" Cilindrada: " + cilindrada +"cc // Precio: "+super.formatPrecio(getPrecio());
    }
    
    
}
