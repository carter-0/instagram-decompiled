package X;

import java.util.List;

/* renamed from: X.GqU  reason: case insensitive filesystem */
public final class C53558GqU extends AnonymousClass0T0 implements JT1 {
    public final C61083JwL A00;
    public final C61083JwL A01;
    public final C66570MXa A02;
    public final String A03;
    public final List A04;
    public final List A05;
    public final boolean A06;
    public final C61074JwC A07;
    public final boolean A08 = true;

    public C53558GqU(C61083JwL jwL, C61083JwL jwL2, C61074JwC jwC, C66570MXa mXa, String str, List list, List list2, boolean z) {
        C51973G9u.A0r(1, mXa, str, list);
        AnonymousClass7TF.A1F(list2, 7, jwL);
        this.A02 = mXa;
        this.A06 = z;
        this.A03 = str;
        this.A04 = list;
        this.A07 = jwC;
        this.A05 = list2;
        this.A01 = jwL;
        this.A00 = jwL2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53558GqU) {
                C53558GqU gqU = (C53558GqU) obj;
                if (!0qQ.A0K(this.A02, gqU.A02) || this.A08 != gqU.A08 || this.A06 != gqU.A06 || !0qQ.A0K(this.A03, gqU.A03) || !0qQ.A0K(this.A04, gqU.A04) || !0qQ.A0K(this.A07, gqU.A07) || !0qQ.A0K(this.A05, gqU.A05) || !0qQ.A0K(this.A01, gqU.A01) || !0qQ.A0K(this.A00, gqU.A00)) {
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
        return this.A08;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A08, AnonymousClass7TE.A0K(this.A02))));
        return AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A05, (AnonymousClass7TF.A07(this.A04, A082) + AnonymousClass7TG.A0C(this.A07)) * 31)) + AnonymousClass7TE.A0L(this.A00);
    }
}
