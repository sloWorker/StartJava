import java.util.Scanner;

public class MyFirstApp {
    public static void main(String[] args) {
        System.out.print("Написано однажды, ");
        System.out.println("работает везде!");
        Scanner console = new Scanner(System.in);
        System.out.print("Введите свое имя: ");
        System.out.println(console.nextLine());
    }
}
