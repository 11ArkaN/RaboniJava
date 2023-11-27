
public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Zadanie 1");
        Zadanie1();
        System.out.println();
        System.out.println("Zadanie 2");
        Zadanie2();
        System.out.println();
        System.out.println("Zadanie 3");
        Zadanie3();
        System.out.println();
        System.out.println("Zadanie 4");
        Zadanie4();
        System.out.println();
        System.out.println("Zadanie 5");
        Zadanie5();
        System.out.println();
        System.out.println("Zadanie 6");
        Zadanie6();
    }

    public static void Zadanie1(){
        int[] Array = new int[100];
        // Wypełnienie tablicy losowymi wartościami z przedziału <0,1000>
        for (int i = 0; i < Array.length; i++) {
            Array[i] = (int) (Math.random() * 1001);
        }
        // Wyświetlenie co drugiej wartości na ekranie
        for (int i = 0; i < Array.length; i += 2) {
            System.out.println(Array[i] + ": " + i);
        }
    }

    public static void Zadanie2(){
        int[] Array = new int[100];
        // Wypełnienie tablicy losowymi wartościami z przedziału <0,1000>
        for (int i = 0; i < Array.length; i++) {
            int Wartosc;
            while (true) {
                Wartosc = (int) ((Math.random() * 1000));
                if (Wartosc % 2 == 0) {
                    break;
                }
            } 
            Array[i] = Wartosc;
         }

         for (int i = 0; i < Array.length; i++) {
             System.out.println(Array[i] + ": " + i);
         }
    }

    public static void Zadanie3(){
        int[] Array = new int[10];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = (int) (Math.random() * 101);
        }

        for (int i = 0; i < Array.length / 2; i++) {
            int temp = Array[i];
            Array[i] = Array[Array.length - i - 1];
            Array[Array.length - i - 1] = temp;
        }

        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i] + ": Index:" + i);
        }
    }

    public static void Zadanie4(){
        int[] Array = new int[100];
        // Wypełnienie tablicy losowymi wartościami z przedziału <0,100>
        for (int i = 0; i < Array.length; i++) {
            Array[i] = (int) (Math.random() * 101);
        }

        // Print array without new lines
        for (int j : Array) System.out.print(j + " ");
        System.out.println();

        // Print max array value
        int max = Array[0];
        for (int j : Array) if (j > max) max = j;
        System.out.println("Max: " + max);

        // Print min value
        int min = Array[0];
        for (int j : Array) if (j < min) min = j;
        System.out.println("Min: " + min);

        // Print average value
        int sum = 0;
        for (int j : Array) sum += j;
        int average = sum / Array.length;
        System.out.println("Average: " + average);

        // Print sum
        int sum2 = 0;
        for (int j : Array) sum2 += j;
        System.out.println("Sum: " + sum2);
    }

    public static void Zadanie5(){
        int[][] Array = new int[100][100];
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array.length; j++){
                Array[i][j] = (int) (Math.random() * 101);
            }
        }

        // Print diagonal values
        for (int i = 0; i < Array.length; i++) System.out.print(Array[i][i] + ",");
        System.out.println();
        // Print diagonal values from the other side
        for (int i = 0; i < Array.length; i++) System.out.print(Array[i][Array.length - i - 1] + ",");
    }

    public static void Zadanie6(){
        int [][] Array = new int[100][100];
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array.length; j++){
                Array[i][j] = (int) (Math.random() * 101);
            }
        }

        int max = Array[0][0];
        for (int[] ints : Array) {
            for (int j = 0; j < Array.length; j++) {
                if (ints[j] > max) max = ints[j];
            }
        }
        System.out.println("Max: " + max);

        int min = Array[0][0];
        for (int[] ints : Array) {
            for (int j = 0; j < Array.length; j++) {
                if (ints[j] < min) min = ints[j];
            }
        }
        System.out.println("Min: " + min);

        int sum = 0;
        for (int[] ints : Array) for (int j = 0; j < Array.length; j++) sum += ints[j];
        System.out.println("Sum: " + sum);

        int average = sum / (Array.length * Array.length);
        System.out.println("Average: " + average);
    }
}
