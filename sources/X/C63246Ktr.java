package X;

/* renamed from: X.Ktr  reason: case insensitive filesystem */
public abstract class C63246Ktr {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "LOADED";
                break;
            case 2:
                str = "ERROR";
                break;
            case 3:
                str = "UNINITIALIZED";
                break;
            default:
                str = "LOADING";
                break;
        }
        return C51966G9m.A04(str, intValue);
    }
}
