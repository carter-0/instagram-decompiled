package X;

/* renamed from: X.Gmm  reason: case insensitive filesystem */
public final class C53362Gmm extends AnonymousClass0T0 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53362Gmm) {
                C53362Gmm gmm = (C53362Gmm) obj;
                if (!(this.A04 == gmm.A04 && this.A03 == gmm.A03 && Float.compare(this.A00, gmm.A00) == 0 && Float.compare(this.A01, gmm.A01) == 0 && Float.compare(this.A02, gmm.A02) == 0 && this.A06 == gmm.A06 && this.A05 == gmm.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A05, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(((this.A04 * 31) + this.A03) * 31, this.A00), this.A01), this.A02)));
    }

    public C53362Gmm(float f, float f2, float f3, int i, int i2, boolean z, boolean z2) {
        this.A04 = i;
        this.A03 = i2;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A06 = z;
        this.A05 = z2;
    }

    public C53362Gmm() {
        this(0.0f, 0.0f, 0.0f, 0, 0, true, true);
    }
}
