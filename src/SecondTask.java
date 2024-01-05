import java.util.Scanner;

public class SecondTask {
    public void sayHiToVyacheslav() {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        switch (name) {
            case "Вячеслав":
                System.out.println("Привет, Вячеслав");
            default:
                System.out.println("Нет такого имени");
        }
    }
}
