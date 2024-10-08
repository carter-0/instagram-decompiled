package X;

import com.instagram.user.model.User;

/* renamed from: X.Gm7  reason: case insensitive filesystem */
public final class C53321Gm7 extends AnonymousClass0T0 {
    public final C285975Tl A00;
    public final User A01;
    public final C55817Hnx A02;
    public final YBO A03;
    public final String A04;
    public final String A05;
    public final AnonymousClass62P A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53321Gm7) {
                C53321Gm7 gm7 = (C53321Gm7) obj;
                if (!0qQ.A0K(this.A01, gm7.A01) || !0qQ.A0K(this.A00, gm7.A00) || !0qQ.A0K(this.A03, gm7.A03) || !0qQ.A0K(this.A06, gm7.A06) || this.A07 != gm7.A07 || !0qQ.A0K(this.A04, gm7.A04) || this.A0B != gm7.A0B || !0qQ.A0K(this.A05, gm7.A05) || this.A0A != gm7.A0A || this.A09 != gm7.A09 || !0qQ.A0K(this.A02, gm7.A02) || this.A08 != gm7.A08) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A01);
        int A082 = AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A07(this.A06, (AnonymousClass7TF.A07(this.A00, A0K) + AnonymousClass7TG.A0C(this.A03)) * 31)));
        int A092 = AnonymousClass7TF.A09(this.A0A, (AnonymousClass7TF.A09(this.A0B, A082) + AnonymousClass7TG.A0E(this.A05)) * 31);
        return DbS.A06(this.A08, (AnonymousClass7TF.A09(this.A09, A092) + AnonymousClass7TE.A0L(this.A02)) * 31);
    }

    public C53321Gm7(C285975Tl r1, User user, C55817Hnx hnx, YBO ybo, String str, String str2, AnonymousClass62P r7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A01 = user;
        this.A00 = r1;
        this.A03 = ybo;
        this.A06 = r7;
        this.A07 = z;
        this.A04 = str;
        this.A0B = z2;
        this.A05 = str2;
        this.A0A = z3;
        this.A09 = z4;
        this.A02 = hnx;
        this.A08 = z5;
    }
}
