package X;

/* renamed from: X.CkF  reason: case insensitive filesystem */
public abstract class C44746CkF {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "User";
                break;
            case 2:
                str = "Foursquare";
                break;
            default:
                str = AnonymousClass000.A00(2518);
                break;
        }
        return str.hashCode() + intValue;
    }
}
