import javax.crypto.spec.PSource;

public class homework {
    public static void main(String[] args) {

        byte byteName = 1;
        short shortName = 2;
        long longName = 3;
        float floatName = 1.5f;
        char charName = 'O';
        boolean booleanName = true;
        String homework = "homework";
        String wrongHomework = new String("homework");
        int first = 1, second = 2, third = 3;
        double d1 = 1.5, d2 = 2.5, d3 = 3.5;

        System.out.println("third task Ten examples:");
        System.out.println((byteName + 1) * 2);
        System.out.println((shortName + 2) / 2);
        System.out.println(10 + third % 100);
        System.out.println(first + second + third);
        System.out.println(first * third % 100);
        System.out.println(floatName * longName / 2);
        System.out.println(d3 - 2 + longName);
        System.out.println((longName + 2.3) * 9);
        System.out.println(floatName * 6 / 3.5);
        System.out.println(floatName + d3 + d2);

        System.out.println("Fourth task Ten examples:");

        System.out.println((byteName += 2) + 7);
        System.out.println((shortName -= 1) * 10);
        System.out.println((longName *= 3) + 1);
        System.out.println((floatName /= 0.5) + 7);
        System.out.println((first += 4) + (second -= 1) + 4);
        System.out.println((third /= 3) * 10);
        System.out.println((shortName *= 10) % 100);
        System.out.println((third %= 100) * 10);
        System.out.println((d1 *= 6) + 1);
        System.out.println((d2 *= 4) * 1);

        System.out.println("fifth task Six examples:");
        System.out.println(byteName * 5 > 14);
        System.out.println(shortName + 5 < 50);
        System.out.println(longName - 3 >= 6);
        System.out.println(first + 5 == 6);
        System.out.println(second + 1 != 2);
        System.out.println(third * 10 <= 9);





    }

}
