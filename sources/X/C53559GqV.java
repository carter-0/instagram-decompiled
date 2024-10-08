package X;

import java.util.List;

/* renamed from: X.GqV  reason: case insensitive filesystem */
public final class C53559GqV extends AnonymousClass0T0 implements JT1 {
    public final C61083JwL A00;
    public final C61083JwL A01;
    public final C66570MXa A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final boolean A06;
    public final C61074JwC A07;
    public final List A08;
    public final boolean A09 = true;

    public C53559GqV(C61083JwL jwL, C61083JwL jwL2, C61074JwC jwC, C66570MXa mXa, String str, String str2, List list, List list2, boolean z) {
        C51973G9u.A0r(1, mXa, str, list);
        C51974G9v.A1Q(jwL, list2, jwL2, str2);
        this.A02 = mXa;
        this.A06 = z;
        this.A04 = str;
        this.A08 = list;
        this.A07 = jwC;
        this.A00 = jwL;
        this.A05 = list2;
        this.A01 = jwL2;
        this.A03 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53559GqV) {
                C53559GqV gqV = (C53559GqV) obj;
                if (!0qQ.A0K(this.A02, gqV.A02) || this.A09 != gqV.A09 || this.A06 != gqV.A06 || !0qQ.A0K(this.A04, gqV.A04) || !0qQ.A0K(this.A08, gqV.A08) || !0qQ.A0K(this.A07, gqV.A07) || !0qQ.A0K(this.A00, gqV.A00) || !0qQ.A0K(this.A05, gqV.A05) || !0qQ.A0K(this.A01, gqV.A01) || !0qQ.A0K(this.A03, gqV.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C61074JwC Af7() {
        return this.A07;
    }

    public final /* bridge */ /* synthetic */ C66460MSo BEX() {
        return this.A02;
    }

    public final boolean CFb() {
        return this.A09;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A09, AnonymousClass7TE.A0K(this.A02))));
        return C41845B3m.A01(this.A03, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A00, (AnonymousClass7TF.A07(this.A08, A082) + AnonymousClass7TG.A0C(this.A07)) * 31))));
    }
}
