public class FutureTuition {
    public static void main(String[] args) {
        double tuition = 10000; // Year 1
        int year = 1;
        while (tuition < 20000) {
            tuition = tuition * 1.07;
            year++;
        }
        System.out.println(
                "The tuition will be doubled in " + year + " years. Please complete your studies as soon as possible.");
    }
}