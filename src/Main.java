import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Product> basketList = new ArrayList<>();

        List<Product> electProducts = new ArrayList<>();
        electProducts.add(new Product("Galaxy S25", 1200000, "최신 안드로이드 스마트폰", 25));
        electProducts.add(new Product("iPhone 16", 1350000, "Apple의 최신 스마트폰", 30));
        electProducts.add(new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 15));
        electProducts.add(new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 50));
        Category electCategory = new Category("전자제품", electProducts, scanner);

        List<Product> clothProducts = new ArrayList<>();
        clothProducts.add(new Product("후드티", 50000, "따뜻한 후드티", 30));
        clothProducts.add(new Product("반팔티", 20000, "시원한 반팔티", 30));
        clothProducts.add(new Product("가디건", 100000, "댄디한 가디건", 30));
        clothProducts.add(new Product("청바지", 35000, "튼튼한 청바지", 30));
        Category clothCategory = new Category("의류", clothProducts, scanner);

        List<Product> foodProducts = new ArrayList<>();
        foodProducts.add(new Product("치킨", 23000, "스노윙 치킨", 30));
        foodProducts.add(new Product("피자", 20000, "페퍼로니 피자", 30));
        foodProducts.add(new Product("햄버거", 5000, "비건 햄버거", 30));
        foodProducts.add(new Product("마라탕", 14000, "풀토핑 마라탕", 30));
        Category foodCategory = new Category("식품", foodProducts, scanner);


        List<Category> categoryList = new ArrayList<>();
        categoryList.add(electCategory);
        categoryList.add(clothCategory);
        categoryList.add(foodCategory);


        CommerceSystem commerceSystem = new CommerceSystem(scanner, categoryList, basketList);
        commerceSystem.start();


    }

}
