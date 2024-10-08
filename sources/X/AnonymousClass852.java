package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.852  reason: invalid class name */
public final class AnonymousClass852 implements AnonymousClass851 {
    public final C357638Yz A00;
    public final UserSession A01;

    public final C359248cL AND(AnonymousClass9J8 r12, AnonymousClass84D r13) {
        C359218cI[] r0;
        String str;
        0qQ.A0B(r13, 0);
        0qQ.A0B(r12, 1);
        C357638Yz r1 = this.A00;
        if (!r1.A0Q()) {
            if (r1.A0Q()) {
                str = AnonymousClass8YC.A01(r13);
            } else {
                str = null;
            }
            return new C378439Pu(C359208cH.A01(r12, r13), str);
        }
        String A012 = AnonymousClass8YC.A01(r13);
        C359218cI A013 = C359208cH.A01(r12, r13);
        C359218cI A002 = C359208cH.A00(r12);
        if (0qQ.A0K(A002.A01, "SAVED")) {
            r0 = new C359218cI[]{C359218cI.A0I, C359208cH.A00(new AnonymousClass9J8(AnonymousClass849.A08, "FOR_YOU"))};
        } else {
            r0 = new C359218cI[]{C359218cI.A0I, A002};
        }
        return new C359238cK(A013, (Integer) null, A012, 0sr.A1P(r0), 3, true);
    }

    public final boolean Aki() {
        return !(!this.A00.A0Q());
    }

    public final Integer B0K() {
        return AnonymousClass05K.A01;
    }

    public final boolean Bu9() {
        return !(!this.A00.A0Q());
    }

    public final boolean BuC() {
        return !this.A00.A0Q();
    }

    public final boolean Buj() {
        return true;
    }

    public final boolean But() {
        return false;
    }

    public AnonymousClass852(UserSession userSession, C357638Yz r2) {
        this.A01 = userSession;
        this.A00 = r2;
    }
}
