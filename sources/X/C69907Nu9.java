package X;

/* renamed from: X.Nu9  reason: case insensitive filesystem */
public abstract class C69907Nu9 {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "FAILED";
                break;
            case 2:
                str = "FAILED_PERMANENT";
                break;
            case 3:
                str = "UPLOADED";
                break;
            default:
                str = "PENDING";
                break;
        }
        return C51966G9m.A04(str, intValue);
    }
}
