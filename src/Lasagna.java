public class Lasagna {

    static int expectedMinutesInOven() {
        // System.out.println("Timpul standard de asteptare pt o lasagna este de 40 de minute");
        return 40;
    }

    static int remainingMinutesInOven(int minuteInCuptor) {
        //System.out.println("Mai aveti de asteptat inca:");
        return 40 - minuteInCuptor;
    }

    static int preparationTimeInMinutes(int layers) {
        //System.out.println("Introduceti nr de straturi puse pe lasagna:"); greseala - timpul de preparare al straturilor
        int a = 2 * layers;
        return a;
    }

    static int totalTimeInMinutes(int minute, int layers) {
        //System.out.println("Timpul de preparare:");
        return preparationTimeInMinutes(layers) + minute;
    }
}