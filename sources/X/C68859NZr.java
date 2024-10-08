package X;

/* renamed from: X.NZr  reason: case insensitive filesystem */
public final class C68859NZr extends C69603Nol {
    public final int A00;
    public final int A01;
    public final C61072JwA A02;
    public final C69602Nok A03;
    public final C69602Nok A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68859NZr) {
                C68859NZr nZr = (C68859NZr) obj;
                if (!0qQ.A0K(this.A04, nZr.A04) || !0qQ.A0K(this.A03, nZr.A03) || !0qQ.A0K(this.A02, nZr.A02) || !0qQ.A0K(this.A05, nZr.A05) || this.A01 != nZr.A01 || this.A00 != nZr.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0K(this.A04)) + AnonymousClass7TG.A0C(this.A02)) * 31) + C41845B3m.A00(this.A05)) * 31) + this.A01) * 31) + this.A00;
    }

    public C68859NZr(C61072JwA jwA, C69602Nok nok, C69602Nok nok2, String str, int i, int i2) {
        this.A04 = nok;
        this.A03 = nok2;
        this.A02 = jwA;
        this.A05 = str;
        this.A01 = i;
        this.A00 = i2;
    }
}
