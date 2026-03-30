import java.util.ArrayList;
import java.util.List;

public class BasketProduct {

    // 속성
    private Product product;
    private int basketQuantity;

    // 생성자
    public BasketProduct(Product product) {
        this.product = product;
        this.basketQuantity = 1;
    }

    // 기능

    // 장바구니 수량 증가
    public void plusBasketQuantity() {
        basketQuantity++;
    }

    // 프로덕트 반환
    public Product getProduct() {
        return product;
    }

    // 장바구니 프로덕트 정보 출력
    public void getBasketProduct() {
        product.getProduct2();
        System.out.println("수량: " + basketQuantity + "개");
    }

    // 금액 반환
    public int getBasketPrice() {
        return product.getPrice() * basketQuantity;
    }

    // 장바구니 수량만큼 재고 차감
    public void minusBasketQuantity() {
        System.out.printf("%s 재고가 %d개 -> ", product.getProductName(), product.getQuantity());
        product.minusQuantity(basketQuantity);
        System.out.printf("%d개로 업데이트되었습니다\n", product.getQuantity());
    }


}
