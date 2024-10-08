package X;

/* renamed from: X.O3k  reason: case insensitive filesystem */
public abstract class C70358O3k {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "CONFIG_FETCH_FAILED";
            case 2:
                return "CONFIG_FETCH_SUCCESS";
            case 3:
                return "PING_SKIP";
            case 4:
                return "PING_START";
            case 5:
                return "PING_FAILED";
            case 6:
                return "PING_SUCCESS";
            case 7:
                return "UNEXPECTED_FAILURE";
            default:
                return "CONFIG_FETCH_START";
        }
    }
}
