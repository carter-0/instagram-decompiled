package X;

/* renamed from: X.N2l  reason: case insensitive filesystem */
public final class C68145N2l extends AnonymousClass0T0 {
    public final long A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68145N2l) {
                C68145N2l n2l = (C68145N2l) obj;
                if (!0qQ.A0K(this.A03, n2l.A03) || !0qQ.A0K(this.A01, n2l.A01) || !0qQ.A0K(this.A02, n2l.A02) || this.A00 != n2l.A00 || this.A04 != n2l.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A04, C51972G9s.A07(this.A00, AnonymousClass7TF.A08(this.A02, (AnonymousClass7TE.A0O(this.A03) + AnonymousClass7TG.A0C(this.A01)) * 31)));
    }

    public C68145N2l(Long l, String str, String str2, long j, boolean z) {
        this.A03 = str;
        this.A01 = l;
        this.A02 = str2;
        this.A00 = j;
        this.A04 = z;
    }
}
