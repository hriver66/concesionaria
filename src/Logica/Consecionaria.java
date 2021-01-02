package Logica;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Consecionaria {

    public static void main(String[] args) {
        
        List <Vehiculo> listVeh = new ArrayList<>();
        
        listVeh.add(new Auto(1,"Peugeot","206",4,200000.00));
        listVeh.add(new Moto(2,"Honda","Titan",125,60000.00));
        listVeh.add(new Auto(3,"Peugeot","208",5,250000.00));
        listVeh.add(new Moto(4,"Yamaha","YBR",160,80500.50));

        double caro=0;
        double barato=0;
        //
        String vehBarato ="";
        String vehCaro = "";
        //
        String buscaChar="Y";
        String vehBusca="";
        
        for(Vehiculo veh: listVeh){
                // VEHICULO MAS CARO
                if (veh.getPrecio() > caro){
                    caro = veh.getPrecio();
                    vehCaro = veh.getMarca()+" "+veh.getModelo();
                }
                // VEHICILO  MAS BARATO
                if ( veh.getPrecio()< barato|| barato==0){
                    barato = veh.getPrecio();
                    vehBarato = veh.getMarca()+" "+veh.getModelo();
                }
                
                // BUSCAR VEHICULO CON LETRA Y
                if( veh.getModelo().contains(buscaChar)){
                    vehBusca = veh.getMarca()+" "+veh.getModelo()+" "+(veh.formatPrecio(veh.getPrecio()));
                }

                System.out.println(veh);
        }
        
        System.out.println("=============================");
        System.out.println("Vehiculo más caro: " +vehCaro);
        System.out.println("Vehiculo más barato: " +vehBarato);
        System.out.println("Vehiculo que contiene en el modelo la letra`Y´: "+vehBusca);
        System.out.println("=============================");
        
        System.out.println("Vehiculo ordenados por precio de mayor a menor");
        
        // ordenando lista mayor a menor precio
        listVeh.sort(
           Comparator.comparingDouble(Vehiculo::getPrecio).reversed()
        );
        
        for(Vehiculo veh: listVeh){
            System.out.println(veh.getMarca()+" "+veh.getModelo());
        }
    }
    
}
