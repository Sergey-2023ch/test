import java.util.Scanner;

public class Ozon {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Введите наимненование товара: ");
        String name = s.nextLine();

        System.out.println("Количество: ");
        int num = s.nextInt();

        System.out.println("Телефон пользователя: ");
        int phone = s.nextInt();
        s.nextLine();

        System.out.println("Адрес доставки : ");
        String address = s.nextLine();

        System.out.printf("Ваш заказ принят. Товар %s в количестве %d прибудет к вам в ближайшее время.\n Товар доставим по адресу %s . Ваш контактный номер %d.\n", name, num, address, phone);
        s.close();
    }

}
