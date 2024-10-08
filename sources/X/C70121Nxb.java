package X;

/* renamed from: X.Nxb  reason: case insensitive filesystem */
public abstract class C70121Nxb {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "N/A";
            case 1:
                return "UNKNOWN";
            case 2:
                return "FROM_ACCOUNT_SWITCH";
            default:
                return "FROM_COLD_START";
        }
    }
}
