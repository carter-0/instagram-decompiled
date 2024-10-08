package X;

/* renamed from: X.GlY  reason: case insensitive filesystem */
public final class C53286GlY extends AnonymousClass0T0 {
    public final float A00 = 5.0f;
    public final float A01 = 25.0f;
    public final float A02 = 5.0f;
    public final float A03;
    public final float A04;
    public final long A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53286GlY) {
                C53286GlY glY = (C53286GlY) obj;
                if (C289095d0.A01(this.A01, glY.A01) && C289095d0.A01(this.A02, glY.A02) && C289095d0.A01(this.A00, glY.A00)) {
                    long j = this.A05;
                    long j2 = glY.A05;
                    long j3 = AnonymousClass5RW.A01;
                    if (j != j2 || !C289095d0.A01(this.A03, glY.A03) || !C289095d0.A01(this.A04, glY.A04)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C53286GlY() {
        long j = AnonymousClass5RW.A09;
        this.A05 = j;
        this.A03 = 15.0f;
        this.A04 = 30.0f;
    }

    public final int hashCode() {
        int A002 = AnonymousClass7TF.A00(AnonymousClass7TF.A00(G9w.A00(this.A01), this.A02), this.A00);
        long j = this.A05;
        long j2 = AnonymousClass5RW.A01;
        int A003 = AnonymousClass7TF.A00(AnonymousClass7TF.A00(C51972G9s.A07(j, A002), this.A03), this.A04);
        int A004 = C54732HQn.A00();
        return ((A003 + A004) * 31) + A004;
    }
}
