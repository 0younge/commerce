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
    public String getCategory() {
        return category;
    }

    public void choiceCategory() {
        System.out.println("\n[ " + category + " 카테고리 ]");
        for (int i = 0; i < product.size(); i++) {
            System.out.printf("%d. %-14s | %,10d원 | %s %n",
                    i + 1,
                    product.get(i).getProductName(),
                    product.get(i).getPrice(),
                    product.get(i).getDescription());
        }
        System.out.println("0. 뒤로가기");

        int choiceProduct = scanner.nextInt();
        if (choiceProduct == 0) {

        } else {
            System.out.printf("선택한 상품: %s | %,d원 | %s | 재고: %s %n \n",
                    product.get(choiceProduct).getProductName(),
                    product.get(choiceProduct).getPrice(),
                    product.get(choiceProduct).getDescription(),
                    product.get(choiceProduct).getQuantity());
        }

    }



}
