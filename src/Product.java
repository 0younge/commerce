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
    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }
    public void getProductList() {
        System.out.printf("%-14s | %,10d원 | %s | 재고: %s %n",
                productName,
                price,
                description,
                quantity);
    }

    public void getProduct() {
        System.out.printf("선택한 상품: %s | %,d원 | %s | 재고: %s %n \n",
                productName,
                price,
                description,
                quantity);
    }

    public void selectedProductInfo() {
        System.out.printf("\"%s | %,d원 | %s\"\n",
                productName,
                price,
                description);
    }

}
