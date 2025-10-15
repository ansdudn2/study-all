package enumeration.ex0;

public class DiscountService {
    int discountPercent = 0;

    public int discount(String grade, int price) {
        if (grade.equals("BASIC")) {
            discountPercent = 10;
        }  else if (grade.equals("GOLD")) {
            discountPercent = 20;
        } else if (grade.equals("DIAMOND")) {
            discountPercent = 30;
        } else {
            System.out.println(grade + ": 할인X");
        }

        return price * discountPercent / 100;
    }
}
