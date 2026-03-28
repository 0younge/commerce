import java.util.List;
import java.util.Scanner;

public class Category {

    // 속성
    private String category;
    private List<Product> product;
    private Scanner scanner;

    // 생성자
    public Category(String category, List<Product> product, Scanner scanner) {
        this.category = category;
        this.product = product;
        this.scanner = scanner;
    }

    // 기능

    // 카테고리 이름 반환
    public String getCategory() {
        return category;
    }

    // 카테고리별 프로덕트 스크린
    public void productListScreen() {
        System.out.println("\n[ " + category + " 카테고리 ]");
        for (int i = 0; i < product.size(); i++) {
            System.out.print(i + 1 + ". ");
            product.get(i).getProductList();
        }
        System.out.println("0. 뒤로가기");
    }

    // 선택한 프로덕트 장바구니 추가여부 스크린
    public void selectProductScreen(int i) {
        product.get(i).getProduct();
        product.get(i).selectedProductInfo();
        System.out.println("위 상품을 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인       2. 취소");
    }




}
