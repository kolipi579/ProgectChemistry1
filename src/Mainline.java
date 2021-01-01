import java.util.Scanner;

public class Mainline {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Names name1 = new Names();
        Names name2 = new Names();
        Names name3 = new Names();
        name1.line = sc.nextLine();
        name2.line = sc.nextLine();
        name3.line = sc.nextLine();
        System.out.println(name2.name());

    }

}