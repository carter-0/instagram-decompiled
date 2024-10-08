package X;

/* renamed from: X.9DG  reason: invalid class name */
public abstract class AnonymousClass9DG {
    public final boolean A00() {
        long j;
        boolean z = ((AnonymousClass9DF) this) instanceof AnonymousClass9DE;
        0JN A01 = 0JN.A01();
        if (z) {
            j = 52428800;
        } else {
            j = 10485760;
        }
        0JN.A03(A01);
        long A05 = A01.A05();
        boolean z2 = true;
        if (A05 > 0 && A05 >= j) {
            z2 = false;
        }
        return !z2;
    }
}
