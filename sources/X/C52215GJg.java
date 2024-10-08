package X;

/* renamed from: X.GJg  reason: case insensitive filesystem */
public final class C52215GJg implements C229222n2 {
    public static final C52215GJg A00 = new C52215GJg();

    public final String BK2(AnonymousClass30Y r5) {
        String str;
        String str2;
        1Xj r0;
        0qQ.A0B(r5, 0);
        C267324bN r3 = (C267324bN) r5.A03;
        if (r3 == null || (str = r3.A06().A0j) == null) {
            str = "";
        }
        String hexString = Integer.toHexString(str.hashCode());
        if (r3 == null || (r0 = r3.A02) == null) {
            str2 = null;
        } else {
            str2 = r0.getId();
        }
        return 002.A0T(hexString, str2, '_');
    }
}
