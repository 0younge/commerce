import java.util.List;
import java.util.Scanner;

public class CommerceSystem {

    // 속성
    private List<Product> products;
    private Scanner scanner;

    // 생성자
    public CommerceSystem(List<Product> product, Scanner scanner) {
        this.products = product;
        this.scanner = scanner;
    }

    // 기능
    public void start() {
        while (true) {
            System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");
            for (int i = 0; i < products.size(); i++) {
                Product p = products.get(i);
                System.out.printf("%d. %-14s | %,10d원 | %s %n", i + 1,p.getProductName(), p.getPrice(), p.getDescription());
            }
            System.out.println("0. 종료");
            String menuNum = scanner.nextLine();
            if (menuNum.equals("0")) {
                break;
            }
        }
    }

}
