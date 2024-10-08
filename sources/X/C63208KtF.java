package X;

/* renamed from: X.KtF  reason: case insensitive filesystem */
public abstract class C63208KtF {
    public static final C62658KkK A00(C47169Drk drk) {
        Integer num = drk.A02;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0 || intValue == 2 || intValue == 3) {
                return C62658KkK.CCP;
            }
            if (intValue == 1) {
                return C62658KkK.CCP_FOR_UNLINKED;
            }
            if (intValue == 4) {
                return C62658KkK.XAR;
            }
        }
        return C62658KkK.A04;
    }
}
