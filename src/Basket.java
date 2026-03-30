import java.util.ArrayList;
import java.util.List;

public class Basket {

    // 속성
    private List<BasketProduct> basketList = new ArrayList<>();

    // 생성자

    // 기능

    // basketList 추가
    public void addBasketList(Product product) {
        for (int i = 0; i < basketList.size(); i++) {
            if (basketList.get(i).getProduct().equals(product)) {
                basketList.get(i).plusBasketQuantity();
                return;
            }
        }
        basketList.add(new BasketProduct(product));
    }

    // basketList 항목 존재 여부 반환
    public boolean basketListIsEmpty() {
        return basketList.isEmpty();
    }

    // basketList 초기화
    public void clearBasketList() {
        basketList.clear();
    }

    // basketList 출력
    public void basketListScreen() {
        System.out.println("[ 장바구니 내역 ]");
        for (int i = 0; i < basketList.size(); i++) {
            basketList.get(i).getBasketProduct();
        }

        System.out.println("\n[ 총 주문 금액 ]");
        int totalPrice = 0;
        for (int i = 0; i < basketList.size(); i++) {
            totalPrice += basketList.get(i).getBasketPrice();
        }
        System.out.printf("%,d원\n", totalPrice);
    }

    // 주문 완료 출력
    public void orderFinish() {
        int totalPrice = 0;
        for (int i = 0; i < basketList.size(); i++) {
            totalPrice += basketList.get(i).getBasketPrice();
        }
        System.out.printf("주문이 완료되었습니다! 총 금액: %,d원\n", totalPrice);
        for (int i = 0; i < basketList.size(); i++) {
            basketList.get(i).minusBasketQuantity();
        }
        basketList.clear();
    }

}
