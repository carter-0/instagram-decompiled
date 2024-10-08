package X;

public abstract class O2F {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.4DU, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.OUG, java.lang.Object] */
    public static final C69221Nhb A00(String str) {
        0qQ.A0B(str, 0);
        C69221Nhb nhb = C69221Nhb.A02;
        if (0qQ.A0K(C69221Nhb.A01, str) && nhb != null) {
            return nhb;
        }
        C69221Nhb nhb2 = new C69221Nhb(new Object(), new Object(), str);
        C69221Nhb.A02 = nhb2;
        C69221Nhb.A01 = str;
        return nhb2;
    }
}
