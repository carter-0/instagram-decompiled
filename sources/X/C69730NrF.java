package X;

/* renamed from: X.NrF  reason: case insensitive filesystem */
public abstract class C69730NrF {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "INSTAGRAM";
                break;
            case 2:
                str = "FACEBOOK_VIDEO";
                break;
            case 3:
                str = "MESSAGING";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        return C51966G9m.A04(str, intValue);
    }
}
