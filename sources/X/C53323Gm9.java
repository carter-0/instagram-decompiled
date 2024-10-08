package X;

import java.util.List;

/* renamed from: X.Gm9  reason: case insensitive filesystem */
public final class C53323Gm9 extends AnonymousClass0T0 {
    public final N49 A00;
    public final BBL A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final C61059Jvx A09;
    public final String A0A;
    public final List A0B;
    public final boolean A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53323Gm9) {
                C53323Gm9 gm9 = (C53323Gm9) obj;
                if (!0qQ.A0K(this.A09, gm9.A09) || !0qQ.A0K(this.A01, gm9.A01) || this.A06 != gm9.A06 || this.A0C != gm9.A0C || this.A07 != gm9.A07 || !0qQ.A0K(this.A00, gm9.A00) || !0qQ.A0K(this.A05, gm9.A05) || this.A08 != gm9.A08 || !0qQ.A0K(this.A0B, gm9.A0B) || !0qQ.A0K(this.A0A, gm9.A0A) || !0qQ.A0K(this.A02, gm9.A02) || !0qQ.A0K(this.A03, gm9.A03) || !0qQ.A0K(this.A04, gm9.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TF.A07(this.A0B, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A09(this.A06, ((AnonymousClass7TG.A0C(this.A09) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31))))))) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + C41845B3m.A00(this.A04);
    }

    public C53323Gm9(C61059Jvx jvx, N49 n49, BBL bbl, String str, String str2, String str3, String str4, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4) {
        C51972G9s.A1E(n49, list);
        0qQ.A0B(list2, 9);
        this.A09 = jvx;
        this.A01 = bbl;
        this.A06 = z;
        this.A0C = z2;
        this.A07 = z3;
        this.A00 = n49;
        this.A05 = list;
        this.A08 = z4;
        this.A0B = list2;
        this.A0A = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
    }
}
