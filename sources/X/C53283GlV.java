package X;

/* renamed from: X.GlV  reason: case insensitive filesystem */
public final class C53283GlV extends AnonymousClass0T0 {
    public final String A00;
    public final String A01;
    public final AnonymousClass62P A02;
    public final AnonymousClass62P A03;
    public final int A04;
    public final int A05;

    public C53283GlV(String str, String str2, AnonymousClass62P r4, AnonymousClass62P r5, int i, int i2) {
        0qQ.A0B(r4, 1);
        this.A03 = r4;
        this.A05 = i;
        this.A00 = str;
        this.A04 = i2;
        this.A01 = str2;
        this.A02 = r5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53283GlV) {
                C53283GlV glV = (C53283GlV) obj;
                if (!0qQ.A0K(this.A03, glV.A03) || this.A05 != glV.A05 || !0qQ.A0K(this.A00, glV.A00) || this.A04 != glV.A04 || !0qQ.A0K(this.A01, glV.A01) || !0qQ.A0K(this.A02, glV.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        return AnonymousClass7TF.A08(this.A01, (AnonymousClass7TF.A08(str, (AnonymousClass7TE.A0K(this.A03) + this.A05) * 31) + this.A04) * 31) + AnonymousClass7TG.A0C(this.A02);
    }
}
