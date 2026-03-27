import java.util.List;

public class Basket {

    // 속성
    private List<Product> basketList;

    // 생성자
    public void Basket(List<Product> basketList) {
        this.basketList = basketList;
    }

    // 기능

    // basketList 추가
    public void addBasketList(Product product) {
        basketList.add(product);
    }

    public boolean basketListIsEmpty() {
        return basketList == null;
    }

}
