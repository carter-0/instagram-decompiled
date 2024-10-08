package X;

public abstract class GOJ {
    /* JADX WARNING: type inference failed for: r0v2, types: [X.GOI, X.3af] */
    public static final GOI A00(2V1 r4) {
        if (r4 != null) {
            C251253mo r1 = new C251253mo("Column");
            r1.A00 = null;
            r1.A01 = null;
            r1.A02 = null;
            r1.A04 = false;
            r1.A03 = null;
            ? r0 = new C244113af(r1, r4, 0);
            r0.A00 = r1;
            return r0;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
