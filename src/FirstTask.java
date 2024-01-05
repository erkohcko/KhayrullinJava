import java.util.Scanner;

public class FirstTask {
    public void sayHiIfNumberMoreThanSeven() {
        Scanner scan = new Scanner(System.in);
        int i;
        i = scan.nextInt();
        if (i > 7) {
            System.out.println("Привет");
        } else {
            System.out.println("Число меньше или равно 7"); // В задачи не требовалось, но просто как-то не красиво выглядит без продолжения
        }
    }

}
