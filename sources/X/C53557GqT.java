package X;

import java.util.List;

/* renamed from: X.GqT  reason: case insensitive filesystem */
public final class C53557GqT extends AnonymousClass0T0 implements JT1 {
    public final C61083JwL A00;
    public final C61083JwL A01;
    public final C61074JwC A02;
    public final MXZ A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public C53557GqT(C61083JwL jwL, C61083JwL jwL2, C61074JwC jwC, MXZ mxz, List list, boolean z, boolean z2, boolean z3) {
        DbW.A1N(mxz, 1, list);
        0qQ.A0B(jwL, 7);
        this.A03 = mxz;
        this.A07 = z;
        this.A05 = z2;
        this.A06 = z3;
        this.A04 = list;
        this.A02 = jwC;
        this.A01 = jwL;
        this.A00 = jwL2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53557GqT) {
                C53557GqT gqT = (C53557GqT) obj;
                if (!0qQ.A0K(this.A03, gqT.A03) || this.A07 != gqT.A07 || this.A05 != gqT.A05 || this.A06 != gqT.A06 || !0qQ.A0K(this.A04, gqT.A04) || !0qQ.A0K(this.A02, gqT.A02) || !0qQ.A0K(this.A01, gqT.A01) || !0qQ.A0K(this.A00, gqT.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C61074JwC Af7() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ C66460MSo BEX() {
        return this.A03;
    }

    public final boolean CFb() {
        return this.A07;
    }

    public final int hashCode() {
        int A09 = AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A07, AnonymousClass7TE.A0K(this.A03))));
        return AnonymousClass7TF.A07(this.A01, (AnonymousClass7TF.A07(this.A04, A09) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }
}
