package X;

/* renamed from: X.KsX  reason: case insensitive filesystem */
public abstract class C63164KsX {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "TouchDown";
            case 2:
                return "Scroll";
            case 3:
                return "Fling";
            default:
                return "VideoLongPress";
        }
    }
}
