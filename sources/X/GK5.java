package X;

import com.instagram.common.session.UserSession;

public final class GK5 extends AnonymousClass0T0 implements JP3 {
    public final int A00;
    public final int A01;
    public final C267324bN A02;
    public final C266444Yx A03;
    public final 1Xj A04;
    public final GK4 A05;
    public final C59512JMk A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final int A0B;
    public final UserSession A0C;
    public final AnonymousClass3W1 A0D;
    public final GJ2 A0E;

    public GK5(C267324bN r2, C266444Yx r3, UserSession userSession, 1Xj r5, AnonymousClass3W1 r6, GJ2 gj2, GK4 gk4, C59512JMk jMk, String str, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(str, 4);
        0qQ.A0B(jMk, 7);
        this.A0C = userSession;
        this.A00 = i;
        this.A01 = i2;
        this.A07 = str;
        this.A03 = r3;
        this.A0E = gj2;
        this.A06 = jMk;
        this.A09 = z;
        this.A0A = z2;
        this.A08 = z3;
        this.A0B = i3;
        this.A05 = gk4;
        this.A02 = r2;
        this.A04 = r5;
        this.A0D = r6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GK5) {
                GK5 gk5 = (GK5) obj;
                if (!0qQ.A0K(this.A0C, gk5.A0C) || this.A00 != gk5.A00 || this.A01 != gk5.A01 || !0qQ.A0K(this.A07, gk5.A07) || !0qQ.A0K(this.A03, gk5.A03) || this.A0E != gk5.A0E || !0qQ.A0K(this.A06, gk5.A06) || this.A09 != gk5.A09 || this.A0A != gk5.A0A || this.A08 != gk5.A08 || this.A0B != gk5.A0B || !0qQ.A0K(this.A05, gk5.A05) || !0qQ.A0K(this.A02, gk5.A02) || !0qQ.A0K(this.A04, gk5.A04) || !0qQ.A0K(this.A0D, gk5.A0D)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int BXC() {
        return this.A0B;
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A07(this.A06, AnonymousClass7TF.A07(this.A0E, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A08(this.A07, (((AnonymousClass7TE.A0K(this.A0C) + this.A00) * 31) + this.A01) * 31))))));
        return AnonymousClass7TE.A0N(this.A0D, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A05, (AnonymousClass7TF.A09(this.A08, A092) + this.A0B) * 31))));
    }
}
