package X;

import java.util.List;

/* renamed from: X.GqI  reason: case insensitive filesystem */
public final class C53547GqI extends AnonymousClass0T0 implements JM9 {
    public final float A00;
    public final C68150N2q A01;
    public final C68150N2q A02;
    public final String A03;
    public final List A04;
    public final AnonymousClass62P A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C53547GqI(C68150N2q n2q, C68150N2q n2q2, String str, List list, AnonymousClass62P r6, float f, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(r6, 1);
        this.A05 = r6;
        this.A02 = n2q;
        this.A00 = f;
        this.A03 = str;
        this.A04 = list;
        this.A08 = z;
        this.A01 = n2q2;
        this.A06 = z2;
        this.A07 = z3;
    }

    public static /* synthetic */ C53547GqI A00(C53547GqI gqI, String str, List list, float f, int i, boolean z) {
        AnonymousClass62P r5;
        C68150N2q n2q;
        boolean z2;
        boolean z3;
        boolean z4 = z;
        List list2 = list;
        String str2 = str;
        float f2 = f;
        C68150N2q n2q2 = null;
        if ((i & 1) != 0) {
            r5 = gqI.A05;
        } else {
            r5 = null;
        }
        if ((i & 2) != 0) {
            n2q = gqI.A02;
        } else {
            n2q = null;
        }
        if ((i & 4) != 0) {
            f2 = gqI.A00;
        }
        if ((i & 8) != 0) {
            str2 = gqI.A03;
        }
        if ((i & 16) != 0) {
            list2 = gqI.A04;
        }
        if ((i & 32) != 0) {
            z2 = gqI.A08;
        } else {
            z2 = false;
        }
        if ((i & 64) != 0) {
            n2q2 = gqI.A01;
        }
        if ((i & 128) != 0) {
            z3 = gqI.A06;
        } else {
            z3 = false;
        }
        if ((i & 256) != 0) {
            z4 = gqI.A07;
        }
        AnonymousClass7TG.A0w(0, r5, str2, list2);
        return new C53547GqI(n2q, n2q2, str2, list2, r5, f2, z2, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53547GqI) {
                C53547GqI gqI = (C53547GqI) obj;
                if (!0qQ.A0K(this.A05, gqI.A05) || !0qQ.A0K(this.A02, gqI.A02) || Float.compare(this.A00, gqI.A00) != 0 || !0qQ.A0K(this.A03, gqI.A03) || !0qQ.A0K(this.A04, gqI.A04) || this.A08 != gqI.A08 || !0qQ.A0K(this.A01, gqI.A01) || this.A06 != gqI.A06 || this.A07 != gqI.A07) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A00((AnonymousClass7TE.A0K(this.A05) + AnonymousClass7TG.A0C(this.A02)) * 31, this.A00)));
        return DbS.A06(this.A07, AnonymousClass7TF.A09(this.A06, (AnonymousClass7TF.A09(this.A08, A072) + AnonymousClass7TE.A0L(this.A01)) * 31));
    }

    public C53547GqI() {
        this((C68150N2q) null, (C68150N2q) null, "", 0sn.A00, AnonymousClass62Q.A04(C54621HLe.HIDE_PLACES_INTRO, C54621HLe.HIDE_PLACES_RADIUS, C54621HLe.HIDE_PLACES_NAME), 250.0f, false, true, true);
    }
}
