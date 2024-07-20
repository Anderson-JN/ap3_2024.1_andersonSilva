package br.com.anderson.aula2;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Crie um programa que declare variáveis de todos os tipos primitivos em Java 
        // (byte, short, int, long, float, double, boolean, char) 
        // e uma variável do tipo String. 
        // Atribua valores a elas e imprima esses valores no console.

        byte codigoByte = 112;
        System.out.println(" ");
        System.out.println(codigoByte);

        short codigoShort = 123;
        System.out.println(" ");
        System.out.println(codigoShort);

        int codigoInt = 12345;
        System.out.println(" ");
        System.err.println(codigoInt);

        long codigoLong = 1234567891;
        System.out.println(" ");
        System.out.println(codigoLong);

        float codigoFloat = (float) 12.25;
        System.out.println(" ");
        System.out.println(codigoFloat);

        double codigoDouble = 12345.123;
        System.out.println(" ");
        System.out.println(codigoDouble);

        boolean codigoBooLean = true;
        System.out.println(" ");
        System.out.println(codigoBooLean);
        
        char codigoChar = 'Y';
        System.out.println(" ");
        System.out.println(codigoChar);

        String codigoString = "Anderson";
        System.out.println(" ");
        System.out.println(codigoString);
        System.out.println(" ");

        // Crie um programa que descubra o valor máximo e mínimo que um int pode armazenar em Java. 
        // Utilize as constantes Integer.MAX_VALUE e Integer.MIN_VALUE para isso. 
        // Faça com que ocorra um estouro nesse tamanho máximo.

        System.out.println("Valor maximo do int: " +Integer.MAX_VALUE);
        System.out.println("Valor minimo do int:" +Integer.MIN_VALUE);

        // Crie um programa em Java que calcule a média de três notas utilizando programação estruturada. 
        // Não use classes e objetos para isso, apenas métodos estáticos.
        
        float nota1 = 10;
        float nota2 = 5;
        float nota3 = 6;

        System.out.println("A média das tres notas é: " + (nota1 +nota2 +nota3)/3);


    }
}
