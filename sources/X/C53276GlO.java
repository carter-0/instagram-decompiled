package X;

/* renamed from: X.GlO  reason: case insensitive filesystem */
public final class C53276GlO extends AnonymousClass0T0 {
    public final float A00;
    public final long A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53276GlO) {
                C53276GlO glO = (C53276GlO) obj;
                if (!(this.A03 == glO.A03 && this.A01 == glO.A01 && this.A02 == glO.A02 && Float.compare(this.A00, glO.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51966G9m.A02(AnonymousClass7TF.A09(this.A02, C51972G9s.A07(this.A01, C51965G9l.A05(this.A03))), this.A00);
    }

    public C53276GlO(float f, long j, boolean z, boolean z2) {
        this.A03 = z;
        this.A01 = j;
        this.A02 = z2;
        this.A00 = f;
    }
}
