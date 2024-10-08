package X;

public abstract class GIO {
    public static final String A00(C295365o2 r0) {
        if (r0 == null) {
            return "unknown";
        }
        switch (r0.ordinal()) {
            case 0:
                return "organic";
            case 1:
                return "ad_preview";
            case 2:
                return "ad";
            case 3:
                return "multiads";
            case 4:
                return "midcard";
            case 5:
                return "qpmidcard";
            case 6:
                return "survey";
            case 7:
                return "unavailable";
            case 8:
                return "ghost";
            default:
                return "unknown";
        }
    }
}
