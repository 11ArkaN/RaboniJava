
public class Main {
    public static void main(String[] args) {
        System.out.println(Zadanie1(5,2,3));
        Zadanie2(1,-2,1);
        Zadanie3(10);
        Zadanie3While(10);
        Zadanie3DoWhile(10);

        System.out.println(Zadanie4(0.5)); // wynik: 10.5
        System.out.println(Zadanie4(0.1)); // wynik: 10.68
        System.out.println(Zadanie4(0.01)); // wynik: 10.6668
        System.out.println("\n");
        System.out.println(Zadanie5(0.5));
        System.out.println(Zadanie5(0.1));
        System.out.println(Zadanie5(0.01));
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
    public static double Zadanie4(double krok) {
        // przedział całkowania to [-2, 2], ponieważ tam y = x^2 przecina y = 4
        double a = -2; // lewy koniec przedziału
        double b = 2; // prawy koniec przedziału
        double pole = 0; // zmienna do przechowywania pola
        // pętla for, która iteruje po podprzedziałach
        for (double x = a; x < b; x += krok) {
            // wysokość prostokąta to różnica między y = 4 a y = x^2
            double wysokosc = 4 - x * x;
            // szerokość prostokąta to krok iteracji
            // pole prostokąta to iloczyn wysokości i szerokości
            double poleProstokata = wysokosc * krok;
            // dodajemy pole prostokąta do pola całkowitego
            pole += poleProstokata;
        }
        // zwracamy pole całkowite
        return pole;
    }

    public static double Zadanie5(double krok) {
        double a = 0; // lewy koniec przedziału
        double b = 2; // prawy koniec przedziału
        double pole = 0; // zmienna do przechowywania pola
        // pętla for, która iteruje po podprzedziałach
        for (double x = a; x < b; x += krok) {
            // wysokość prostokąta to różnica między y = 2x a y = x^2
            double wysokosc = 2 * x - x * x;
            // szerokość prostokąta to krok iteracji
            // pole prostokąta to iloczyn wysokości i szerokości
            double poleProstokata = wysokosc * krok;
            // dodajemy pole prostokąta do pola całkowitego
            pole += poleProstokata;
        }
        // zwracamy pole całkowite
        return pole;
    }
}
