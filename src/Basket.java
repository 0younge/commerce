import java.util.ArrayList;
import java.util.List;

public class Basket {

    // 속성
    private List<Product> basketList = new ArrayList<>();

    // 생성자

    // 기능

    // basketList 추가
    public void addBasketList(Product product) {
        basketList.add(product);
    }

    // basketList 항목 존재 여부 반환
    public boolean basketListIsEmpty() {
        return basketList.isEmpty();
    }

    // basketList 초기화
    public void clearBasketList() {
        basketList.clear();
    }

    // basketList product 반환

}
