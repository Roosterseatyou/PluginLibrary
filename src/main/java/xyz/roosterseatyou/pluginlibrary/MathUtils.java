package xyz.roosterseatyou.pluginlibrary;

public class MathUtils {
    public static int getRandom(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public static int getRandom(int max) {
        return (int) (Math.random() * max);
    }

    public static double getRandomDouble(double min, double max) {
        return Math.random() * (max - min) + min;
    }

    public static boolean rngHelper(double chance) {
        return Math.random() <= chance;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isInRange(int number, int min, int max) {
        return number >= min && number <= max;
    }
}
