import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Function1(2,3));
        System.out.println(Arrays.toString(Function2()));
    }

    public static double[] Function2(){
        double a = 1.0;
        double b = -2.0;
        double c = -8.0;
        double delta = b * b - 4 * a * c;
        if (delta > 0)
        {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            return new double[] {x1, x2};
        }
        else if (delta == 0)
        {
            double x = -b / (2 * a);

            return new double[] {x};
        }
        else
        {
            System.out.println("Delta jest mniejsza 0");
            return new double[] {};
        }
    }

    public static double Function1(double a, double b) {
        double M = 0;
        if (a > 0 && b > 0){
            double part1 = (a * a) / b;
            double part2 = ((a / b) * a) / b;
            double part3 = 1 / a;
            return part1 + part2 + part3;
        }
        return M;
    }
}