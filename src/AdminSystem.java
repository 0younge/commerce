import java.util.List;
import java.util.Scanner;

public class AdminSystem {

    // 속성
    private Scanner scanner;
    private List<Category> categoryList;
    private Basket basketList;

    // 생성자
    public AdminSystem(Scanner scanner, List<Category> categoryList, Basket basketList) {
        this.scanner = scanner;
        this.categoryList = categoryList;
        this.basketList = basketList;
    }

    // 기능
    public void start() {
        while (true) {
            System.out.println("[ 관리자 모드 ]");
            System.out.println("1. 상품 추가");
            System.out.println("2. 상품 수정");
            System.out.println("3. 상품 삭제");
            System.out.println("4. 전체 상품 현황");
            System.out.println("0. 메인으로 돌아가기");

            int choiceNum = scanner.nextInt();
            scanner.nextLine();

            // 상품 추가
            if (choiceNum == 1) {
                System.out.println("\n어느 카테고리에 상품을 추가하시겠습니까?");
                for (int i = 0; i < categoryList.size(); i++) {
                    System.out.println(i + 1 + ". " + categoryList.get(i).getCategory());
                }

                int choiceCategoryNum = scanner.nextInt() - 1;
                scanner.nextLine();
                System.out.println("\n[ " + categoryList.get(choiceCategoryNum).getCategory() + " 카테고리에 상품 추가 ]");
                System.out.print("상품명을 입력해주세요: ");
                String productName = scanner.nextLine();
                System.out.print("가격을 입력해주세요: ");
                int price = scanner.nextInt();
                scanner.nextLine();
                System.out.print("상품 설명을 입력해주세요: ");
                String description = scanner.nextLine();
                System.out.print("재고수량을 입력해주세요: ");
                int quantity = scanner.nextInt();
                scanner.nextLine();

                System.out.printf("\n%s | %,d원 | %s | 재고: %d개\n", productName, price, description, quantity);
                System.out.println("위 정보로 상품을 추가하시겠습니까?");
                System.out.println("1. 확인    2. 취소");
                int confirm = scanner.nextInt();
                scanner.nextLine();

                if (confirm == 1) {
                    categoryList.get(choiceCategoryNum).addProduct(new Product(productName, price, description, quantity));
                    System.out.println("상품이 성공적으로 추가되었습니다!");
                } else {
                    System.out.println("상품 추가가 취소되었습니다.");
                }
            } else if (choiceNum == 0) {
                break;
            }


        }
    }

}
