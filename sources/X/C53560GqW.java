package X;

import java.util.List;

/* renamed from: X.GqW  reason: case insensitive filesystem */
public final class C53560GqW extends AnonymousClass0T0 implements JT1 {
    public final long A00;
    public final long A01;
    public final C61074JwC A02;
    public final C62489Kge A03;
    public final MXZ A04;
    public final C66570MXa A05;
    public final String A06;
    public final YCQ A07;
    public final boolean A08;
    public final boolean A09;
    public final List A0A;
    public final boolean A0B = true;

    public C53560GqW(C61074JwC jwC, C62489Kge kge, MXZ mxz, C66570MXa mXa, String str, List list, YCQ ycq, long j, long j2, boolean z, boolean z2) {
        DbW.A1N(mXa, 1, list);
        0qQ.A0B(mxz, 11);
        this.A05 = mXa;
        this.A08 = z;
        this.A06 = str;
        this.A0A = list;
        this.A02 = jwC;
        this.A09 = z2;
        this.A01 = j;
        this.A00 = j2;
        this.A07 = ycq;
        this.A04 = mxz;
        this.A03 = kge;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53560GqW) {
                C53560GqW gqW = (C53560GqW) obj;
                if (!0qQ.A0K(this.A05, gqW.A05) || this.A0B != gqW.A0B || this.A08 != gqW.A08 || !0qQ.A0K(this.A06, gqW.A06) || !0qQ.A0K(this.A0A, gqW.A0A) || !0qQ.A0K(this.A02, gqW.A02) || this.A09 != gqW.A09 || this.A01 != gqW.A01 || this.A00 != gqW.A00 || !0qQ.A0K(this.A07, gqW.A07) || !0qQ.A0K(this.A04, gqW.A04) || this.A03 != gqW.A03) {
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
        return this.A05;
    }

    public final boolean CFb() {
        return this.A0B;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A0B, AnonymousClass7TE.A0K(this.A05))));
        return AnonymousClass7TE.A0N(this.A03, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A07, AnonymousClass7TF.A01(this.A00, AnonymousClass7TF.A01(this.A01, AnonymousClass7TF.A09(this.A09, (AnonymousClass7TF.A07(this.A0A, A082) + AnonymousClass7TG.A0C(this.A02)) * 31))))));
    }
}
