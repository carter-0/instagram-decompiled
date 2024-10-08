package X;

/* renamed from: X.Gf2  reason: case insensitive filesystem */
public final class C52928Gf2 extends AnonymousClass2DO {
    public float A00 = 1.0f;
    public C288195bW A01;
    public final long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52928Gf2) {
                long j = this.A02;
                long j2 = ((C52928Gf2) obj).A02;
                long j3 = AnonymousClass5RW.A01;
                if (j == j2) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void A04(AnonymousClass5Q3 r12) {
        long j = this.A02;
        float f = this.A00;
        r12.AQs(this.A01, C289635dw.A00, f, 3, j, 0, C51968G9o.A0H(r12));
    }

    public final boolean A05(float f) {
        this.A00 = f;
        return true;
    }

    public final boolean A06(C288195bW r2) {
        this.A01 = r2;
        return true;
    }

    public final int hashCode() {
        long j = this.A02;
        long j2 = AnonymousClass5RW.A01;
        return C51968G9o.A03(j);
    }

    public C52928Gf2(long j) {
        this.A02 = j;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ColorPainter(color=");
        return AnonymousClass7TG.A0n(AnonymousClass5RW.A06(this.A02), A1A);
    }

    public final long A03() {
        return 9205357640488583168L;
    }
}
