package homeWork4;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------");

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addValues("Ivanov", "1111111");
        phoneBook.addValues("Ivanov", "2222222");
        phoneBook.addValues("Petrov", "3333333");
        System.out.println(phoneBook);

        System.out.println(phoneBook.getList("Ivanov"));



    }
}
