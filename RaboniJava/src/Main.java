
public class Main {
    public static void main(String[] args) {
        System.out.println(Zadanie1(5,2,3));
        Zadanie2(1,-2,1);
        Zadanie3(10);
        Zadanie3While(10);
        Zadanie3DoWhile(10);

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

    public static void Zadanie3(int count) {
        if (count <= 0) return;
        String[][] shapes = new String[count][count];

        for (int i = 0; i < count; i++) {
            shapes[0][i] = "";
            for (int j = 0; j < count; j++) {
                shapes[0][i] += "*";
            }

        }

        for (int i = 0; i < count; i++) {
            shapes[1][i] = "";
            for (int j = 0; j < i + 1; j++) {
                shapes[1][i] += "*";
            }
        }

        for (int i = 0; i < count; i++) {
            String Spaces = String.format("%" + ((count - i) + (count - i)-1) + "s", "");
            shapes[2][i] = Spaces;
            for (int j = 0; j <= i; j++) {
                shapes[2][i] += "*";
            }
        }

        for (int i = 0; i < count; i++) {
            shapes[3][i] = "";
            for (int j = 0; j < count - i; j++) {
                shapes[3][i] += " ";
            }
            for (int j = 0; j < i + 1; j++) {
                shapes[3][i] += "*";
            }
            for (int j = 0; j < i; j++) {
                shapes[3][i] += "*";
            }
        }

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (shapes[j][i] == null) break;
                System.out.print(shapes[j][i] + "  ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");
    }
    public static void Zadanie3While(int count) {
        if (count <= 0) return;
        String[][] shapes = new String[count][count];

        int i = 0;
        while (i < count) {
            shapes[0][i] = "";
            int j = 0;
            while (j < count) {
                shapes[0][i] += "*";
                j++;
            }
            i++;
        }

        i = 0;
        while (i < count) {
            shapes[1][i] = "";
            int j = 0;
            while (j < i + 1) {
                shapes[1][i] += "*";
                j++;
            }
            i++;
        }

        i = 0;
        while (i < count) {
            String Spaces = String.format("%" + ((count - i) + (count - i)-1) + "s", "");
            shapes[2][i] = Spaces;
            int j = 0;
            while (j <=i) {
                shapes[2][i] += "*";
                j++;
            }
            i++;
        }

        i = 0;
        while (i < count) {
            shapes[3][i] = "";
            int j = 0;
            while (j < count - i) {
                shapes[3][i] += " ";
                j++;
            }
            j = 0;
            while (j < i + 1) {
                shapes[3][i] += "*";
                j++;
            }
            j = 0;
            while (j < i) {
                shapes[3][i] += "*";
                j++;
            }
            i++;
        }

        i = 0;
        while (i < count) {
            int j = 0;
            while (j < count) {
                if (shapes[j][i] == null) break;
                System.out.print(shapes[j][i] + "  ");
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }

    public static void Zadanie3DoWhile(int Count) {
        if (Count <= 0) return;
        String[][] shapes = new String[Count][Count];
        int i = 0;
        do {
            shapes[0][i] = "";
            int j = 0;
            do {
                shapes[0][i] += "*";
                j++;
            } while (j < Count);
            i++;
        } while (i < Count);

        i = 0;
        do {
            shapes[1][i] = "";
            int j = 0;
            do {
                shapes[1][i] += "*";
                j++;
            } while (j < i + 1);
            i++;
        } while (i < Count);

        i = 0;
        do {
            String Spaces = String.format("%" + ((Count - i) + (Count - i)-1) + "s", "");
            shapes[2][i] = Spaces;
            int j = 0;
            do {
                shapes[2][i] += "*";
                j++;
            } while (j <=i);
            i++;
        } while (i < Count);

        i = 0;
        do {
            shapes[3][i] = "";
            int j = 0;
            do {
                shapes[3][i] += " ";
                j++;
            } while (j < Count - i);
            j = 0;
            do {
                shapes[3][i] += "*";
                j++;
            } while (j < i + 1);
            j = 0;
            do {
                shapes[3][i] += "*";
                j++;
            } while (j < i);
            i++;
        } while (i < Count);

        i = 0;
        do {
            int j = 0;
            do {
                if (shapes[j][i] == null) break;
                System.out.print(shapes[j][i] + "  ");
                j++;
            } while (j < 4);
            System.out.print("\n");
            i++;
        } while (i < Count);
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
