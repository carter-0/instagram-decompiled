package X;

/* renamed from: X.Kwm  reason: case insensitive filesystem */
public abstract class C63426Kwm {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "CLOSE_FRIENDS";
            case 2:
                return "FOLLOWERS_ONLY";
            case 3:
                return "OPAL";
            default:
                return "SUBSCRIBERS_ONLY";
        }
    }
}
