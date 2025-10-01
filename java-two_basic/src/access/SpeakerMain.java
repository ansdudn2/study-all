package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeup();
        speaker.showVolume();

        speaker.volumeup();
        speaker.showVolume();

        speaker.volumedown();
        speaker.showVolume();

        // 필드에 직접 접근
        /* volume 을 private로 변경 후 컴파일 오류
        System.out.println("volume 필드 직접 접근 수정");
        speaker.volume = 200;
        speaker.showVolume();
         */
    }
}
