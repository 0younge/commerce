public class Product {

    // 속성
    private String productName;
    private int price;
    private String description;
    private int quantity;

    // 생성자
    public Product(String productName, int price, String description, int quantity) {
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
    }

    // 기능

    // 프로덕트 정보 출력1
    public void getProduct() {
        System.out.printf("%-14s | %,10d원 | %s | 재고: %s %n",
                productName,
                price,
                description,
                quantity);
    }

    // 프로덕트 정보 출력2
    public void getProduct2() {
        System.out.printf("%s | %,d원 | %s | ",
                productName,
                price,
                description);
    }

    // 선택한 프로덕트 정보 출력
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

    // 장바구니에 추가한 프로덕트 정보 출력
    public void addBasketProductInfo() {
        System.out.println(productName + "가 장바구니에 추가되었습니다.\n");
    }

    // 가격 반환
    public int getPrice() {
        return price;
    }

    // 재고 반환
    public int getQuantity() {
        return quantity;
    }

    // 제품명 반환
    public String getProductName() {
        return productName;
    }

    // 재고 차감
    public void minusQuantity(int i) {
        quantity -= i;
    }

}
