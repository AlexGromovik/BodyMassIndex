public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double height = 1.87; // Рост
        double weight = 98; // Вес
        int bMi; // ИМТ
        bMi = service.calculate(weight, height);
        System.out.println("Индекс массы тела = " + bMi);

        System.out.println();
        System.out.println("Рост 1.69, Вес 98");
        System.out.println("Индекс массы тела = " + service.calculate(71, 1.69));

        System.out.println();
        System.out.println("Рост 2.19, Вес 35");
        System.out.println("Индекс массы тела = " + service.calculate(35, 2.19));

    }
}