package cond.ex;

public class MovieRateEx {
    public static void main(String[] args) {
        double rateing = 5.2;

        if (rateing <= 9) {
            System.out.println("'어바웃타임'을 추천합니다");
        }
        if (rateing <= 8) {
            System.out.println("'토이스토리'를 추천합니다.");
        }
        if (rateing <= 7) {
            System.out.println("'고질라'를 추천합니다.");
        }

    }
}
