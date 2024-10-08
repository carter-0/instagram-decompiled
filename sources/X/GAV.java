package X;

public final class GAV extends AnonymousClass0T0 implements C232272tM {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GAV) {
                GAV gav = (GAV) obj;
                if (!(this.A04 == gav.A04 && this.A02 == gav.A02 && this.A03 == gav.A03 && Float.compare(this.A00, gav.A00) == 0 && this.A01 == gav.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A00((((C51965G9l.A05(this.A04) + this.A02) * 31) + this.A03) * 31, this.A00) + this.A01;
    }

    public GAV(float f, int i, int i2, int i3, boolean z) {
        this.A04 = z;
        this.A02 = i;
        this.A03 = i2;
        this.A00 = f;
        this.A01 = i3;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
