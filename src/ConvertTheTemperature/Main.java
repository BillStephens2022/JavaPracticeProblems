package ConvertTheTemperature;


// convert celsius into Kelvin & Fahrenheit
// constraints 0 <= celsius <= 1000


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(convertTemperature(36.5));
        System.out.println(convertTemperature(122.11));
    }

    public static double[] convertTemperature(double celsius) {
        double[] ans = {0.0, 0.0};
        double kelvin = celsius + 273.15;
        double fahrenheit = (1.8 * celsius) + 32.0;
        ans[0] = kelvin;
        ans[1] = fahrenheit;
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
