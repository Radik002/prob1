public class Main {

    public static void main(String[] args) {

        SalesManager day1 = new SalesManager(new long[]{55, 46, 30, 45, 48, 59, 33});

        System.out.println("Максимальное количество проданных позиций " + day1.max() + " шт");

        System.out.println("Среднее количество проданных позиций " + day1.average() + " шт");

    }
}
