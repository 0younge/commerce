import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        products.add(new Product("Galaxy S25", 1200000, "최신 안드로이드 스마트폰", 30));
        products.add(new Product("iPhone 16", 1350000, "Apple의 최신 스마트폰", 30));
        products.add(new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 30));
        products.add(new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 30));

        CommerceSystem commerceSystem = new CommerceSystem(products, scanner);

        commerceSystem.start();


    }

}
