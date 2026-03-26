import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        products.add(new Product("Galaxy S25", 1200000, "최신 안드로이드 스마트폰", 30));
        products.add(new Product("iPhone 16", 1350000, "Apple의 최신 스마트폰", 30));
        products.add(new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 30));
        products.add(new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 30));

        while (true) {
            System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");
            for (int i = 0; i < products.size(); i++) {
                Product product = products.get(i);
                System.out.printf("%d. %-14s | %,10d원 | %s %n", i + 1,product.productName, product.price, product.description);
            }
            System.out.println("0. 종료");
            String menuNum = sc.nextLine();
            if (menuNum.equals("0")) {
                break;
            }
        }


    }

}
