package X;

/* renamed from: X.JVt  reason: case insensitive filesystem */
public final class C59735JVt implements 02o {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;

    public C59735JVt(0rl r1, 02o r2, int i, long j) {
        this.A00 = i;
        this.A03 = r1;
        this.A01 = j;
        this.A02 = r2;
    }

    public final Object emit(Object obj, AnonymousClass4D7 r10) {
        long currentTimeMillis = System.currentTimeMillis();
        0rl r7 = (0rl) this.A03;
        if (currentTimeMillis - r7.A00 >= this.A01) {
            r7.A00 = currentTimeMillis;
            Object emit = ((02o) this.A02).emit(obj, r10);
            if (emit == 1Hj.A02) {
                return emit;
            }
        }
        return C60340gF.A00;
    }
}
