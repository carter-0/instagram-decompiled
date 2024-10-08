package X;

/* renamed from: X.Gld  reason: case insensitive filesystem */
public final class C53291Gld extends AnonymousClass0T0 {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final float A05;
    public final float A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53291Gld) {
                C53291Gld gld = (C53291Gld) obj;
                if (!(Float.compare(this.A05, gld.A05) == 0 && this.A01 == gld.A01 && this.A02 == gld.A02 && this.A03 == gld.A03 && this.A04 == gld.A04 && Float.compare(this.A06, gld.A06) == 0 && this.A00 == gld.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A00(AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A02, AnonymousClass7TF.A09(this.A01, G9w.A00(this.A05))))), this.A06) + this.A00;
    }

    public C53291Gld(float f, float f2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A05 = f;
        this.A01 = z;
        this.A02 = z2;
        this.A03 = z3;
        this.A04 = z4;
        this.A06 = f2;
        this.A00 = i;
    }
}
