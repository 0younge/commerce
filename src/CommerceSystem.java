import java.util.List;
import java.util.Scanner;

public class CommerceSystem {

    // 속성
    private Scanner scanner;
    private List<Category> categoryList;

    // 생성자
    public CommerceSystem(Scanner scanner, List<Category> categoryList) {
        this.scanner = scanner;
        this.categoryList = categoryList;
    }

    // 기능
    public void start() {

        while (true) {

            // 카테고리 리스트
            System.out.println("[ 실시간 커머스 플랫폼 메인 ]");
            for (int i = 0; i < categoryList.size(); i++) {
                System.out.println(i + 1 +". " + categoryList.get(i).getCategory());
            }
            System.out.println("0. 종료");

            int categoryNum = scanner.nextInt();

            if (categoryNum == 0) {
                break;
            } else {
                categoryList.get(categoryNum - 1).choiceCategory();
            }

        }

    }

}
