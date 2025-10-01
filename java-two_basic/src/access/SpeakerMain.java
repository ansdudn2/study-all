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
    }
}
