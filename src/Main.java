import java.io.IOException;
import java.util.Dictionary;

/**
 * Created by: Stina
 * Date: 2020-10-10
 * Time: 13:50
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class Main {
    public static void main(String[] args) throws IOException {

        Dice.createFile();

        int[] array = Dice.createArray();

        int[] results = Dice.analyseArray(array);

        String finalResult = String.format("Du rullade %d ettor\nDu rullade %d tvåor\nDu rullade %d treor\n" +
                "Du rullade %d fyror\nDu rullade %d femmor\nDu rullade %d sexor", results[0], results[1], results[2], results[3], results[4], results[5]);
        System.out.println(finalResult);


    }
}
