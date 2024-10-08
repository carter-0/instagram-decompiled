package X;

public final class KMI extends L0V {
    public final int A00;
    public final int A01;
    public final int A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KMI) {
                KMI kmi = (KMI) obj;
                if (!(this.A03 == kmi.A03 && this.A04 == kmi.A04 && this.A05 == kmi.A05 && this.A00 == kmi.A00 && Float.compare(20.0f, 20.0f) == 0 && this.A02 == kmi.A02 && this.A01 == kmi.A01 && this.A06 == kmi.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public KMI(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        super(AnonymousClass05K.A0C);
        this.A03 = z;
        this.A04 = z2;
        this.A05 = z3;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A06 = z4;
    }

    public final int hashCode() {
        int A09 = AnonymousClass7TF.A09(this.A04, C51965G9l.A05(this.A03));
        return DbS.A06(this.A06, (((AnonymousClass7TF.A00((AnonymousClass7TF.A09(this.A05, A09) + this.A00) * 31, 20.0f) + this.A02) * 31) + this.A01) * 31);
    }
}
