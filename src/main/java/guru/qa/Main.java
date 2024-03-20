package guru.qa;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;


public class Main {
    public static void main(String[] args) {
        System.out.println("Insert one of the following characters:");
        System.out.println("'b'- byte");
        System.out.println("'s'- short");
        System.out.println("'i'- integer");
        System.out.println("'l'- long");
        System.out.println("'f'- float");
        System.out.println("'d'- double");
        System.out.println("'c'- char");
        System.out.println("'n'- boolean");
        System.out.println("'m'- mix of double and int");
        System.out.println("'o'- overflow");

        Scanner console = new Scanner(System.in);
        String varType  = console.nextLine();

        Logger logger = Logger.getLogger(Main.class.getName());

        switch (varType) {
            case "b":

                logger.info("You selected type 'byte' which has min value '" + Byte.MIN_VALUE + "' and max value '" + Byte.MAX_VALUE + "'");
                byte a = 100 / 9;
                logger.info("Let's try to divide: 100 / 9 = " + a);
                break;
            case "s":
                logger.info("You selected type 'short' which has min value '" + Short.MIN_VALUE+"' and max value '" + Short.MAX_VALUE+"'");
                short b = 5673*4;
                logger.info("Let's multiply: 5673 * 4 = "+b);
                break;
            case "i":
                logger.info("You selected type 'integer' which has min value '" + Integer.MIN_VALUE+"' and max value '" + Integer.MAX_VALUE+"'");
                int c = 790753956%2546;
                logger.info("Let's get the remainder: 790753956 % 2546 = "+c);
                break;
            case "l":
                logger.info("You selected type 'long' which has min value '" + Long.MIN_VALUE+"' and max value '" + Long.MAX_VALUE+"'");
                long d = 1587664560+6875;
                logger.info("Let's try to get sum: 1587664560 + 6875 = "+d);
                break;
            case "f":
                logger.info("You selected type 'float' which has min value '" + Float.MIN_VALUE+"' and max value '" + Float.MAX_VALUE+"'");
                float e = 1587664560.7f+6875.3f;
                logger.info("Let's try to get subtraction: 1587664560.7f + 6875.3f = "+e);
                break;
            case "d":
                logger.info("You selected type 'double' which has min value '" + Double.MIN_VALUE+"' and max value '" + Double.MAX_VALUE+"'");
                double f = 19487664560.564d+6875.143d;
                logger.info("Let's try to get sum: 19487664560.564d + 6875.143d = "+f);
                break;
            case "c":
                Random r = new Random();
                char g = (char)(r.nextInt(26) + 'a');
                logger.info("Let's get a random char value: "+g);
                break;
            case "n":
                boolean h = true;
                boolean i = false;
                logger.info("You selected type 'boolean' which has 2 values: " + h + " & " + i);
                break;
            case "m":
                int j = 27641987;
                double k = 9123725.9d;
                int l = (int) (j + k);
                double m = j + k;
                logger.info("You selected 2 types 'integer' & 'double'. Let's get sum of 27641987 & 9123725.9d");
                logger.info("Sum result written to a variable with int type: "+l);
                logger.info("Sum result written to a variable with double type: "+m);
                break;
            case "o":
                logger.info("You selected to get an overflow error message");
                calculateFactorial(7278876);
                break;
            default:
                double infinity = 1d / 0d;
                logger.info("You haven't selected anything: " + infinity);
        }
    }

    public static int calculateFactorial(int number) {
        return number == 1 ? 1 : number * calculateFactorial(number - 1);
    }
}