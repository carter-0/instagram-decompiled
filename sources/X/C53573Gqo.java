package X;

/* renamed from: X.Gqo  reason: case insensitive filesystem */
public final class C53573Gqo extends AnonymousClass0T0 implements C59506JMe {
    public final 28D A00;
    public final C266444Yx A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final String A06;

    public C53573Gqo(28D r2, C266444Yx r3, String str, String str2, String str3, String str4, boolean z) {
        0qQ.A0B(str4, 5);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = r3;
        this.A06 = str3;
        this.A04 = str4;
        this.A00 = r2;
        this.A05 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53573Gqo) {
                C53573Gqo gqo = (C53573Gqo) obj;
                if (!0qQ.A0K(this.A02, gqo.A02) || !0qQ.A0K(this.A03, gqo.A03) || !0qQ.A0K(this.A01, gqo.A01) || !0qQ.A0K(this.A06, gqo.A06) || !0qQ.A0K(this.A04, gqo.A04) || this.A00 != gqo.A00 || this.A05 != gqo.A05) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A05, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A08(this.A04, (((((AnonymousClass7TE.A0O(this.A02) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + C41845B3m.A00(this.A06)) * 31)));
    }
}
