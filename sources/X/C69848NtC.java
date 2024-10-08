package X;

/* renamed from: X.NtC  reason: case insensitive filesystem */
public abstract class C69848NtC {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.5Dg] */
    public static final void A00(C254703su r2, C272074k3 r3, long j) {
        C271374ik r22 = r2.A0e;
        if (r22 != null) {
            int i = 1;
            if (r3 == C272074k3.RAVEN_REPLAYED) {
                i = 2;
            }
            r22.A00 = Math.max(i, r22.A00);
            boolean A1Z = DbW.A1Z(r3);
            ? obj = new Object();
            obj.A01 = j;
            obj.A00 = A1Z ? 1 : 0;
            obj.A02 = r3;
            r22.A03 = obj;
        }
    }
}
