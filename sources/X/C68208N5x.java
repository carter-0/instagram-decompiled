package X;

/* renamed from: X.N5x  reason: case insensitive filesystem */
public final class C68208N5x extends AnonymousClass0T0 implements C232262tL {
    public final 2EM A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68208N5x) {
                C68208N5x n5x = (C68208N5x) obj;
                if (!0qQ.A0K(this.A01, n5x.A01) || !0qQ.A0K(this.A02, n5x.A02) || !0qQ.A0K(this.A03, n5x.A03) || !0qQ.A0K(this.A00, n5x.A00) || this.A05 != n5x.A05 || this.A06 != n5x.A06 || this.A04 != n5x.A04 || this.A07 != n5x.A07) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final int hashCode() {
        return DbS.A06(this.A07, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A01))))))));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C68208N5x n5x = (C68208N5x) obj;
        if (n5x == null || !0qQ.A0K(this.A01, n5x.A01) || !0qQ.A0K(this.A02, n5x.A02) || !0qQ.A0K(this.A03, n5x.A03) || !0qQ.A0K(this.A00, n5x.A00) || this.A05 != n5x.A05 || this.A06 != n5x.A06 || this.A04 != n5x.A04 || this.A07 != n5x.A07) {
            return false;
        }
        return true;
    }

    public C68208N5x(2EM r1, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass7TG.A1U(str, str2, str3);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = r1;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = z3;
        this.A07 = z4;
    }
}
