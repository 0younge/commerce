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
        System.out.println("[ 관리자 모드 ]");
        System.out.println("1. 상품 추가");
        System.out.println("2. 상품 수정");
        System.out.println("3. 상품 삭제");
        System.out.println("4. 전체 상품 현황");
        System.out.println("0. 메인으로 돌아가기");
    }

}
