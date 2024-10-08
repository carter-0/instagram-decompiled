package X;

/* renamed from: X.KpL  reason: case insensitive filesystem */
public abstract class C62969KpL {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "Prompted";
                break;
            case 2:
                str = AnonymousClass000.A00(2100);
                break;
            case 3:
                str = "Declined";
                break;
            default:
                str = "NotPrompted";
                break;
        }
        return C51966G9m.A04(str, intValue);
    }
}
