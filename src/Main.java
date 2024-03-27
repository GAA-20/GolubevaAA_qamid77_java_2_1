public class Main {
    public static void main(String[] args) {
        int cost = 13456; //стоимость билета
        int bonusParam = 20; //количество рублей для одной бонусной мили

        int miles = cost / bonusParam;

        System.out.println("Miles: " + miles);
    }
}