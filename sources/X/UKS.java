package X;

public final class UKS extends AnonymousClass0T0 {
    public final C276544tV A00;
    public final C277014uI A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UKS) {
                UKS uks = (UKS) obj;
                if (!0qQ.A0K(this.A03, uks.A03) || !0qQ.A0K(this.A04, uks.A04) || !0qQ.A0K(this.A02, uks.A02) || this.A05 != uks.A05 || !0qQ.A0K(this.A01, uks.A01) || !0qQ.A0K(this.A00, uks.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A09(this.A05, ((((AnonymousClass7TG.A0E(this.A03) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + C41845B3m.A00(this.A02)) * 31)));
    }

    public UKS(C276544tV r1, C277014uI r2, String str, String str2, String str3, boolean z) {
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A05 = z;
        this.A01 = r2;
        this.A00 = r1;
    }
}
