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

    public boolean basketListIsEmpty() {
        return basketList.isEmpty();
    }

}
