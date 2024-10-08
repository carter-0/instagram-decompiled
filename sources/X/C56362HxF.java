package X;

/* renamed from: X.HxF  reason: case insensitive filesystem */
public abstract class C56362HxF {
    public static String A01(Integer num) {
        if (num == null) {
            return "null";
        }
        switch (num.intValue()) {
            case 1:
                return "CENTER";
            case 2:
                return "END";
            default:
                return "START";
        }
    }

    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "CENTER";
                break;
            case 2:
                str = "END";
                break;
            default:
                str = "START";
                break;
        }
        return C51966G9m.A04(str, intValue);
    }
}
