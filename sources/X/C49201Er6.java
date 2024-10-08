package X;

/* renamed from: X.Er6  reason: case insensitive filesystem */
public abstract class C49201Er6 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "HOST";
            case 1:
                return "GUEST";
            case 2:
                return "INVITED";
            case 3:
                return "BRAND_PARTNER";
            case 4:
                return "GUEST_AND_BRAND_PARTNER";
            case 5:
                return "VIEWER";
            case 6:
                return "REQUESTED";
            case 7:
                return "INVITE";
            case 8:
                return "SELF";
            case 9:
                return "ADD_MODERATOR";
            case 10:
                return "SELF_MODERATOR";
            default:
                return "MODERATOR";
        }
    }
}
