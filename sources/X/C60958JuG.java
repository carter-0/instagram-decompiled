package X;

/* renamed from: X.JuG  reason: case insensitive filesystem */
public final class C60958JuG extends AnonymousClass0T0 {
    public C254783t2 A00;
    public final int A01;
    public final Long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    public C60958JuG(C254783t2 r2, Long l, String str, String str2, String str3, int i, boolean z, boolean z2) {
        0qQ.A0B(str2, 3);
        this.A00 = r2;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = z;
        this.A03 = str3;
        this.A01 = i;
        this.A07 = z2;
        this.A02 = l;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60958JuG) {
                C60958JuG juG = (C60958JuG) obj;
                if (!0qQ.A0K(this.A00, juG.A00) || !0qQ.A0K(this.A05, juG.A05) || !0qQ.A0K(this.A04, juG.A04) || this.A06 != juG.A06 || !0qQ.A0K(this.A03, juG.A03) || this.A01 != juG.A01 || this.A07 != juG.A07 || !0qQ.A0K(this.A02, juG.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.A04, ((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31);
        return AnonymousClass7TF.A09(this.A07, (((AnonymousClass7TF.A09(this.A06, A08) + AnonymousClass7TG.A0E(this.A03)) * 31) + this.A01) * 31) + AnonymousClass7TE.A0L(this.A02);
    }
}
