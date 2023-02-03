public class Main {
    public static void main(String[] args) {

        /* double x = 2;                      }
        double y = 4;                         }
        double z = Math.pow(x, y);            }  сие есть работающее возведение в степень
        System.out.println(z);                }*/

        /*double monthlyRate = 0.008325;                                                                                      } здесь
        double amountOfCredit = 1_000_000;                                                                                    } логика
        double amountOfPeriod = 36;                                                                                           } без использования
        double amountWithExponent = Math.pow((1 + monthlyRate), amountOfPeriod);                                              } класса
        double annuityPay = (amountOfCredit * monthlyRate * amountWithExponent) / (amountWithExponent - 1);                   } CreditPaymentService
        double annuityPay = CreditPaymentService.calculate(monthlyRate, amountOfCredit, amountOfPeriod, amountWithExponent);  }*/

        CreditPaymentService service = new CreditPaymentService();
        double annuityPay = CreditPaymentService.calculate(0.008325, 1_000_000, 12);
        System.out.printf("%.0f", annuityPay);
        System.out.println();
        double annuityPayTwoYears = CreditPaymentService.calculate(0.008325, 1_000_000, 24);
        System.out.printf("%.0f", annuityPayTwoYears);
        System.out.println();
        double annuityPayThreeYears = CreditPaymentService.calculate(0.008325, 1_000_000, 36);
        System.out.printf("%.0f", annuityPayThreeYears);
    }
}