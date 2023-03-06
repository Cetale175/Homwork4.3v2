public class CreditPaymentService {
    private int months;
    double denominator = Math.Pow(1 + 0.09 , months);
    public double calculate(int sum, int months, double percentage) {
        return sum * (0.09 + (0.09 / denominator -1));

    }
}