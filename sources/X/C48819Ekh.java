package X;

/* renamed from: X.Ekh  reason: case insensitive filesystem */
public abstract class C48819Ekh {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        if (1 != intValue) {
            str = "ONE_TAP_SEND";
        } else {
            str = "MULTI_SELECT";
        }
        return str.hashCode() + intValue;
    }
}
