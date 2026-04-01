import java.util.List;
import java.util.Scanner;

public class CommerceSystem {

    // 속성
    private Scanner scanner;
    private List<Category> categoryList;
    private Basket basketList;
    private AdminSystem adminSystem;

    // 생성자
    public CommerceSystem(Scanner scanner, List<Category> categoryList, Basket basketList, AdminSystem adminSystem) {
        this.scanner = scanner;
        this.categoryList = categoryList;
        this.basketList = basketList;
        this.adminSystem = adminSystem;
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
            System.out.println("6. 관리자 모드");

            // 주문 관리
            if (!basketList.basketListIsEmpty()) {
                System.out.println("\n[ 주문 관리 ]");
                System.out.println("4. 장바구니 확인    | 장바구니를 확인 후 주문합니다.");
                System.out.println("5. 주문 취소       | 진행중인 주문을 취소합니다.");
            }

            // 카테고리 선택
            int categoryNum = scanner.nextInt();
            if (categoryNum == 0) {
                break;
            } else if (categoryNum == 4) {
                System.out.println("아래와 같이 주문 하시겠습니까?\n");
                basketList.basketListScreen();
                System.out.println("1. 주문 확정      2. 메인으로 돌아가기");
                int shouldOrder = scanner.nextInt();
                if (shouldOrder == 1) {
                    basketList.orderFinish();
                    continue;
                } else {
                    continue;
                }
            } else if (categoryNum == 5) {
                basketList.clearBasketList();
                continue;
            } else if (categoryNum == 6) {
                System.out.println("관리자 비밀번호를 입력해주세요");
                for (int i = 0; i < 4; i++) {
                    String inputPassword = scanner.nextLine();
                    if (inputPassword.equals("admin123")) {
                        adminSystem.start();
                        break;
                    }
                } continue;
            } else {
                categoryList.get(categoryNum - 1).productListScreen();
            }

            // 프로덕트 선택
            int productIndex = scanner.nextInt();
            if (productIndex == 0) {

            } else {
                categoryList.get(categoryNum - 1).selectProductScreen(productIndex - 1);

                // 장바구니 추가 여부 선택
                int selectAddBasket = scanner.nextInt();
                if (selectAddBasket == 1) {
                    basketList.addBasketList(categoryList.get(categoryNum - 1).getProductforBasket(productIndex - 1));
                    System.out.println("아래 메뉴를 선택하세요.");
                }
            }


        }

    }

}
