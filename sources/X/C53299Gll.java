package X;

import java.util.List;

/* renamed from: X.Gll  reason: case insensitive filesystem */
public final class C53299Gll extends AnonymousClass0T0 {
    public final int A00;
    public final C62625Kiw A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;
    public final List A07;

    public C53299Gll(C62625Kiw kiw, String str, String str2, List list, List list2, int i, boolean z, boolean z2) {
        AnonymousClass7TF.A1F(list, 4, list2);
        this.A03 = str;
        this.A02 = str2;
        this.A00 = i;
        this.A07 = list;
        this.A01 = kiw;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53299Gll) {
                C53299Gll gll = (C53299Gll) obj;
                if (!0qQ.A0K(this.A03, gll.A03) || !0qQ.A0K(this.A02, gll.A02) || this.A00 != gll.A00 || !0qQ.A0K(this.A07, gll.A07) || this.A01 != gll.A01 || this.A05 != gll.A05 || this.A06 != gll.A06 || !0qQ.A0K(this.A04, gll.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A03);
        return AnonymousClass7TE.A0N(this.A04, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A07, (AnonymousClass7TF.A08(this.A02, A0O) + this.A00) * 31)))));
    }
}
