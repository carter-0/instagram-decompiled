package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class WUE implements C250603lj {
    public C18001Vjd A00;
    public final UserSession A01;
    public final C229932oe A02;
    public final X57 A03;
    public final List A04 = new ArrayList();

    public WUE(UserSession userSession, C229932oe r3, X57 x57) {
        this.A01 = userSession;
        this.A02 = r3;
        this.A03 = x57;
    }

    public final void ATF(AnonymousClass30Y r8, C252093oY r9) {
        AnonymousClass7TG.A1N(r8, r9);
        int A0A = C51968G9o.A0A(r8, r9);
        if (A0A == 0) {
            List list = this.A04;
            Object obj = r8.A03;
            0qQ.A06(obj);
            list.add(obj);
        } else if (A0A == 2) {
            this.A04.remove(r8.A03);
        }
        C18001Vjd vjd = null;
        if (AnonymousClass3OE.A00(this.A01).A00()) {
            float f = 0.0f;
            for (C18001Vjd vjd2 : this.A04) {
                float CFe = r9.CFe(this.A02.A00(vjd2.A01()));
                float f2 = 0.25f;
                if (0.25f < f) {
                    f2 = f;
                }
                if (CFe > f2) {
                    vjd = vjd2;
                    f = CFe;
                }
            }
        }
        if (this.A00 != vjd) {
            this.A00 = vjd;
            this.A03.DIx(vjd);
        }
    }
}
