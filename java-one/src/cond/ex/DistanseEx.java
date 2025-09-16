package cond.ex;

public class DistanseEx {
    public static void main(String[] args) {
        int distanse = 2;

        if (distanse <= 1){
            System.out.println("도보를 이용하세요.");
        } else if (distanse <= 10) {
            System.out.println("자전거를 이용하세요.");
        }else if (distanse <= 100) {
            System.out.println("자동차를 이용하세요.");
        }else {
            System.out.println("비행기를 이용하세요.");
        }
    }
}
