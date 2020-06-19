package lab7_joshuamartinez;

import java.util.Random;
import java.util.Scanner;

public class ascii {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int numAletorio;
        for (int i = 0; i < 5; i++) {
            numAletorio = 65 + r.nextInt(122);
            if (numAletorio >= 65 && numAletorio <= 89) {
                Character cra = (char)numAletorio ;
                System.out.println(cra);
            } else if (numAletorio >= 97 && numAletorio <= 122) {
                Character cra = (char)numAletorio;
                System.out.println(cra);
            } else {
                i--;
            }
        }

    }
}
