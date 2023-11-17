import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Zadanie1(5,2,3));
        Zadanie2(1,-2,1);
        Zadanie3();

        double[] kroki = {0.5, 0.1, 0.01};
        for (double krok : kroki) {
            double wynik = Zadanie4(krok);
            System.out.println("Pole dla kroku " + krok + " wynosi " + wynik);
        }

        double[] kroki2 = {0.5, 0.1, 0.01};
        for (double krok : kroki2) {
            double wynik = Zadanie5(krok);
            System.out.println("Pole dla kroku " + krok + " wynosi " + wynik);
        }
    }

    public static double Zadanie1(double a, double b, double c){
        double max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    public static void Zadanie2(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("Równanie ma dwa różne pierwiastki rzeczywiste: x1 = " + x1 + " i x2 = " + x2);
        }
        else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Równanie ma jeden podwójny pierwiastek rzeczywisty: x = " + x);
        }
        else {
            System.out.println("Równanie nie ma pierwiastków rzeczywistych");
        }
    }

    public static void Zadanie3() {
        String[][] shapes = new String[4][4];

        for (int i = 0; i < 4; i++) {
            shapes[0][i] = "";
            for (int j = 0; j < 4; j++) {
                shapes[0][i] += "*";
            }
        }

        for (int i = 0; i < 4; i++) {
            shapes[1][i] = "";
            for (int j = 0; j < i + 1; j++) {
                shapes[1][i] += "*";
            }
        }

        for (int i = 0; i < 4; i++) {
            shapes[2][i] = "";
            for (int j = 0; j < 4 - i; j++) {
                shapes[2][i] += "*";
            }
        }

        for (int i = 0; i < 4; i++) {
            shapes[3][i] = "";
            for (int j = 0; j < 4 - i; j++) {
                shapes[3][i] += " ";
            }
            for (int j = 0; j < i + 1; j++) {
                shapes[3][i] += "*";
            }
            for (int j = 0; j < i; j++) {
                shapes[3][i] += "*";
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(shapes[j][i] + "  ");
            }
            System.out.print("\n");
        }
    }

    public static double Zadanie4(double h) {
        double pole = 0;
        double x = -2 + h/2;
        while (x < 2) {
            double y = x * x;
            pole += y * h;
            x += h;
        }
        return pole;
    }

    public static double Zadanie5(double h) {
        double pole = 0;
        double x = h/2;
        while (x < 2) {
            double y1 = x * x;
            double y2 = 2 * x;
            pole += (y1 + y2) * h;
            x += h;
        }
        return pole;
    }

}