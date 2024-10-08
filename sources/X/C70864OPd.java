package X;

/* renamed from: X.OPd  reason: case insensitive filesystem */
public abstract class C70864OPd {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "feed";
            case 2:
                return "deep_link";
            case 3:
                return "saved_collections";
            default:
                return "thread";
        }
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "FEED";
            case 2:
                return "DEEP_LINK";
            case 3:
                return "SAVED_COLLECTIONS";
            default:
                return "THREAD";
        }
    }
}
