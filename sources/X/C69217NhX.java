package X;

/* renamed from: X.NhX  reason: case insensitive filesystem */
public final class C69217NhX extends C62875Knp {
    public final int A00;
    public final 1Xl A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69217NhX) {
                C69217NhX nhX = (C69217NhX) obj;
                if (!0qQ.A0K(this.A02, nhX.A02) || this.A06 != nhX.A06 || this.A00 != nhX.A00 || !0qQ.A0K(this.A01, nhX.A01) || !0qQ.A0K(this.A03, nhX.A03) || !0qQ.A0K(this.A04, nhX.A04) || !0qQ.A0K(this.A05, nhX.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((AnonymousClass7TF.A09(this.A06, AnonymousClass7TE.A0O(this.A02)) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + C41845B3m.A00(this.A05);
    }

    public C69217NhX(1Xl r1, String str, String str2, String str3, String str4, int i, boolean z) {
        this.A02 = str;
        this.A06 = z;
        this.A00 = i;
        this.A01 = r1;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
    }
}
