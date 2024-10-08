package X;

/* renamed from: X.RgX  reason: case insensitive filesystem */
public abstract class C9775RgX {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "UNSUBSCRIBED";
                break;
            case 2:
                str = "SUBSCRIBED";
                break;
            default:
                str = AnonymousClass000.A00(1039);
                break;
        }
        return str.hashCode() + intValue;
    }
}
