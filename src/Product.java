public class Product {

    // 속성
    private String productName;
    private int price;
    private String description;
    private int quantity;
    private int basketQuantity;

    // 생성자
    public Product(String productName, int price, String description, int quantity, int basketQuantity) {
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.basketQuantity = basketQuantity;
    }

    // 기능

    // 프로덕트 정보 반환
    public void getProduct() {
        System.out.printf("%-14s | %,10d원 | %s | 재고: %s %n",
                productName,
                price,
                description,
                quantity);
    }

    // 선택한 프로덕트 정보 반환
    public void selectedProductInfo() {
        System.out.printf("선택한 상품: %s | %,d원 | %s | 재고: %s %n \n\"%s | %,d원 | %s\"\n",
                productName,
                price,
                description,
                quantity,
                productName,
                price,
                description);
    }

    // 장바구니에 추가한 프로덕트 정보 반환
    public void addBasketProductInfo() {
        System.out.println(productName + "가 장바구니에 추가되었습니다.\n");
    }

}
