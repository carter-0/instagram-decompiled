package X;

/* renamed from: X.KPr  reason: case insensitive filesystem */
public final class C61878KPr extends C62790KmS {
    public final 1Xj A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61878KPr) {
                C61878KPr kPr = (C61878KPr) obj;
                if (!0qQ.A0K(this.A00, kPr.A00) || !0qQ.A0K(this.A03, kPr.A03) || !0qQ.A0K(this.A02, kPr.A02) || !0qQ.A0K(this.A01, kPr.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, (((AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0E(this.A03)) * 31) + C41845B3m.A00(this.A02)) * 31);
    }

    public C61878KPr(1Xj r1, String str, String str2, String str3) {
        C51972G9s.A1B(r1, str3);
        this.A00 = r1;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
    }
}
