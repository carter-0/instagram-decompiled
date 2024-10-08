package X;

/* renamed from: X.GRx  reason: case insensitive filesystem */
public abstract class C52420GRx {
    public static final int A00(long j, long j2) {
        boolean A1P = AnonymousClass7TF.A1P((int) (j & 4294967295L));
        if (A1P == AnonymousClass7TF.A1P((int) (j2 & 4294967295L))) {
            return (int) Math.signum(C51968G9o.A00(j) - C51968G9o.A00(j2));
        }
        if (A1P) {
            return -1;
        }
        return 1;
    }
}
