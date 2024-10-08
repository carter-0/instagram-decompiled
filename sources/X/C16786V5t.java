package X;

/* renamed from: X.V5t  reason: case insensitive filesystem */
public abstract class C16786V5t {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "ON_VISIBLE";
            case 1:
                return "ON_INVISIBLE";
            case 2:
                return "ON_FOCUSED";
            case 3:
                return "ON_UNFOCUSED";
            case 4:
                return "ON_FULL_IMPRESSION";
            case 5:
                return "ON_VISIBILITY_CHANGED";
            default:
                return "VISIBILITY";
        }
    }
}
