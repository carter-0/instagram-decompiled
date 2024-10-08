package X;

/* renamed from: X.Kxv  reason: case insensitive filesystem */
public abstract class C63491Kxv {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "APP_INACTIVE";
            case 2:
                return "LIVE_SWAP";
            case 3:
                return "CONNECTION_QUALITY";
            case 4:
                return "LOST_CONNECTION";
            case 5:
                return "VIDEO_MUTE_TOGGLE";
            default:
                return "UNKNOWN";
        }
    }
}
