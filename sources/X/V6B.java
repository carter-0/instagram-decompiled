package X;

public abstract class V6B {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "prepared";
            case 2:
                return "playing";
            case 3:
                return "seeking";
            case 4:
                return "paused";
            case 5:
                return "playback_complete";
            case 6:
                return "buffering";
            case 7:
                return "error";
            default:
                return "unprepared";
        }
    }
}
