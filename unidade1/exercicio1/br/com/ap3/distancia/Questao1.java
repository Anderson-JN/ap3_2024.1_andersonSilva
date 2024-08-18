/* */
package br.com.ap3.distancia;

import java.util.Scanner;

public class Questao1 {
  public double getDistancia(){
  Scanner teclado = new Scanner(System.in);

  double x1, y1, x2, y2, distancia = 1.0;

  System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:");
 
  x1=teclado.nextDouble();
  y1=teclado.nextDouble();
  x2=teclado.nextDouble();
  y2=teclado.nextDouble();
  teclado.close();
  
  distancia=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    return distancia;

  }

  public double getAmplitude(){
    double val1 = 6.0;  
    double val2 = 5.0;   
    double val3 = 4.0;   
    return (val1 - val2) - val3;

 }

  public static void main(String[] args) {
    
    Questao1 questao=new Questao1();
    
    double distancia=questao.getDistancia();
    System.out.println("A distancia é: " +distancia);
   
    double amplitude=questao.getAmplitude();
    System.out.println("A amplitude é: " +amplitude);

    }
}