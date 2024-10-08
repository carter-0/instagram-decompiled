package X;

/* renamed from: X.Ju5  reason: case insensitive filesystem */
public final class C60947Ju5 extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AnonymousClass8Q2 A04;
    public final C349307zv A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60947Ju5) {
                C60947Ju5 ju5 = (C60947Ju5) obj;
                if (!(0qQ.A0K(this.A05, ju5.A05) && this.A02 == ju5.A02 && this.A01 == ju5.A01 && this.A00 == ju5.A00 && this.A03 == ju5.A03 && 0qQ.A0K(this.A04, ju5.A04))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((AnonymousClass7TG.A0C(this.A05) * 31) + this.A02) * 31) + this.A01) * 31) + this.A00) * 31) + this.A03) * 31) + AnonymousClass7TE.A0L(this.A04);
    }

    public C60947Ju5(AnonymousClass8Q2 r1, C349307zv r2, int i, int i2, int i3, int i4) {
        this.A05 = r2;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A03 = i4;
        this.A04 = r1;
    }
}
