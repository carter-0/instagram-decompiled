package X;

/* renamed from: X.Kqm  reason: case insensitive filesystem */
public abstract class C63057Kqm {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "Loading";
                break;
            case 2:
                str = "Success";
                break;
            case 3:
                str = "Idle";
                break;
            default:
                str = "Error";
                break;
        }
        return C51966G9m.A04(str, intValue);
    }
}
