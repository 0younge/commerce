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
                int categoryIndex = categoryNum - 1;
                System.out.println("\n[ " + categoryList.get(categoryIndex).getCategory() + " 카테고리 ]");
                for (int i = 0; i < categoryList.get(categoryIndex).getListSize(); i++) {
                    System.out.printf("%d. %-14s | %,10d원 | %s | 재고: %s %n",
                            i + 1,
                            categoryList.get(categoryIndex).getProduct(i).getProductName(),
                            categoryList.get(categoryIndex).getProduct(i).getPrice(),
                            categoryList.get(categoryIndex).getProduct(i).getDescription(),
                            categoryList.get(categoryIndex).getProduct(i).getQuantity());
                    categoryList.get(1).
                }
                System.out.println("0. 뒤로가기");

                // Product 선택
                int productIndex = scanner.nextInt();
                if (productIndex == 0) {

                } else {
                    productIndex -= 1;
                    System.out.printf("선택한 상품: %s | %,d원 | %s | 재고: %s %n \n",
                            categoryList.get(categoryIndex).getProduct(productIndex).getProductName(),
                            categoryList.get(categoryIndex).getProduct(productIndex).getPrice(),
                            categoryList.get(categoryIndex).getProduct(productIndex).getDescription(),
                            categoryList.get(categoryIndex).getProduct(productIndex).getQuantity());

                    System.out.printf("\"%s | %,d원 | %s\"\n",
                            categoryList.get(categoryIndex).getProduct(productIndex).getProductName(),
                            categoryList.get(categoryIndex).getProduct(productIndex).getPrice(),
                            categoryList.get(categoryIndex).getProduct(productIndex).getDescription());
                    System.out.println("위 상품을 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인       2. 취소");
                    int putBasket = scanner.nextInt();

                    if (putBasket == 1) {
                        System.out.println("\n" + categoryList.get(categoryIndex).getProduct(productIndex).getProductName() + "가 장바구니에 추가되었습니다\n");
                        basketList.add(categoryList.get(categoryIndex).getProduct(productIndex));
                    }

                }

            }

        }


    }

}
