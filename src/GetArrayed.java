import javax.security.sasl.SaslClient;
import java.util.Random;
import java.util.Scanner;

public class GetArrayed {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int ArraySize = 100;

        int[] dataPoint = new int[ArraySize];

        for (int i = 0; i < dataPoint.length; i++)
        {
            dataPoint[i] = rnd.nextInt(100) + 1;
        }
        for (int i = 0; i < dataPoint.length; i++)
        {
            dataPoint[i] = rnd.nextInt(100) + 1;
        }
        for (int i = 0; i < dataPoint.length; i++)
        {
            System.out.printf(dataPoint[i] + " | ");

            if (i % 24 == 0 && i > 0)
            {
                System.out.println(" ");
            }
        }

        getAverage(dataPoint);



            int count = 0;

            int getInt = SafeInput.getRangedInt(in, "Enter integer value between ", 1, 100);

            valueFound(dataPoint, getInt);



            int matchValue = SafeInput.getRangedInt(in, "Enter integer value between ", 1, 100);
            founded(dataPoint, matchValue);


        minValue(dataPoint);
        maxValue(dataPoint);


        System.out.println("Average of data Point is: " + getAverage(dataPoint));

    }
        public static double getAverage ( int values[]){
            double sum = 0;
            double average;
            for (int i = 0; i < values.length; i++) {
                sum += values[i];
            }
            average = sum / values.length;
            System.out.printf("\n\nThe sum of the data points is %.2f and the average is %.2f.\n\n", sum, average);
            return average;
        }
    public static int minValue(int values[]) {
        int min = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        System.out.printf("\nThe min value is %d.", min);
        return min;
    }

    public static int maxValue(int values[]) {
        int max = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        System.out.printf("The max value is %d.\n", max);
        return max;
    }



    public static int valueFound ( int values[], int userValue){
            int count = 0;
            for (int i = 0; i < values.length; i++) {
                if (userValue == values[i]) {
                    count++;
                }
            }
            System.out.printf("\nThe value %d appears in the Data Point array %d times.\n", userValue, count);
            return count;
        }

        public static int sum(int values[]) {
        int sumOfValues = 0;
        for (int i = 0; i < values.length; i++) {
            sumOfValues += values[i];
        }
        return sumOfValues;
    }
    public static boolean founded(int values[], int userValue) {
        int match = -1;
        for (int i = 0; i < values.length; i++) {
            if (userValue == values[i]) {
                match = i;
                break;
            }
        }
        if (match != -1) {
            System.out.printf("\nThe value %d was found at array index %d.\n", userValue, match);
            return true;
        } else
        {
            System.out.printf("\nThe value %d was not found.\n", userValue);
            return false;
        }
    }

    }

