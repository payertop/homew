public class Main {
    public static void main(String[] args) {


        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        int balance = 1000;
        int deposit = 1001;
        int min = 1000;
        boolean depositing = true;
        int sum = balance + deposit;
        int bonus = deposit / 100;
        int percent = depositing ? bonus : sum;
        int check = percent + sum;
        if (sum > min) {

        } else {
            check = sum;
        }

        System.out.println(check);

    }
}