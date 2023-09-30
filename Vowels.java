import java.util.Scanner;

public class laba1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String name_one = in.nextLine();

        System.out.print("Введите вторую строку: ");
        String name_two = in.nextLine();

        String glas = "ауоыиэяюёеАУОЫИЭЯЮЁЕ";
        String soglas = "бвгджзйклмнпрстфхцчшщБВГДЖЗЙКЛМНПРСТФХЦЧШЩ";

        int glas1 = 0;
        int soglas1 = 0;
        int glas2 = 0;
        int soglas2 = 0;

        for (int i = 0; i < name_one.length(); i++) {
            if (glas.indexOf(name_one.charAt(i)) >= 0) {
                glas1++;
            }
        }
        System.out.println("Количество гласных букв в первой строке:");
        System.out.print(glas1);
        System.out.println();
        for (int i = 0; i < name_one.length(); i++) {
            if (soglas.indexOf(name_one.charAt(i)) >= 0) {
                soglas1++;
            }
        }
        System.out.println("Количество согласных букв в первой строке:");
        System.out.print(soglas1);
        System.out.println();

        for (int i = 0; i < name_two.length(); i++) {
            if (glas.indexOf(name_two.charAt(i)) >= 0) {
                glas2++;
            }
        }
        System.out.println("Количество гласных букв во второй строке:");
        System.out.print(glas2);
        System.out.println();
        for (int i = 0; i < name_two.length(); i++) {
            if (soglas.indexOf(name_two.charAt(i)) >= 0) {
                soglas2++;
            }
        }
        System.out.println("Количество согласных букв во второй строке:");
        System.out.print(soglas2);
        System.out.println();

        if (glas1 > glas2)
            System.out.println("Гласных больше в первой строке.");
        if (glas2 > glas1)
            System.out.println("Гласных больше во второй строке.");
        if (soglas1 > soglas2)
            System.out.println("Согласных больше в первой строке.");
        if (soglas2 > soglas1)
            System.out.println("Согласных больше во второй строке.");
        if (glas1 == glas2)
            System.out.println("Гласных в обеих строках одинаково.");
        if (soglas1 == soglas2)
            System.out.println("Согласных в обеих строках одинаково.");
    }
}