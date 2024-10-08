package X;

/* renamed from: X.Na0  reason: case insensitive filesystem */
public final class C68868Na0 extends C69608Noq {
    public final int A00;
    public final 1iA A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68868Na0) {
                C68868Na0 na0 = (C68868Na0) obj;
                if (!0qQ.A0K(this.A04, na0.A04) || this.A01 != na0.A01 || !0qQ.A0K(this.A02, na0.A02) || !0qQ.A0K(this.A06, na0.A06) || this.A07 != na0.A07 || !0qQ.A0K(this.A03, na0.A03) || !0qQ.A0K(this.A05, na0.A05) || this.A00 != na0.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A04);
        return AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A09(this.A07, (((AnonymousClass7TF.A07(this.A01, A0O) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A06)) * 31))) + this.A00;
    }

    public C68868Na0(1iA r1, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        this.A04 = str;
        this.A01 = r1;
        this.A02 = str2;
        this.A06 = str3;
        this.A07 = z;
        this.A03 = str4;
        this.A05 = str5;
        this.A00 = i;
    }
}
