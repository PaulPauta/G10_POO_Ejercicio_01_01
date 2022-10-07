/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pauta.roman_proyectou1;

/**
 *
 * @author PC-2
 */
public class PautaRoman_ProyectoU1 {

    public static void main(String[] args) {
        System.out.println("Hola mundo");
        
        var perro1 = new Perro();
        perro1.nombre="Elpepe";
        perro1.edad=3;
        perro1.raza="Chihuahua";
        perro1.peso=53;
        var perro2 = new Perro();
        perro2.nombre="Fifi";
        perro2.edad=10;
        perro2.raza="Dalmata";
        perro2.peso=64;
        var perro3 = new Perro();
        perro3.nombre="Manchas";
        perro3.edad=4;
        perro3.raza="San Bernardo";
        perro3.peso=35;
        
        var carro1 = new Carro();
        carro1.marca="BMW";
        carro1.placa="ABC-345";
        carro1.año=2007;
        carro1.motor="Gasolina";
        var carro2 = new Carro();
        carro2.marca="Susuki";
        carro2.placa="FTH-567";
        carro2.año=1989;
        carro2.motor="Diésel";
        var carro3= new Carro();
        carro3.marca="Ferrary";
        carro3.placa="TYU-000";
        carro3.año=2020;
        carro3.motor="Gasolina";
        
        var computadora1 = new Computadora();
        computadora1.marca="HP";
        computadora1.modelo="Pavilion";
        computadora1.almacenamiento="500GB";
        computadora1.precio=975;
        var computadora2 = new Computadora();
        computadora2.marca="ASUS";
        computadora2.modelo="F15";
        computadora2.almacenamiento="1TB";
        computadora2.precio=1500;
        var computadora3 = new Computadora();
        computadora3.marca="HP";
        computadora3.modelo="Probook";
        computadora3.almacenamiento="250GB";
        computadora3.precio=450;
        
        var persona1 = new Persona();
        persona1.apellido="Torres";
        persona1.nombre="Jose";
        persona1.edad=26;
        persona1.estatura=1.70;
        var persona2 = new Persona();
        persona2.apellido="Cardenas";
        persona2.nombre="Diego";   
        persona2.edad=18;
        persona2.estatura=1.60;
        var persona3 = new Persona();
        persona3.apellido="Escobar";
        persona3.nombre="Alex";
        persona3.edad=19;
        persona3.estatura=1.67;
        
        var camiseta1 = new Camiseta();
        camiseta1.marca="Polo";
        camiseta1.color="Blanco";        
        camiseta1.talla="M";       
        camiseta1.botones=true;
        var camiseta2 = new Camiseta();
        camiseta2.marca="Adidas";
        camiseta2.color="Negro";
        camiseta2.talla="S";
        camiseta2.botones=false;
        var camiseta3 = new Camiseta();
        camiseta3.marca="Adidas";
        camiseta3.color="Gris";
        camiseta3.talla="X";
        camiseta3.botones=false;
        
        var balon1= new Balon();
        balon1.marca="ADIDAS";
        balon1.nroBalon=3;
        balon1.modelo="Qatar 2022";
        balon1.deporte="Futbol";
        var balon2= new Balon();
        balon2.marca="WILSON";
        balon2.nroBalon=5;
        balon2.modelo="NBA DRV";
        balon2.deporte="Basketball";
        var balon3= new Balon();
        balon3.marca="MIKASA";
        balon3.nroBalon=4;
        balon3.modelo="FT-5";
        balon3.deporte="Ecuavoley-Futbol";
        
        //Perros 
        System.out.println("Mi perro se llama "+ perro1.nombre+ " ademas tiene "+
                perro1.edad+ " años"+ " y es de raza "+ perro1.raza);
        
        System.out.println("Mi perro se llama "+ perro2.nombre+ " ademas tiene "+
                perro2.edad+ " años"+ " y es de la raza "+ perro2.raza); 
        
        System.out.println("Mi perro se llama "+ perro3.nombre+ " ademas tiene "+
                perro3.edad+ " años"+ " y es de la raza "+ perro3.raza);
        
        //Carros 
        System.out.println("El carros es de la marca "+ carro1.marca 
                + " ademas la placa de "+ carro1.placa + " es del año "+ carro1.año +
                        " y tiene un motor de "+ carro1.motor);
        
        System.out.println("El carros es de la marca "+ carro2.marca 
                + " ademas la placa de "+ carro2.placa + " es del año "+ carro2.año +
                        " y tiene un motor de "+ carro2.motor);
        
        System.out.println("El carros es de la marca "+ carro3.marca 
                + " ademas la placa de "+ carro3.placa + " es del año "+ carro3.año +
                        " y tiene un motor de "+ carro3.motor);
        
        //Computadoras
        System.out.println("El computador es de la marca "+computadora1.marca+
                " es del modelo "+computadora1.modelo+" tiene una capacidad de almacenamiento"+
                computadora1.almacenamiento+" el precio del computador es de "+computadora1.precio);
        
        System.out.println("El computador es de la marca "+computadora2.marca+
                " es del modelo "+computadora2.modelo+" tiene una capacidad de almacenamiento"+
                computadora2.almacenamiento+" el precio del computador es de "+computadora2.precio);
        
        System.out.println("El computador es de la marca "+computadora3.marca+
                " es del modelo "+computadora3.modelo+" tiene una capacidad de almacenamiento"+
                computadora3.almacenamiento+" el precio del computador es de "+computadora3.precio);
        
        //Personas 
        System.out.println("La persona se llama "+persona1.nombre+" y su apellido es "+persona1.apellido+
                " tiene una estatura de "+persona1.estatura+" a los "+persona1.edad+" años");
        
        System.out.println("La persona se llama "+persona2.nombre+" y su apellido es "+persona2.apellido+
                " tiene una estatura de "+persona2.estatura+" a los "+persona2.edad+" años");
        
        System.out.println("La persona se llama "+persona3.nombre+" y su apellido es "+persona3.apellido+
                " tiene una estatura de "+persona3.estatura+" a los "+persona3.edad+" años");
        
        //Camiseta 
        System.out.println("La marca de la camiseta es "+camiseta1.marca+" y es de color "+camiseta1.color+
                " y es de la talla "+camiseta1.talla+" tiene botones"+camiseta1.botones);
        
        System.out.println("La marca de la camiseta es "+camiseta2.marca+" y es de color "+camiseta2.color+
                " y es de la talla "+camiseta2.talla+" tiene botones"+camiseta2.botones);
        
        System.out.println("La marca de la camiseta es "+camiseta3.marca+" y es de color "+camiseta3.color+
                " y es de la talla "+camiseta3.talla+" tiene botones"+camiseta3.botones);
        
        //Balones 
        System.out.println("La marca del balon es "+balon1.marca+" y el modelo es "+balon1.modelo+
                " el numero del balon es "+balon1.nroBalon+" y se utiliza para jugar"+balon1.deporte);
        
        System.out.println("La marca del balon es "+balon2.marca+" y el modelo es "+balon2.modelo+
                " el numero del balon es "+balon2.nroBalon+" y se utiliza para jugar"+balon2.deporte);
                
        System.out.println("La marca del balon es "+balon3.marca+" y el modelo es "+balon3.modelo+
                " el numero del balon es "+balon3.nroBalon+" y se utiliza para jugar"+balon3.deporte);
        
    }
}
