public class MonteCarloSimulation {
    public static void main(String[] args) {
        int numTrials = 99999999;
        int numHits = 0;
        for (int i = 0; i < numTrials; i++) {
            double x = Math.random();
            double y = Math.random();
            if (x * x + y * y <= 1) {
                numHits++;
            }
        }
        double pi = 4.0 * numHits / numTrials;
        System.out.println("The value of pi is " + pi);
    }
}
