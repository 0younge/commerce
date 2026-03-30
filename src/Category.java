import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Category {

    // 속성
    private String category;
    private List<Product> productList;

    // 생성자
    public Category(String category, List<Product> productList) {
        this.category = category;
        this.productList = productList;
    }

    // 기능

    // 카테고리 이름 반환
    public String getCategory() {
        return category;
    }

    // 카테고리별 프로덕트 스크린
    public void productListScreen() {
        System.out.println("\n[ " + category + " 카테고리 ]");
        for (int i = 0; i < productList.size(); i++) {
            System.out.print(i + 1 + ". ");
            productList.get(i).getProduct();
        }
        System.out.println("0. 뒤로가기");
    }

    // 선택한 프로덕트 장바구니 추가여부 스크린
    public void selectProductScreen(int i) {
        productList.get(i).selectedProductInfo();
        System.out.println("위 상품을 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인       2. 취소");
    }

    // 선택한 프로덕트 장바구니 추가
    public Product getProductforBasket(int i) {
        productList.get(i).addBasketProductInfo();
        return productList.get(i);
    }




}
