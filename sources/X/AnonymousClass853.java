package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.853  reason: invalid class name */
public final class AnonymousClass853 implements AnonymousClass851 {
    public final C357638Yz A00;
    public final UserSession A01;

    public final C359248cL AND(AnonymousClass9J8 r11, AnonymousClass84D r12) {
        String str;
        0qQ.A0B(r12, 0);
        0qQ.A0B(r11, 1);
        C357638Yz r1 = this.A00;
        if (!r1.A0Q()) {
            if (r1.A0Q()) {
                str = AnonymousClass8YC.A01(r12);
            } else {
                str = null;
            }
            return new C378439Pu(C359208cH.A01(r11, r12), str);
        }
        return new C359238cK(C359208cH.A01(r11, r12), 25, AnonymousClass8YC.A01(r12), 0sr.A1P(new C359218cI[]{C359218cI.A05, C359218cI.A04}), 6, true);
    }

    public final boolean Aki() {
        if (!(!this.A00.A0Q())) {
            if (!182.A06(0Tu.A05, this.A01, 36327533469252086L)) {
                return false;
            }
            return true;
        }
        return false;
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

    public AnonymousClass853(UserSession userSession, C357638Yz r2) {
        this.A01 = userSession;
        this.A00 = r2;
    }
}
