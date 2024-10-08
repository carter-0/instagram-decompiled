package X;

import java.util.List;

/* renamed from: X.Gmq  reason: case insensitive filesystem */
public final class C53366Gmq extends AnonymousClass0T0 {
    public final C66377MPj A00;
    public final C66378MPk A01;
    public final C66379MPl A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final Boolean A0F;
    public final String A0G;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53366Gmq) {
                C53366Gmq gmq = (C53366Gmq) obj;
                if (!0qQ.A0K(this.A06, gmq.A06) || !0qQ.A0K(this.A00, gmq.A00) || !0qQ.A0K(this.A02, gmq.A02) || !0qQ.A0K(this.A01, gmq.A01) || !0qQ.A0K(this.A0G, gmq.A0G) || this.A0D != gmq.A0D || this.A0C != gmq.A0C || this.A09 != gmq.A09 || !0qQ.A0K(this.A04, gmq.A04) || this.A0B != gmq.A0B || !0qQ.A0K(this.A07, gmq.A07) || !0qQ.A0K(this.A08, gmq.A08) || !0qQ.A0K(this.A03, gmq.A03) || this.A0A != gmq.A0A || !0qQ.A0K(this.A05, gmq.A05) || !0qQ.A0K(this.A0F, gmq.A0F) || this.A0E != gmq.A0E) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A06)));
        int A092 = AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A09(this.A0D, (AnonymousClass7TF.A07(this.A01, A072) + AnonymousClass7TG.A0E(this.A0G)) * 31));
        int A082 = AnonymousClass7TF.A08(this.A07, AnonymousClass7TF.A09(this.A0B, (AnonymousClass7TF.A09(this.A09, A092) + AnonymousClass7TG.A0C(this.A04)) * 31));
        boolean z = this.A0A;
        return DbS.A06(this.A0E, (((AnonymousClass7TF.A09(z, (AnonymousClass7TF.A07(this.A08, A082) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A0F)) * 31);
    }

    public C53366Gmq(C66377MPj mPj, C66378MPk mPk, C66379MPl mPl, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2, String str3, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C51974G9v.A1P(str, mPj, mPl, mPk);
        this.A06 = str;
        this.A00 = mPj;
        this.A02 = mPl;
        this.A01 = mPk;
        this.A0G = str2;
        this.A0D = z;
        this.A0C = z2;
        this.A09 = z3;
        this.A04 = bool;
        this.A0B = z4;
        this.A07 = str3;
        this.A08 = list;
        this.A03 = bool2;
        this.A0A = z5;
        this.A05 = bool3;
        this.A0F = bool4;
        this.A0E = z6;
    }

    public C53366Gmq() {
        this(C64475Lcc.A00, C64477Lce.A00, C64478Lcf.A00, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, "", (String) null, "", 0sn.A00, false, false, false, false, false, false);
    }
}
