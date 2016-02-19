import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by User on 19.02.2016.
 */
public class Main {


    public static int[] input() throws IOException {
        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);

        int[] array = new int[scanner.nextInt()];

        if (!file.exists()) {
            file.createNewFile();
        }

        int ptr = 0;
        while (scanner.hasNext()) {
            array[ptr] = scanner.nextInt();
            ptr++;
        }

        scanner.close();
        return array;
    }

    public static void output(int[] lengths) throws IOException {

        File file = new File("output.txt");
        PrintWriter writer = new PrintWriter(file);

        if (!file.exists()) {
            file.createNewFile();
        }


        Arrays.sort(lengths);

        writer.print(lengths[lengths.length - 1]);
        writer.close();


    }

    public static void main(String[] args) throws IOException {

        int[] array = null;
        try {
            array = input();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[] lengths = new int[array.length];


        int i = 0;
        int k = 0;

        while (i != array.length) {


            if (array[i] == 0) {
                k++;
                i++;
                continue;
            }

            lengths[k] += 1;
            i++;


        }

        output(lengths);


    }


}
