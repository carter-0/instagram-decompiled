package X;

/* renamed from: X.Jts  reason: case insensitive filesystem */
public final class C60934Jts extends AnonymousClass0T0 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final long A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60934Jts) {
                C60934Jts jts = (C60934Jts) obj;
                if (!(Float.compare(this.A01, jts.A01) == 0 && Float.compare(this.A02, jts.A02) == 0 && this.A04 == jts.A04 && Float.compare(this.A00, jts.A00) == 0 && this.A03 == jts.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A00(C51972G9s.A07(this.A04, AnonymousClass7TF.A00(Float.floatToIntBits(this.A01) * 31, this.A02)), this.A00) + this.A03;
    }

    public C60934Jts(float f, float f2, float f3, int i, long j) {
        this.A01 = f;
        this.A02 = f2;
        this.A04 = j;
        this.A00 = f3;
        this.A03 = i;
    }
}
