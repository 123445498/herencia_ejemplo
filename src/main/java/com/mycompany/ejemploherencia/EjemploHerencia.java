/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemploherencia;
import java.util.Scanner;
/**
 *
 * @author labctr
 */
public class EjemploHerencia {

    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
      System.out.println("Ingrese el valor del radio");
      double radio;
      radio=leer.nextDouble();
      circulo circulo1=new circulo(radio);
      System.out.println("El area del circulo es:" +circulo1.CalcularArea());
        
      Scanner leer=new Scanner(System.in);
      System.out.println("Ingrese el valor del Base");
      System.out.println("Ingrese el valor del Altura");
      double radio;
      Base=leer.nextDouble();
      Altura=leer.nextDouble();
      triangulo triangulo1=new triangulo(Base);
      triangulo triangulo1=new triangulo(Altura);
      
      
    }
}
