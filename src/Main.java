public class Main {
    public static void main(String[] args) {
        int initialAmount = 100;
        int introduced = 1500;
        if (introduced > 1000) {
            System.out.println("Ваш баланс равен " + (introduced / 100 + initialAmount + introduced));
        } else {
            System.out.println(introduced + initialAmount);
        }
        System.out.println("Из них бонусов " + introduced / 100);
    }
}