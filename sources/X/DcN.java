package X;

public final class DcN extends AnonymousClass0T0 implements C232272tM {
    public final int A00;
    public final int A01;
    public final int A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DcN) {
                DcN dcN = (DcN) obj;
                if (!(this.A02 == dcN.A02 && this.A00 == dcN.A00 && this.A04 == dcN.A04 && this.A03 == dcN.A03 && this.A01 == dcN.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A04, ((this.A02 * 31) + this.A00) * 31)) + this.A01;
    }

    public DcN(int i, int i2, int i3, boolean z, boolean z2) {
        this.A02 = i;
        this.A00 = i2;
        this.A04 = z;
        this.A03 = z2;
        this.A01 = i3;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
