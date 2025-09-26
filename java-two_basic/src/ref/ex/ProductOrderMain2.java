package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = productOrder("두부", 2000, 2);
        orders[1] = productOrder("김치", 5000, 1);
        orders[2] = productOrder("콜라", 1500, 2);

        printOrders(orders);
        int totalprice = getTotalPrice(orders);
        System.out.println("총 결제 금액: " + totalprice);


    }

    static ProductOrder productOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder productOrder : orders) {
            System.out.println("상품명: " + productOrder.productName + ", 가격" + productOrder.price + ", 수량: " + productOrder.quantity);
        }
    }

    static int getTotalPrice(ProductOrder[] orders) {
        int totalPrice = 0;
        for (ProductOrder productOrder : orders) {
            totalPrice += productOrder.price * productOrder.quantity;
        }
        return totalPrice;
    }
}
