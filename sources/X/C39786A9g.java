package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.A9g  reason: case insensitive filesystem */
public final class C39786A9g {
    public final C391939tv A00;
    public final AnonymousClass51M A01;
    public final C62320sa A02;

    public C39786A9g(C391939tv r2, AnonymousClass51M r3, C62320sa r4) {
        0qQ.A0B(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public final boolean equals(Object obj) {
        C391939tv r1;
        C39786A9g a9g;
        AnonymousClass51M r3;
        int i;
        int i2;
        C39786A9g a9g2;
        C39786A9g a9g3;
        if (this != obj) {
            if (obj == null || !0qQ.A0K(getClass(), obj.getClass())) {
                return false;
            }
            C391939tv r2 = this.A00;
            boolean z = obj instanceof C39786A9g;
            String str = null;
            if (!z || (a9g3 = (C39786A9g) obj) == null) {
                r1 = null;
            } else {
                r1 = a9g3.A00;
            }
            if (!0qQ.A0K(r2, r1)) {
                return false;
            }
            AnonymousClass51M r4 = this.A01;
            String str2 = r4.A0F.A0F;
            if (z && (a9g2 = (C39786A9g) obj) != null) {
                str = a9g2.A01.A0F.A0F;
            }
            if (!0qQ.A0K(str2, str) || !z || (a9g = (C39786A9g) obj) == null || (i = r4.A09) != (i2 = r3.A09) || r4.A08 - i != (r3 = a9g.A01).A08 - i2) {
                return false;
            }
        }
        return true;
    }

    public final int A00(UserSession userSession) {
        int i;
        C391939tv r1 = this.A00;
        if (0qQ.A0K(r1, C388359nh.A00)) {
            return -1;
        }
        if (r1 instanceof C388339nf) {
            return ((C388339nf) r1).A00;
        }
        if (r1 instanceof C388349ng) {
            int i2 = ((C388349ng) r1).A00;
            AnonymousClass51M r12 = this.A01;
            if (i2 > r12.A08) {
                i = C3495980z.A00(userSession).A01 * 2;
            } else {
                int i3 = r12.A09;
                if (i2 >= i3) {
                    return i2 - i3;
                }
                i = C3495980z.A00(userSession).A01;
            }
            return i + i2;
        }
        throw AnonymousClass7TE.A1K();
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A00) * 31;
        AnonymousClass51M r3 = this.A01;
        int A08 = AnonymousClass7TF.A08(r3.A0F.A0F, A0K);
        int i = r3.A09;
        return ((A08 + i) * 31) + (r3.A08 - i);
    }
}
