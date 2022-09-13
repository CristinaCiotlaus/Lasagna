public class Main {
    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();

        System.out.println("Timpul standard de asteptare pt a se face o lasagna este de: " +
                lasagna.expectedMinutesInOven() + " minute");
        System.out.println("Mai aveti de asteptat inca: " +
                lasagna.remainingMinutesInOven(30) + " minute");
        System.out.println("Timpul de preparare al straturilor: " +
                lasagna.preparationTimeInMinutes(2) + " minute");
        System.out.println("Timpul efectiv de preparare: " +
                lasagna.totalTimeInMinutes(20, 3) + " minute");
    }
}