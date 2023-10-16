import java.util.Scanner;

public class Ozon {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Введите наимненование товара: ");
        String name= s.nextLine();
        System.out.println("Количество: ");
        int num=s.nextInt();
        System.out.println("Телефон пользователя: ");
        int fone=s.nextInt();
    }
}
