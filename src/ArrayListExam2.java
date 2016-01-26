import java.util.ArrayList;
//MVC 패턴


// Controller 클래스
public class ArrayListExam2 {
    public static void main(String[] args) {
        //장바구니

        ArrayList<Product> cart = new ArrayList<>();
        // iMac 5k
        Product iMac = new Product("iMac 5k", 1, 1500000);
        cart.add(iMac);
        cart.add(new Product("아이패드", 1, 500000));
        cart.add(new Product("Java 네트워크 소녀 네티", 1, 25000));

        // iMac 삭제

        cart.remove(iMac);
        System.out.println(cart);

        //0번하고 2번 순서 바꾸기
        cart.add(0, iMac);
        Product book = cart.get(2);
        cart.set(0, book);
        cart.set(2, iMac);
        System.out.println(cart);



    }

    }
    //상품 (Model)클래스 = 기타 추가적인 요소가없는 클래스 . 데이터만 담는 클래스.
   static class Product {
        String code;        //상품코드
        int quantity;       //수량
        int price;          //단가

        public Product(String code, int quantity, int price) {
            this.code = code;
            this.quantity = quantity;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "code='" + code + '\'' +
                    ", quantity=" + quantity +
                    ", price=" + price +
                    '}' + "\n";
        }
    }


}

