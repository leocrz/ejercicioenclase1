package edu.umg.ejercicios;

import java.util.Scanner;

public class cls_0905_24_3086 {

    // 1. Área de un círculo
    public static double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    // 2. Circunferencia de un círculo
    public static double circunferenciaCirculo(double radio) {
        return 2 * Math.PI * radio;
    }

    // 3. Volumen de un cubo
    public static double volumenCubo(double lado) {
        return Math.pow(lado, 3);
    }

    // 4. Área de una pirámide cuadrada
    public static double areaPiramideCuadrada(double base, double altura) {
        return (base * altura) / 2;
    }

    // 5. Volumen de una pirámide cuadrada
    public static double volumenPiramideCuadrada(double base, double altura) {
        return (base * altura) / 3;
    }

    // 6. Área de un triángulo
    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    // 7. Volumen de un prisma rectangular
    public static double volumenPrismaRectangular(double areaBase, double altura) {
        return areaBase * altura;
    }

    // 8. Área de un paralelogramo
    public static double areaParalelogramo(double base, double altura) {
        return base * altura;
    }

    // 9. Volumen de un cilindro
    public static double volumenCilindro(double radio, double altura) {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    // Método principal con menú interactivo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ DE FÓRMULAS GEOMÉTRICAS ===");
            System.out.println("1. Área de un círculo");
            System.out.println("2. Circunferencia de un círculo");
            System.out.println("3. Volumen de un cubo");
            System.out.println("4. Área de una pirámide cuadrada");
            System.out.println("5. Volumen de una pirámide cuadrada");
            System.out.println("6. Área de un triángulo");
            System.out.println("7. Volumen de un prisma rectangular");
            System.out.println("8. Área de un paralelogramo");
            System.out.println("9. Volumen de un cilindro");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el radio del círculo: ");
                    double r1 = sc.nextDouble();
                    System.out.println("Área del círculo: " + areaCirculo(r1));
                    break;
                case 2:
                    System.out.print("Ingresa el radio del círculo: ");
                    double r2 = sc.nextDouble();
                    System.out.println("Circunferencia del círculo: " + circunferenciaCirculo(r2));
                    break;
                case 3:
                    System.out.print("Ingresa la longitud del lado del cubo: ");
                    double lado = sc.nextDouble();
                    System.out.println("Volumen del cubo: " + volumenCubo(lado));
                    break;
                case 4:
                    System.out.print("Ingresa la base de la pirámide: ");
                    double baseP = sc.nextDouble();
                    System.out.print("Ingresa la altura de la pirámide: ");
                    double alturaP = sc.nextDouble();
                    System.out.println("Área de la pirámide cuadrada: " + areaPiramideCuadrada(baseP, alturaP));
                    break;
                case 5:
                    System.out.print("Ingresa la base de la pirámide: ");
                    double baseV = sc.nextDouble();
                    System.out.print("Ingresa la altura de la pirámide: ");
                    double alturaV = sc.nextDouble();
                    System.out.println("Volumen de la pirámide cuadrada: " + volumenPiramideCuadrada(baseV, alturaV));
                    break;
                case 6:
                    System.out.print("Ingresa la base del triángulo: ");
                    double baseT = sc.nextDouble();
                    System.out.print("Ingresa la altura del triángulo: ");
                    double alturaT = sc.nextDouble();
                    System.out.println("Área del triángulo: " + areaTriangulo(baseT, alturaT));
                    break;
                case 7:
                    System.out.print("Ingresa el área de la base del prisma: ");
                    double areaBase = sc.nextDouble();
                    System.out.print("Ingresa la altura del prisma: ");
                    double alturaPrisma = sc.nextDouble();
                    System.out.println("Volumen del prisma rectangular: " + volumenPrismaRectangular(areaBase, alturaPrisma));
                    break;
                case 8:
                    System.out.print("Ingresa la base del paralelogramo: ");
                    double basePar = sc.nextDouble();
                    System.out.print("Ingresa la altura del paralelogramo: ");
                    double alturaPar = sc.nextDouble();
                    System.out.println("Área del paralelogramo: " + areaParalelogramo(basePar, alturaPar));
                    break;
                case 9:
                    System.out.print("Ingresa el radio del cilindro: ");
                    double rCilindro = sc.nextDouble();
                    System.out.print("Ingresa la altura del cilindro: ");
                    double hCilindro = sc.nextDouble();
                    System.out.println("Volumen del cilindro: " + volumenCilindro(rCilindro, hCilindro));
                    break;
                case 0:
                    System.out.println("Gracias por usar el programa. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }
    public class Main {
        public static void main(String[] args) {
//        Ejemplo.demo1();
//        Ejemplo ej = new Ejemplo();
//        ej.demo1();
//        ej.datos();
            cls_0905_24_3086 Leo = new cls_0905_24_3086();
        }
    }
}
