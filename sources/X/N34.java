package X;

public final class N34 extends AnonymousClass0T0 {
    public final int A00;
    public final C69480NmO A01;
    public final Boolean A02;
    public final Boolean A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final String A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N34) {
                N34 n34 = (N34) obj;
                if (this.A01 != n34.A01 || this.A00 != n34.A00 || this.A06 != n34.A06 || !0qQ.A0K(this.A04, n34.A04) || !0qQ.A0K(this.A07, n34.A07) || !0qQ.A0K(this.A02, n34.A02) || !0qQ.A0K(this.A03, n34.A03) || !0qQ.A0K(this.A05, n34.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((AnonymousClass7TF.A09(this.A06, (AnonymousClass7TE.A0K(this.A01) + this.A00) * 31) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + C41845B3m.A00(this.A05);
    }

    public N34(C69480NmO nmO, Boolean bool, Boolean bool2, String str, String str2, String str3, int i, boolean z) {
        this.A01 = nmO;
        this.A00 = i;
        this.A06 = z;
        this.A04 = str;
        this.A07 = str2;
        this.A02 = bool;
        this.A03 = bool2;
        this.A05 = str3;
    }
}
