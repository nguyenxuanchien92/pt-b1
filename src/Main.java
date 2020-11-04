import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        System.out.println("Giải phương trình bậc nhất một ẩn");

        System.out.print("NHập giá trị a:");

        Scanner sc = new Scanner(System.in);

        Double numberA = sc.nextDouble();
        System.out.println();

        System.out.print("NHập giá trị b:");
        Double numberB = sc.nextDouble();

        PhuongTrinh bt = new PhuongTrinh(numberA,numberB);

        System.out.println(bt.calculator(numberA,numberB));
    }

}

//giải phương trình bậc nhất