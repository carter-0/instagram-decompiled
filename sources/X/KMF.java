package X;

public final class KMF extends L40 {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C61194Jyn A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KMF(C61194Jyn jyn, float f, int i, int i2, int i3) {
        super(i, jyn.A0B);
        0qQ.A0B(jyn, 2);
        this.A01 = i;
        this.A04 = jyn;
        this.A00 = f;
        this.A02 = i2;
        this.A03 = i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KMF) {
                KMF kmf = (KMF) obj;
                if (!(this.A01 == kmf.A01 && 0qQ.A0K(this.A04, kmf.A04) && Float.compare(this.A00, kmf.A00) == 0 && this.A02 == kmf.A02 && this.A03 == kmf.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A00(AnonymousClass7TF.A07(this.A04, this.A01 * 31), this.A00) + this.A02) * 31) + this.A03;
    }
}
