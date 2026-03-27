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

    // 카테고리 사이즈 반환
    public int getListSize() {
        return product.size();
    }

    // 카테고리 프로덕트 반환
    public Product getProduct(int i) {
        return product.get(i);
    }


}
