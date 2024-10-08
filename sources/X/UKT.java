package X;

public final class UKT extends AnonymousClass0T0 {
    public final int A00;
    public final C61065Jw3 A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public UKT(C61065Jw3 jw3, String str, String str2, String str3, String str4, int i) {
        0qQ.A0B(str, 1);
        this.A05 = str;
        this.A04 = str2;
        this.A01 = jw3;
        this.A00 = i;
        this.A02 = str3;
        this.A03 = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UKT) {
                UKT ukt = (UKT) obj;
                if (!0qQ.A0K(this.A05, ukt.A05) || !0qQ.A0K(this.A04, ukt.A04) || !0qQ.A0K(this.A01, ukt.A01) || this.A00 != ukt.A00 || !0qQ.A0K(this.A02, ukt.A02) || !0qQ.A0K(this.A03, ukt.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AnonymousClass7TF.A07(this.A01, (AnonymousClass7TE.A0O(this.A05) + AnonymousClass7TG.A0E(this.A04)) * 31) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A03);
    }
}
