package X;

public abstract class GQU {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.5af, java.lang.Object, X.5ae] */
    public static final C287955b5 A00(float f, float f2) {
        C287805an r2 = C287765aj.A02;
        Float valueOf = Float.valueOf(f);
        ? obj = new Object();
        obj.A00 = f2;
        return new C287955b5(obj, r2, valueOf, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.5af, java.lang.Object, X.5ae] */
    public static /* synthetic */ C287955b5 A01(C287955b5 r9, float f, float f2, int i) {
        long j = 0;
        long j2 = 0;
        boolean z = false;
        if ((i & 1) != 0) {
            f = AnonymousClass7TE.A04(r9.getValue());
        }
        if ((i & 2) != 0) {
            f2 = ((C287715ae) r9.A02).A00;
        }
        if ((i & 4) != 0) {
            j = r9.A01;
        }
        if ((i & 8) != 0) {
            j2 = r9.A00;
        }
        if ((i & 16) != 0) {
            z = r9.A03;
        }
        C287805an r2 = r9.A04;
        Float valueOf = Float.valueOf(f);
        ? obj = new Object();
        obj.A00 = f2;
        return new C287955b5(obj, r2, valueOf, j, j2, z);
    }
}
