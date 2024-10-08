package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;

/* renamed from: X.JjT  reason: case insensitive filesystem */
public final class C60324JjT extends 2YL implements C74483Pvd {
    public final long A00;
    public final L1U A01;
    public final String A02;
    public final 05G A03;
    public final UserSession A04;
    public final AnonymousClass0Ud A05;

    public C60324JjT(UserSession userSession, L1U l1u, String str, long j) {
        int A032 = DbW.A03(2, str, userSession);
        this.A00 = j;
        this.A02 = str;
        this.A04 = userSession;
        this.A01 = l1u;
        02z A10 = DbS.A10(new N4R(20));
        this.A03 = A10;
        this.A05 = 10b.A03(A10);
        C66182MGt.A02(this, JTR.A0j(A032), C318116oQ.A00(this), 30);
    }

    public final void AJR(C74255Prj prj) {
        Object value;
        N4R n4r;
        0qQ.A0B(prj, 0);
        05G r3 = this.A03;
        do {
            value = r3.getValue();
            n4r = (N4R) value;
        } while (!JTU.A1S(n4r, value, 00k.A0f((Iterable) n4r.A02, prj), r3));
    }

    public final void DMk(String str) {
        Object value;
        N4R n4r;
        0qQ.A0B(str, 0);
        05G r4 = this.A03;
        do {
            value = r4.getValue();
            n4r = (N4R) value;
        } while (!JTU.A1S(n4r, value, 00k.A0T(new C68274N8l(str, 0), (Collection) n4r.A02), r4));
        0Aj A09 = JTU.A09(this.A04);
        A09.AAJ("source", "key_details_page");
        A09.AAJ("security_alert_action", "key_copied_from_alert_details");
        if (A09.isSampled()) {
            A09.Cgf();
        }
    }

    public final AnonymousClass0Ud CB9() {
        return this.A05;
    }

    public final void DGd() {
        Object value;
        N4R n4r;
        05G r6 = this.A03;
        do {
            value = r6.getValue();
            n4r = (N4R) value;
        } while (!JTU.A1S(n4r, value, 00k.A0T(new C68274N8l("https://help.instagram.com/965762990800513/", 1), (Collection) n4r.A02), r6));
    }

    public final void Dro() {
        Object value;
        N4R n4r;
        05G r6 = this.A03;
        do {
            value = r6.getValue();
            n4r = (N4R) value;
        } while (!JTU.A1S(n4r, value, 00k.A0T(new C68274N8l(C66579MXk.A00(875), 1), (Collection) n4r.A02), r6));
    }
}
