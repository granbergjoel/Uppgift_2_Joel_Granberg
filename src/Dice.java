import java.io.*;
import java.util.Scanner;

/**
 * Created by: Stina
 * Date: 2020-10-10
 * Time: 13:49
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class Dice {

    public static void createFile() throws IOException {
        PrintWriter input=new PrintWriter(new BufferedWriter(new FileWriter("dice.txt")));
        for (int i = 0; i < 1000; i++) {

            input.println((int)(Math.random()*6)+1);
        }
        input.close();
    }

    public static int[] createArray() throws FileNotFoundException {
            int i=0;
            int[] numbers= new int[1000];
            Scanner reader=new Scanner(new File("dice.txt"));
           while(reader.hasNextLine()){
               numbers[i]= Integer.parseInt(reader.nextLine());
               i++;
           }
      return numbers;
    }

    public static int[] analyseArray(int[] a){
        int check=0;
        int one=0;
        int two=0;
        int three=0;
        int four=0;
        int five=0;
        int six=0;
        for (int i = 0; i < 1000; i++) {
            check = a[i];

            switch(check){
                case 1: a[0]=++one;
                break;
                case 2: a[1]=++two;
                break;
                case 3: a[2]=++three;
                    break;
                case 4: a[3]=++four;
                    break;
                case 5: a[4]=++five;
                    break;
                    case 6: a[5]=++six;
                        break;
            }


        }

        return a;
    }
}