import java.util.List;
import java.util.Scanner;

public class CommerceSystem {

    // 속성
    private Scanner scanner;
    private List<Category> categoryList;
    private List<Product> basketList;

    // 생성자
    public CommerceSystem(Scanner scanner, List<Category> categoryList, List<Product> basketList) {
        this.scanner = scanner;
        this.categoryList = categoryList;
        this.basketList = basketList;
    }

    // 기능
    public void start() {

        while (true) {

            // 카테고리 리스트
            System.out.println("[ 실시간 커머스 플랫폼 메인 ]");
            for (int i = 0; i < categoryList.size(); i++) {
                System.out.println(i + 1 +". " + categoryList.get(i).getCategory());
            }
            System.out.println("0. 종료      | 프로그램 종료");

            // 주문 관리
            if (!basketList.isEmpty()) {
                System.out.println("\n[ 주문 관리 ]");
                System.out.println("4. 장바구니 확인    | 장바구니를 확인 후 주문합니다.");
                System.out.println("5. 주문 취소       | 진행중인 주문을 취소합니다.");
            }

            // 카테고리 선택
            int categoryNum = scanner.nextInt();

            if (categoryNum == 0) {
                break;
            } else {
                categoryList.get(categoryNum - 1).productListScreen();
            }

            // 프로덕트 선택
            int productIndex = scanner.nextInt();
            if (productIndex == 0) {

            } else {
                categoryList.get(categoryNum - 1).selectProductScreen(productIndex - 1);
            }

            int addBasketWhether = scanner.nextInt();


        }


    }

}
