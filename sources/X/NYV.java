package X;

public final class NYV extends AnonymousClass7FV implements AnonymousClass7FW {
    public final int A00;
    public final int A01;
    public final AnonymousClass7FT A02;
    public final 2FW A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NYV) {
                NYV nyv = (NYV) obj;
                if (!(0qQ.A0K(this.A04, nyv.A04) && this.A00 == nyv.A00 && this.A01 == nyv.A01 && this.A05 == nyv.A05 && 0qQ.A0K(this.A02, nyv.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A04);
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A09(this.A05, (((AnonymousClass7TF.A07(this.A03, A0O) + this.A00) * 31) + this.A01) * 31));
    }

    public NYV(AnonymousClass7FT r1, 2FW r2, String str, int i, int i2, boolean z) {
        super(r1);
        this.A04 = str;
        this.A03 = r2;
        this.A00 = i;
        this.A01 = i2;
        this.A05 = z;
        this.A02 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
