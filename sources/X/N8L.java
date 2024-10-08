package X;

public final class N8L extends AnonymousClass0T0 implements AnonymousClass7FW {
    public final int A00;
    public final int A01;
    public final String A02;
    public final 2FW A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N8L) {
                N8L n8l = (N8L) obj;
                if (!(0qQ.A0K(this.A02, n8l.A02) && this.A03 == n8l.A03 && this.A00 == n8l.A00 && this.A01 == n8l.A01 && this.A04 == n8l.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A02);
        return DbS.A06(this.A04, (((AnonymousClass7TF.A07(this.A03, A0O) + this.A00) * 31) + this.A01) * 31);
    }

    public N8L(2FW r1, String str, int i, int i2, boolean z) {
        this.A02 = str;
        this.A03 = r1;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = z;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
