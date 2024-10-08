package X;

public final class S9F {
    public static final String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "topTouchEnd";
            case 2:
                return "topTouchMove";
            case 3:
                return "topTouchCancel";
            default:
                return "topTouchStart";
        }
    }
}
