public class CreditPaymentService {
    public static double calculate(double monthlyRate, double amountOfCredit, double amountOfPeriod) {
        double annuityPay;
        double amountWithExponent = Math.pow((1 + monthlyRate), amountOfPeriod);
        annuityPay = (amountOfCredit * monthlyRate * amountWithExponent) / (amountWithExponent - 1);

        return annuityPay;
    }
}
