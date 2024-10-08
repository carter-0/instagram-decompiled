package X;

import java.util.List;

/* renamed from: X.N2z  reason: case insensitive filesystem */
public final class C68159N2z extends AnonymousClass0T0 {
    public final int A00;
    public final long A01;
    public final O63 A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68159N2z) {
                C68159N2z n2z = (C68159N2z) obj;
                if (this.A01 != n2z.A01 || !0qQ.A0K(this.A04, n2z.A04) || !0qQ.A0K(this.A02, n2z.A02) || !0qQ.A0K(this.A03, n2z.A03) || this.A00 != n2z.A00 || this.A06 != n2z.A06 || !0qQ.A0K(this.A05, n2z.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A08(this.A04, C51975G9x.A03(this.A01)));
        return AnonymousClass7TE.A0N(this.A05, AnonymousClass7TF.A09(this.A06, (AnonymousClass7TF.A08(this.A03, A07) + this.A00) * 31));
    }

    public C68159N2z(O63 o63, String str, String str2, List list, int i, long j, boolean z) {
        C51972G9s.A1C(str, str2);
        this.A01 = j;
        this.A04 = str;
        this.A02 = o63;
        this.A03 = str2;
        this.A00 = i;
        this.A06 = z;
        this.A05 = list;
    }
}
