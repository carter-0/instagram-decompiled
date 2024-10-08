package X;

/* renamed from: X.Kql  reason: case insensitive filesystem */
public abstract class C63056Kql {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "InProgress";
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
